// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.implementation;

import com.azure.core.amqp.AmqpConnection;
import com.azure.core.amqp.AmqpRetryMode;
import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.amqp.AmqpRetryPolicy;
import com.azure.core.amqp.ClaimsBasedSecurityNode;
import com.azure.core.amqp.FixedAmqpRetryPolicy;
import com.azure.core.amqp.exception.AmqpResponseCode;
import com.azure.core.amqp.implementation.AmqpConstants;
import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.amqp.implementation.ProtonSessionWrapper;
import com.azure.core.amqp.implementation.ReactorDispatcher;
import com.azure.core.amqp.implementation.ReactorHandlerProvider;
import com.azure.core.amqp.implementation.ReactorProvider;
import com.azure.core.amqp.implementation.TokenManager;
import com.azure.core.amqp.implementation.TokenManagerProvider;
import com.azure.core.amqp.implementation.handler.SendLinkHandler;
import com.azure.core.amqp.implementation.handler.SessionHandler;
import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.messaging.Accepted;
import org.apache.qpid.proton.amqp.messaging.Source;
import org.apache.qpid.proton.amqp.messaging.Target;
import org.apache.qpid.proton.amqp.transport.SenderSettleMode;
import org.apache.qpid.proton.engine.Delivery;
import org.apache.qpid.proton.engine.EndpointState;
import org.apache.qpid.proton.engine.Record;
import org.apache.qpid.proton.engine.Sender;
import org.apache.qpid.proton.engine.Session;
import org.apache.qpid.proton.reactor.Reactor;
import org.apache.qpid.proton.reactor.Selectable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;
import reactor.test.StepVerifier;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

/**
 * Test for {@link ServiceBusReactorSession}.
 */
public class ServiceBusReactorSessionTest {
    private static final ClientLogger LOGGER = new ClientLogger(ServiceBusReactorSessionTest.class);
    private final AmqpRetryOptions retryOptions
        = new AmqpRetryOptions().setTryTimeout(Duration.ofSeconds(5)).setMode(AmqpRetryMode.FIXED).setMaxRetries(1);
    private final AmqpRetryPolicy retryPolicy = new FixedAmqpRetryPolicy(retryOptions);

    private static final String CONNECTION_ID = "test-connection-id";
    private static final String HOSTNAME = "test-event-hub.servicebus.windows.net/";
    private static final Symbol LINK_TRANSFER_DESTINATION_PROPERTY
        = Symbol.getSymbol(AmqpConstants.VENDOR + ":transfer-destination-address");
    private static final String SESSION_NAME = "sessionName";
    private static final String ENTITY_PATH = "entityPath";
    private static final String VIA_ENTITY_PATH = "viaEntityPath";
    private static final String VIA_ENTITY_PATH_SENDER_LINK_NAME = "VIA-" + VIA_ENTITY_PATH;
    private static final String CLIENT_IDENTIFIER = "clientIdentifier";

    @Mock
    private Reactor reactor;
    @Mock
    private Selectable selectable;
    @Mock
    private TokenManagerProvider tokenManagerProvider;
    @Mock
    private MessageSerializer messageSerializer;
    @Mock
    private ReactorProvider reactorProvider;
    @Mock
    private ReactorHandlerProvider handlerProvider;
    @Mock
    private Session session;
    @Mock
    Mono<ClaimsBasedSecurityNode> cbsNodeSupplier;
    @Mock
    private TokenManager tokenManagerViaQueue;
    @Mock
    private TokenManager tokenManagerEntity;
    @Mock
    private SessionHandler handler;
    @Mock
    private Sender senderEntity;
    @Mock
    private Sender senderViaEntity;
    @Mock
    private Record record;
    private SendLinkHandler sendEntityLinkHandler;
    @Captor
    private ArgumentCaptor<Runnable> dispatcherCaptor;
    @Mock
    private ReactorDispatcher dispatcher;
    @Mock
    private AmqpConnection connection;

    private ServiceBusReactorSession serviceBusReactorSession;
    private final ServiceBusAmqpLinkProvider linkProvider = new ServiceBusAmqpLinkProvider();

