// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.annotation.processor.test;

import io.clientcore.annotation.processor.test.implementation.TestInterfaceClientImpl;
import io.clientcore.annotation.processor.test.implementation.models.Foo;
import io.clientcore.core.http.client.HttpClient;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.http.pipeline.HttpPipelineBuilder;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.shared.HttpClientTestsServer;
import io.clientcore.core.shared.LocalTestServer;
import io.clientcore.http.okhttp3.OkHttpHttpClientProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestInterfaceGenerationTests {
    private static LocalTestServer server;
    @BeforeAll
    public static void startTestServer() {
        server = HttpClientTestsServer.getHttpClientTestsServer();

        server.start();
    }

    @AfterAll
    public static void stopTestServer() {
        if (server != null) {
            server.stop();
        }
    }

    @Test
    public void testGetNewInstance() {
        HttpClient client = new LocalHttpClient();
        HttpPipeline pipeline = new HttpPipelineBuilder().httpClient(client).build();

        TestInterfaceClientImpl.TestInterfaceClientService testInterface =
            TestInterfaceClientImpl.TestInterfaceClientService.getNewInstance(pipeline);
        assertNotNull(testInterface);
    }

    @Test
    public void testGetFoo() {
        String wireValue
            =
            "{\"bar\":\"hello.world\",\"baz\":[\"hello\",\"hello.world\"],\"qux\":{\"a.b\":\"c.d\",\"bar.a\":\"ttyy\",\"bar.b\":\"uuzz\",\"hello\":\"world\"},\"additionalProperties\":{\"bar\":\"baz\",\"a.b\":\"c.d\",\"properties.bar\":\"barbar\"}}";

        HttpPipeline pipeline = new HttpPipelineBuilder().httpClient(request ->
            new MockHttpResponse(request, 200, BinaryData.fromString(wireValue))).build();

        TestInterfaceClientImpl.TestInterfaceClientService testInterface =
            TestInterfaceClientImpl.TestInterfaceClientService.getNewInstance(pipeline);
        assertNotNull(testInterface);

        // test getFoo method
        Response<Foo> response = testInterface.getFoo("key", "label", "sync-token-value");
        assertNotNull(response);
        assertEquals(200, response.getStatusCode());

        Foo foo = response.getValue();
        assertNotNull(foo);
        assertEquals("hello.world", foo.bar());
        assertEquals(4, foo.qux().size());
        assertNotNull(foo.additionalProperties());
        assertEquals("baz", foo.additionalProperties().get("bar"));
        assertEquals("c.d", foo.additionalProperties().get("a.b"));
        assertEquals("barbar", foo.additionalProperties().get("properties.bar"));
    }

    @Test
    public void requestWithByteArrayReturnType() {
        HttpPipeline pipeline = new HttpPipelineBuilder().httpClient(getHttpClient()).build();
        TestInterfaceClientImpl.TestInterfaceClientService testInterface =
            TestInterfaceClientImpl.TestInterfaceClientService.getNewInstance(pipeline);
        final byte[] result = testInterface.getByteArray(getServerUri(false));

        assertNotNull(result);
        assertEquals(100, result.length);
    }

    /**
     * Tests that the response body is correctly returned as a byte array.
     */
    @Test
    @Disabled("Disabled until we confirm the behavior of the HostParam annotation")
    public void requestWithByteArrayReturnTypeAndParameterizedHostAndPath() {
        //https://github.com/Azure/azure-sdk-for-java/issues/44298
        HttpPipeline pipeline = new HttpPipelineBuilder().httpClient(getHttpClient()).build();
        TestInterfaceClientImpl.TestInterfaceClientService testInterface =
            TestInterfaceClientImpl.TestInterfaceClientService.getNewInstance(pipeline);
        final byte[] result
            = testInterface.getByteArray("http", "localhost:" + server.getHttpPort(), 100);

        assertNotNull(result);
        assertEquals(result.length, 100);
    }

    /**
     * Tests that a response with no return type is correctly handled.
     */
    @Test
    public void getRequestWithNoReturn() {
        HttpPipeline pipeline = new HttpPipelineBuilder().httpClient(getHttpClient()).build();
        TestInterfaceClientImpl.TestInterfaceClientService testInterface =
            TestInterfaceClientImpl.TestInterfaceClientService.getNewInstance(pipeline);
        assertDoesNotThrow(() -> testInterface.getNothing(getServerUri(false)));
    }

    private HttpClient getHttpClient() {
        return new OkHttpHttpClientProvider().getSharedInstance();
    }

    private String getServerUri(boolean secure) {
        return secure ? server.getHttpsUri() : server.getHttpUri();
    }

}
