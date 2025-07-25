// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation.handler;

import com.azure.core.amqp.ProxyAuthenticationType;
import com.azure.core.amqp.ProxyOptions;
import com.azure.core.amqp.implementation.AmqpErrorCode;
import com.azure.core.amqp.implementation.AmqpMetricsProvider;
import com.azure.core.amqp.implementation.ConnectionOptions;
import com.azure.core.util.CoreUtils;
import com.microsoft.azure.proton.transport.proxy.ProxyHandler;
import com.microsoft.azure.proton.transport.proxy.impl.ProxyHandlerImpl;
import com.microsoft.azure.proton.transport.proxy.impl.ProxyImpl;
import org.apache.qpid.proton.amqp.transport.ConnectionError;
import org.apache.qpid.proton.amqp.transport.ErrorCondition;
import org.apache.qpid.proton.engine.Connection;
import org.apache.qpid.proton.engine.Event;
import org.apache.qpid.proton.engine.SslPeerDetails;
import org.apache.qpid.proton.engine.Transport;
import org.apache.qpid.proton.engine.impl.TransportInternal;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.azure.core.amqp.implementation.AmqpLoggingUtils.addErrorCondition;
import static com.azure.core.amqp.implementation.ClientConstants.HOSTNAME_KEY;

/**
 * Creates an AMQP connection using web sockets and connects through a proxy.
 */
public class WebSocketsProxyConnectionHandler extends WebSocketsConnectionHandler {
    private static final String HTTPS_URI_FORMAT = "https://%s:%s";

    private final InetSocketAddress proxyHostAddress;
    private final ProxyOptions proxyOptions;
    private final String fullyQualifiedNamespace;
    /**
     * The value of 'hostname:port' field for the 'HTTP CONNECT hostname:port HTTP/1.1'
     * request to the Proxy.
     * e.g.
     *   CONNECT &lt;eventubs-namespace&gt;.servicebus.windows.net:443 HTTP/1.1 <br>
     *   CONNECT order-events.contoso.com:443 HTTP/1.1 <br>
     *   CONNECT shipping-events.contoso.com:200 HTTP/1.1 <br>
     *
     * The 'hostname' addresses the target host to which the HTTP Proxy server should forward
     * the connection. It is usually the FQDN of the Event Hubs or Service Bus, or the host
     * part of CustomEndpointAddress when a custom endpoint frontends the Event Hubs
     * or Service Bus.
     */
    private final String connectHostnameAndPort;
    private final ProxyImpl proxy;

    /**
     * Creates a handler that handles proton-j's connection through a proxy using web sockets.
     * The hostname of the proxy is exposed in {@link #getHostname()}.
     *
     * @param connectionId Identifier for this connection.
     * @param connectionOptions Options used when creating the connection.
     * @param proxyOptions The options to use for proxy.
     * @param peerDetails The peer details for this connection.
     * @param metricsProvider The AMQP metrics provider.
     * @throws NullPointerException if {@code amqpHostname} or {@code proxyConfiguration} is null.
     * @throws IllegalStateException if a proxy address is unavailable for the given {@code proxyOptions}.
     */
    public WebSocketsProxyConnectionHandler(String connectionId, ConnectionOptions connectionOptions,
        ProxyOptions proxyOptions, SslPeerDetails peerDetails, AmqpMetricsProvider metricsProvider) {
        super(connectionId, connectionOptions, peerDetails, metricsProvider);

        this.proxyOptions = Objects.requireNonNull(proxyOptions, "'proxyConfiguration' cannot be null.");
        this.fullyQualifiedNamespace = connectionOptions.getFullyQualifiedNamespace();
        this.connectHostnameAndPort = connectionOptions.getHostname() + ":" + connectionOptions.getPort();

        if (proxyOptions.isProxyAddressConfigured()) {
            this.proxyHostAddress = (InetSocketAddress) proxyOptions.getProxyAddress().address();
        } else {
            final URI serviceUri = createURI(connectionOptions.getHostname(), connectionOptions.getPort());
            final ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector == null) {
                throw logger.logExceptionAsError(new IllegalStateException("ProxySelector should not be null."));
            }

            final List<Proxy> proxies = proxySelector.select(serviceUri);
            if (!isProxyAddressLegal(proxies)) {
                final String formatted = String.format("No proxy address found for: '%s'. Available: %s.", serviceUri,
                    proxies.stream().map(Proxy::toString).collect(Collectors.joining(", ")));

                throw logger.logExceptionAsError(new IllegalStateException(formatted));
            }

            final Proxy proxy = proxies.get(0);
            this.proxyHostAddress = (InetSocketAddress) proxy.address();
        }

