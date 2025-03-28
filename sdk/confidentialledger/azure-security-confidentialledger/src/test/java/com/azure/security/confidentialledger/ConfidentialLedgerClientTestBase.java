// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.test.models.TestProxyRecordingOptions;
import com.azure.core.test.models.TestProxySanitizer;
import com.azure.core.test.models.TestProxySanitizerType;
import com.azure.core.util.BinaryData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.logging.LogLevel;
import com.azure.identity.AzurePowerShellCredentialBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.json.models.JsonElement;
import com.azure.json.models.JsonObject;
import com.azure.json.models.JsonString;
import com.azure.security.confidentialledger.certificate.ConfidentialLedgerCertificateClient;
import com.azure.security.confidentialledger.certificate.ConfidentialLedgerCertificateClientBuilder;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import org.junit.jupiter.api.Assertions;
import reactor.core.publisher.Mono;

import javax.net.ssl.SSLException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConfidentialLedgerClientTestBase extends TestProxyTestBase {
    private static final ClientLogger LOGGER = new ClientLogger(ConfidentialLedgerClientTestBase.class);

    protected static final String TRANSACTION_ID = "transactionId";
    protected static final String COLLECTION_ID = "collectionId";
    protected static final BinaryData BINARY_DATA
        = BinaryData.fromString("{\"contents\":\"New ledger entry contents.\"}");

    protected ConfidentialLedgerClient confidentialLedgerClient;
    protected ConfidentialLedgerClientBuilder confidentialLedgerClientBuilder;
    protected ConfidentialLedgerCertificateClient confidentialLedgerCertificateClient;

    @Override
    protected void beforeTest() {
        ConfidentialLedgerCertificateClientBuilder confidentialLedgerCertificateClientBuilder
            = new ConfidentialLedgerCertificateClientBuilder()
                .certificateEndpoint(ConfidentialLedgerEnvironment.getConfidentialLedgerIdentityUrl())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY));

        if (getTestMode() == TestMode.PLAYBACK) {
            confidentialLedgerCertificateClientBuilder.httpClient(interceptorManager.getPlaybackClient())
                .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
            addSanitizers();
        } else if (getTestMode() == TestMode.RECORD) {
            confidentialLedgerCertificateClientBuilder.addPolicy(interceptorManager.getRecordPolicy())
                .credential(new DefaultAzureCredentialBuilder().build());
            addSanitizers();
        } else if (getTestMode() == TestMode.LIVE) {
            confidentialLedgerCertificateClientBuilder.credential(new AzurePowerShellCredentialBuilder().build());

        }

        confidentialLedgerCertificateClient = confidentialLedgerCertificateClientBuilder.buildClient();

        Response<BinaryData> ledgerIdentityWithResponse = confidentialLedgerCertificateClient
            .getLedgerIdentityWithResponse(ConfidentialLedgerEnvironment.getConfidentialLedgerName(), null);
        BinaryData identityResponse = ledgerIdentityWithResponse.getValue();

        JsonObject jsonObject = identityResponse.toObject(JsonObject.class);
        String ledgerTlsCertificate = ((JsonString) jsonObject.getProperty("ledgerTlsCertificate")).getValue();
        String body = ledgerTlsCertificate.replace("\n", "").replace("\r", "");
        if (getTestMode() == TestMode.RECORD) {
            interceptorManager.setProxyRecordingOptions(new TestProxyRecordingOptions()
                .setTransportOptions(new TestProxyRecordingOptions.ProxyTransport().settLSValidationCert(body)));
        }

        reactor.netty.http.client.HttpClient reactorClient = null;

        try {
            SslContext sslContext = SslContextBuilder.forClient()
                .trustManager(new ByteArrayInputStream(ledgerTlsCertificate.getBytes(StandardCharsets.UTF_8)))
                .build();
            reactorClient = reactor.netty.http.client.HttpClient.create()
                .secure(sslContextSpec -> sslContextSpec.sslContext(sslContext));
        } catch (SSLException ex) {
            LOGGER.log(LogLevel.VERBOSE, () -> "Caught SSL exception", ex);
            Assertions.fail();
        }

        HttpClient httpClient = new NettyAsyncHttpClientBuilder(reactorClient).wiretap(true).build();

        confidentialLedgerClientBuilder = new ConfidentialLedgerClientBuilder()
            .ledgerEndpoint(ConfidentialLedgerEnvironment.getConfidentialLedgerUrl())
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));

        if (getTestMode() == TestMode.PLAYBACK) {
            confidentialLedgerClientBuilder.httpClient(interceptorManager.getPlaybackClient())
                .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
            addSanitizers();
        } else if (getTestMode() == TestMode.RECORD) {
            confidentialLedgerClientBuilder.addPolicy(interceptorManager.getRecordPolicy())
                .httpClient(httpClient)
                .credential(new DefaultAzureCredentialBuilder().build());
            addSanitizers();
        } else if (getTestMode() == TestMode.LIVE) {
            confidentialLedgerClientBuilder.credential(new DefaultAzureCredentialBuilder().build())
                .httpClient(httpClient);
        }
        confidentialLedgerClient = confidentialLedgerClientBuilder.buildClient();
    }

    private void addSanitizers() {
        interceptorManager.addSanitizers(Arrays.asList(
            new TestProxySanitizer("(?<=/ledgerIdentity/)([^/?]+)", "java-sdk-live-tests-ledger",
                TestProxySanitizerType.URL),
            new TestProxySanitizer("(?<=/app/users/)([^/?]+)", "d958292f-5b70-4b66-9502-562217cc7eaa",
                TestProxySanitizerType.URL)));
    }

    /**
     * Posts and asserts that an entry was added.  Useful for tests that require a ledger entry.
     *
     * @return The transaction id associated with the ledger entry.
     */
    protected String postLedgerEntry() throws IOException {
        // Arrange
        final RequestOptions options = new RequestOptions();
        final String contents = BINARY_DATA.toString();

        // Act
        final Response<BinaryData> response
            = confidentialLedgerClient.createLedgerEntryWithResponse(BINARY_DATA, options);

        // Assert
        assertEquals(200, response.getStatusCode());

        JsonObject jsonObject = response.getValue().toObject(JsonObject.class);
        JsonElement collectionIdNode = jsonObject.getProperty("collectionId");

        assertNotNull(collectionIdNode);
        assertEquals("subledger:0", ((JsonString) collectionIdNode).getValue());

        String transactionId
            = response.getHeaders().get(HttpHeaderName.fromString("x-ms-ccf-transaction-id")).getValue();

        assertNotNull(transactionId, "transaction id should exist on headers.");

        return transactionId;
    }
}