    @BeforeEach
    void setup(TestInfo testInfo) {
        LOGGER.info("[{}] Setting up.", testInfo.getDisplayName());

        MockitoAnnotations.initMocks(this);
        when(tokenManagerEntity.getAuthorizationResults()).thenReturn(Flux.just(AmqpResponseCode.ACCEPTED));
        when(tokenManagerViaQueue.getAuthorizationResults()).thenReturn(Flux.just(AmqpResponseCode.ACCEPTED));

        doNothing().when(selectable).setChannel(any());
        doNothing().when(selectable).onReadable(any());
        doNothing().when(selectable).onFree(any());
        doNothing().when(selectable).setReading(true);
        doNothing().when(reactor).update(selectable);
        when(reactor.selectable()).thenReturn(selectable);

        final Sinks.Many<EndpointState> endpointStates
            = Sinks.many().replay().latestOrDefault(EndpointState.UNINITIALIZED);
        when(handler.getEndpointStates()).thenReturn(endpointStates.asFlux());
        endpointStates.emitNext(EndpointState.ACTIVE, Sinks.EmitFailureHandler.FAIL_FAST);
        when(handler.getSessionName()).thenReturn(SESSION_NAME);
        when(handler.getHostname()).thenReturn(HOSTNAME);
        when(handler.getConnectionId()).thenReturn(CONNECTION_ID);

        Delivery delivery = mock(Delivery.class);
        when(delivery.getRemoteState()).thenReturn(Accepted.getInstance());
        when(delivery.getTag()).thenReturn("tag".getBytes());

        SendLinkHandler sendViaEntityLinkHandler = new SendLinkHandler("", "", "", "", null) {
            @Override
            public Flux<Delivery> getDeliveredMessages() {
                return Flux.just(delivery);
            }

            @Override
            public Flux<Integer> getLinkCredits() {
                return Flux.just(100);
            }

            @Override
            public Flux<EndpointState> getEndpointStates() {
                return endpointStates.asFlux();
            }
        };
        sendEntityLinkHandler = new SendLinkHandler("", "", "", "", null) {
            @Override
            public Flux<Delivery> getDeliveredMessages() {
                return Flux.just(delivery);
            }

            @Override
            public Flux<Integer> getLinkCredits() {
                return Flux.just(100);
            }

            @Override
            public Flux<EndpointState> getEndpointStates() {
                return endpointStates.asFlux();
            }
        };
        when(handlerProvider.createSendLinkHandler(CONNECTION_ID, HOSTNAME, VIA_ENTITY_PATH_SENDER_LINK_NAME,
            VIA_ENTITY_PATH)).thenReturn(sendViaEntityLinkHandler);
        when(handlerProvider.createSendLinkHandler(CONNECTION_ID, HOSTNAME, ENTITY_PATH, ENTITY_PATH))
            .thenReturn(sendEntityLinkHandler);

        when(tokenManagerProvider.getTokenManager(cbsNodeSupplier, VIA_ENTITY_PATH)).thenReturn(tokenManagerViaQueue);
        when(tokenManagerProvider.getTokenManager(cbsNodeSupplier, ENTITY_PATH)).thenReturn(tokenManagerEntity);

        when(tokenManagerEntity.getAuthorizationResults()).thenReturn(Flux.just(AmqpResponseCode.ACCEPTED));
        when(tokenManagerEntity.authorize()).thenReturn(Mono.just(1L));
        when(tokenManagerViaQueue.authorize()).thenReturn(Mono.just(1L));

        when(session.sender(VIA_ENTITY_PATH_SENDER_LINK_NAME)).thenReturn(senderViaEntity);
        when(session.sender(ENTITY_PATH)).thenReturn(senderEntity);
        doNothing().when(session).open();
        doNothing().when(senderViaEntity).setSource(any(Source.class));
        doNothing().when(senderEntity).setSource(any(Source.class));

        doNothing().when(senderViaEntity).setSenderSettleMode(SenderSettleMode.UNSETTLED);
        doNothing().when(senderEntity).setSenderSettleMode(SenderSettleMode.UNSETTLED);

        doNothing().when(senderViaEntity).setTarget(any(Target.class));
        doNothing().when(senderEntity).setTarget(any(Target.class));
        when(senderEntity.attachments()).thenReturn(record);
        when(senderViaEntity.attachments()).thenReturn(record);

        when(reactorProvider.getReactorDispatcher()).thenReturn(dispatcher);

        when(connection.getShutdownSignals()).thenReturn(Flux.empty());
        // TODO (anu): use 'ProtonSession' instead of 'ProtonSessionWrapper' and update the test.
        final ProtonSessionWrapper sessionWrapper = new ProtonSessionWrapper(session, handler, reactorProvider);

        serviceBusReactorSession
            = new ServiceBusReactorSession(connection, sessionWrapper, handlerProvider, linkProvider, cbsNodeSupplier,
                tokenManagerProvider, messageSerializer, retryOptions, new ServiceBusCreateSessionOptions(false), true);
        when(connection.getShutdownSignals()).thenReturn(Flux.never());
    }

    @AfterEach
    void teardown(TestInfo testInfo) {
        LOGGER.info("[{}] Tearing down.", testInfo.getDisplayName());

        Mockito.framework().clearInlineMock(this);
    }