        if (proxyOptions == ProxyOptions.SYSTEM_DEFAULTS) {
            this.proxy = new ProxyImpl();
        } else {
            this.proxy = new ProxyImpl(getProtonConfiguration());
        }
    }

    /**
     * Looks through system defined proxies to see if one should be used for connecting to the message broker.
     *
     * @param hostname Hostname for the AMQP connection.
     * @param port Port to connect to.
     *
     * @return {@code true} if a proxy should be used to connect to the AMQP message broker and null otherwise.
     */
    public static boolean shouldUseProxy(final String hostname, final int port) {
        Objects.requireNonNull(hostname, "'hostname' cannot be null.");

        final URI uri = createURI(hostname, port);
        final ProxySelector proxySelector = ProxySelector.getDefault();
        if (proxySelector == null) {
            return false;
        }

        final List<Proxy> proxies = proxySelector.select(uri);
        return isProxyAddressLegal(proxies);
    }

    @Override
    public void transferState(ConnectionHandler fromHandler) {
        if (fromHandler instanceof WebSocketsProxyConnectionHandler) {
            final WebSocketsProxyConnectionHandler wsHandler = (WebSocketsProxyConnectionHandler) fromHandler;
            final ProxyImpl fromProxy = wsHandler.proxy;
            this.proxy.transferState(fromProxy);
        }
        super.transferState(fromHandler);
    }

    /**
     * Gets the hostname for the proxy.
     *
     * @return The hostname for the proxy.
     */
    @Override
    public String getHostname() {
        return proxyHostAddress.getHostString();
    }

    /**
     * Gets the port for the proxy.
     *
     * @return The port for the proxy.
     */
    @Override
    public int getProtocolPort() {
        return proxyHostAddress.getPort();
    }

    @Override
    public void onTransportError(Event event) {
        super.onTransportError(event);

        final Transport transport = event.getTransport();
        final Connection connection = event.getConnection();
        if (connection == null || transport == null) {
            logger.verbose("There is no connection or transport associated with error. Event: {}", event);
            return;
        }

        final ErrorCondition errorCondition = transport.getCondition();
        if (errorCondition == null
            || !(errorCondition.getCondition().equals(ConnectionError.FRAMING_ERROR)
                || errorCondition.getCondition().equals(AmqpErrorCode.PROTON_IO_ERROR))) {
            addErrorCondition(logger.atVerbose(), errorCondition)
                .log("There is no error condition and these are not framing errors.");
            return;
        }

        final String hostname = event.getReactor().getConnectionAddress(connection);

        // If the proxy is not configured, or we are not connected to a host yet.
        if (proxyOptions == null || CoreUtils.isNullOrEmpty(hostname)) {
            addErrorCondition(logger.atVerbose(), errorCondition)
                .log("Proxy is not configured and there is no host connected.");
            return;
        }

        final String[] hostNameParts = hostname.split(":");
        if (hostNameParts.length != 2) {
            logger.warning("Invalid hostname: {}", hostname);
            return;
        }

        int port;
        try {
            port = Integer.parseInt(hostNameParts[1]);
        } catch (NumberFormatException ignore) {
            logger.warning("Invalid port number: {}", hostNameParts[1]);
            return;
        }

        // since proton library communicates all errors based on amqp-error-condition
        // it swallows the IOException and translates it to proton-io errorCode
        // we reconstruct the IOException in this case - but, callstack is lost
        final IOException ioException = new IOException(errorCondition.getDescription());
        final URI url = createURI(fullyQualifiedNamespace, port);
        final InetSocketAddress address = new InetSocketAddress(hostNameParts[0], port);

        logger.atWarning()
            .addKeyValue("url", url)
            .addKeyValue("proxyHost", address.getHostString())
            .log("Failed to connect.", ioException);

        final ProxySelector proxySelector = ProxySelector.getDefault();
        if (proxySelector != null) {
            proxySelector.connectFailed(url, address, ioException);
        }
    }

    @Override
    protected void addTransportLayers(final Event event, final TransportInternal transport) {
        super.addTransportLayers(event, transport);

        final ProxyHandler proxyHandler = new ProxyHandlerImpl();
        proxy.configure(connectHostnameAndPort, null, proxyHandler, transport);

        transport.addTransportLayer(proxy);

        logger.atInfo().addKeyValue(HOSTNAME_KEY, connectHostnameAndPort).log("addProxyHandshake");
    }

    private com.microsoft.azure.proton.transport.proxy.ProxyConfiguration getProtonConfiguration() {
        final com.microsoft.azure.proton.transport.proxy.ProxyAuthenticationType type
            = getProtonAuthType(proxyOptions.getAuthentication());
        final String username
            = proxyOptions.hasUserDefinedCredentials() ? proxyOptions.getCredential().getUserName() : null;
        final String password
            = proxyOptions.hasUserDefinedCredentials() ? new String(proxyOptions.getCredential().getPassword()) : null;

        return new com.microsoft.azure.proton.transport.proxy.ProxyConfiguration(type, proxyOptions.getProxyAddress(),
            username, password);
    }

    private com.microsoft.azure.proton.transport.proxy.ProxyAuthenticationType
        getProtonAuthType(ProxyAuthenticationType type) {
        switch (type) {
            case DIGEST:
                return com.microsoft.azure.proton.transport.proxy.ProxyAuthenticationType.DIGEST;

            case BASIC:
                return com.microsoft.azure.proton.transport.proxy.ProxyAuthenticationType.BASIC;

            case NONE:
                return com.microsoft.azure.proton.transport.proxy.ProxyAuthenticationType.NONE;

            default:
                throw logger.logExceptionAsError(new IllegalArgumentException(
                    String.format("This authentication type is unknown: %s", type.name())));
        }
    }

    private static URI createURI(final String hostname, final int port) {
        return URI.create(String.format(Locale.ROOT, HTTPS_URI_FORMAT, hostname, port));
    }

    /**
     * This always selects the first proxy in the list instead of going through all the available ones.
     *
     * @param proxies List of proxies available.
     *
     * @return {@code true} if the first proxy in the list is an HTTP proxy and is an IP address.
     */
    private static boolean isProxyAddressLegal(final List<Proxy> proxies) {
        // we look only at the first proxy in the list
        // if the proxy can be translated to InetSocketAddress
        // only then - can we parse it to hostName and Port
        // which is required by qpid-proton-j library reactor.connectToHost() API
        return proxies != null
            && !proxies.isEmpty()
            && proxies.get(0).type() == Proxy.Type.HTTP
            && proxies.get(0).address() != null
            && proxies.get(0).address() instanceof InetSocketAddress;
    }
}