    /**
     * Test for create Sender Link when via-queue is used.
     */
    @Test
    void createViaSenderLink() throws IOException {
        // Arrange
        doNothing().when(dispatcher).invoke(any(Runnable.class));

        // Act
        serviceBusReactorSession
            .createProducer(VIA_ENTITY_PATH_SENDER_LINK_NAME, VIA_ENTITY_PATH, retryOptions.getTryTimeout(),
                retryPolicy, ENTITY_PATH, CLIENT_IDENTIFIER)
            .subscribe();

        // Assert
        verify(tokenManagerEntity).authorize();
        verify(tokenManagerViaQueue).authorize();

        verify(dispatcher).invoke(dispatcherCaptor.capture());
        List<Runnable> invocations = dispatcherCaptor.getAllValues();

        // Apply the invocation.
        invocations.get(0).run();

        verify(senderViaEntity)
            .setProperties(argThat(linkProperties -> ((String) linkProperties.get(LINK_TRANSFER_DESTINATION_PROPERTY))
                .equalsIgnoreCase(ENTITY_PATH)));
    }

    /**
     * Test for create Sender Link when via-queue is used but `transferEntityPath` authorization fails.
     */
    @Test
    void createViaSenderLinkDestinationEntityAuthorizeFails() throws IOException {
        // Arrange
        final Throwable authorizeError = new RuntimeException("Failed to Authorize EntityPath");
        doNothing().when(dispatcher).invoke(any(Runnable.class));
        when(tokenManagerEntity.authorize()).thenReturn(Mono.error(authorizeError));

        // Act
        StepVerifier
            .create(serviceBusReactorSession.createProducer(VIA_ENTITY_PATH_SENDER_LINK_NAME, VIA_ENTITY_PATH,
                retryOptions.getTryTimeout(), retryPolicy, ENTITY_PATH, CLIENT_IDENTIFIER))
            .expectError(RuntimeException.class)
            .verify(Duration.ofSeconds(60));

        // Assert
        verify(tokenManagerEntity).authorize();
        verify(tokenManagerViaQueue).authorize();
        verifyNoInteractions(dispatcher);
    }

    /**
     * Test for create Sender Link.
     */
    @Test
    void createSenderLink() throws IOException {
        // Arrange
        doNothing().when(dispatcher).invoke(any(Runnable.class));

        // Act
        serviceBusReactorSession.createProducer(ENTITY_PATH, ENTITY_PATH, retryOptions.getTryTimeout(), retryPolicy)
            .subscribe();

        // Assert
        verify(tokenManagerEntity).authorize();
        verify(tokenManagerViaQueue, never()).authorize();

        verify(dispatcher).invoke(dispatcherCaptor.capture());
        List<Runnable> invocations = dispatcherCaptor.getAllValues();

        // Apply the invocation.
        invocations.get(0).run();

        verify(senderViaEntity, never()).setProperties(anyMap());
    }

    /**
     * Test for create Sender Link.
     */
    @Test
    void createCoordinatorLink() throws IOException {
        // Arrange
        final String transactionLinkName = "coordinator";
        final Sender coordinatorSenderEntity = mock(Sender.class);
        doNothing().when(coordinatorSenderEntity).setSource(any(Source.class));
        doNothing().when(coordinatorSenderEntity).setSenderSettleMode(SenderSettleMode.UNSETTLED);
        doNothing().when(coordinatorSenderEntity).setTarget(any(Target.class));
        doNothing().when(coordinatorSenderEntity).setTarget(any(Target.class));
        when(coordinatorSenderEntity.attachments()).thenReturn(record);
        when(session.sender(transactionLinkName)).thenReturn(coordinatorSenderEntity);
        // TODO (anu): use 'ProtonSession' instead of 'ProtonSessionWrapper' and update the test.
        final ProtonSessionWrapper sessionWrapper = new ProtonSessionWrapper(session, handler, reactorProvider);

        final ServiceBusReactorSession serviceBusReactorSession
            = new ServiceBusReactorSession(connection, sessionWrapper, handlerProvider, linkProvider, cbsNodeSupplier,
                tokenManagerProvider, messageSerializer, retryOptions, new ServiceBusCreateSessionOptions(true), true);

        when(handlerProvider.createSendLinkHandler(CONNECTION_ID, HOSTNAME, transactionLinkName, transactionLinkName))
            .thenReturn(sendEntityLinkHandler);

        // Act
        serviceBusReactorSession.getOrCreateTransactionCoordinator().subscribe();

        // Assert
        verify(tokenManagerEntity, never()).authorize();

        verify(dispatcher).invoke(dispatcherCaptor.capture());
        List<Runnable> invocations = dispatcherCaptor.getAllValues();

        // Apply the invocation.
        invocations.get(0).run();

        verify(coordinatorSenderEntity).open();
        verify(session).sender(transactionLinkName);
    }
}
