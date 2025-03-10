// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.networkfunction.fluent.AzureTrafficCollectorManagementClient;
import com.azure.resourcemanager.networkfunction.fluent.AzureTrafficCollectorsByResourceGroupsClient;
import com.azure.resourcemanager.networkfunction.fluent.AzureTrafficCollectorsBySubscriptionsClient;
import com.azure.resourcemanager.networkfunction.fluent.AzureTrafficCollectorsClient;
import com.azure.resourcemanager.networkfunction.fluent.CollectorPoliciesClient;
import com.azure.resourcemanager.networkfunction.fluent.NetworkFunctionsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the AzureTrafficCollectorManagementClientImpl type.
 */
@ServiceClient(builder = AzureTrafficCollectorManagementClientBuilder.class)
public final class AzureTrafficCollectorManagementClientImpl implements AzureTrafficCollectorManagementClient {
    /**
     * Azure Subscription ID.
     */
    private final String subscriptionId;

    /**
     * Gets Azure Subscription ID.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String endpoint;

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The default poll interval for long-running operation.
     */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /**
     * The NetworkFunctionsClient object to access its operations.
     */
    private final NetworkFunctionsClient networkFunctions;

    /**
     * Gets the NetworkFunctionsClient object to access its operations.
     * 
     * @return the NetworkFunctionsClient object.
     */
    public NetworkFunctionsClient getNetworkFunctions() {
        return this.networkFunctions;
    }

    /**
     * The AzureTrafficCollectorsBySubscriptionsClient object to access its operations.
     */
    private final AzureTrafficCollectorsBySubscriptionsClient azureTrafficCollectorsBySubscriptions;

    /**
     * Gets the AzureTrafficCollectorsBySubscriptionsClient object to access its operations.
     * 
     * @return the AzureTrafficCollectorsBySubscriptionsClient object.
     */
    public AzureTrafficCollectorsBySubscriptionsClient getAzureTrafficCollectorsBySubscriptions() {
        return this.azureTrafficCollectorsBySubscriptions;
    }

    /**
     * The AzureTrafficCollectorsByResourceGroupsClient object to access its operations.
     */
    private final AzureTrafficCollectorsByResourceGroupsClient azureTrafficCollectorsByResourceGroups;

    /**
     * Gets the AzureTrafficCollectorsByResourceGroupsClient object to access its operations.
     * 
     * @return the AzureTrafficCollectorsByResourceGroupsClient object.
     */
    public AzureTrafficCollectorsByResourceGroupsClient getAzureTrafficCollectorsByResourceGroups() {
        return this.azureTrafficCollectorsByResourceGroups;
    }

    /**
     * The AzureTrafficCollectorsClient object to access its operations.
     */
    private final AzureTrafficCollectorsClient azureTrafficCollectors;

    /**
     * Gets the AzureTrafficCollectorsClient object to access its operations.
     * 
     * @return the AzureTrafficCollectorsClient object.
     */
    public AzureTrafficCollectorsClient getAzureTrafficCollectors() {
        return this.azureTrafficCollectors;
    }

    /**
     * The CollectorPoliciesClient object to access its operations.
     */
    private final CollectorPoliciesClient collectorPolicies;

    /**
     * Gets the CollectorPoliciesClient object to access its operations.
     * 
     * @return the CollectorPoliciesClient object.
     */
    public CollectorPoliciesClient getCollectorPolicies() {
        return this.collectorPolicies;
    }

    /**
     * Initializes an instance of AzureTrafficCollectorManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Azure Subscription ID.
     * @param endpoint server parameter.
     */
    AzureTrafficCollectorManagementClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2022-11-01";
        this.networkFunctions = new NetworkFunctionsClientImpl(this);
        this.azureTrafficCollectorsBySubscriptions = new AzureTrafficCollectorsBySubscriptionsClientImpl(this);
        this.azureTrafficCollectorsByResourceGroups = new AzureTrafficCollectorsByResourceGroupsClientImpl(this);
        this.azureTrafficCollectors = new AzureTrafficCollectorsClientImpl(this);
        this.collectorPolicies = new CollectorPoliciesClientImpl(this);
    }

    /**
     * Gets default client context.
     * 
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     * 
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     * 
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline, Type pollResultType, Type finalResultType, Context context) {
        return PollerFactory.create(serializerAdapter, httpPipeline, pollResultType, finalResultType,
            defaultPollInterval, activationResponse, context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     * 
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse = new HttpResponseImpl(lroError.getResponseStatusCode(), lroError.getResponseHeaders(),
                    lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError = this.getSerializerAdapter()
                            .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(HttpHeaderName.fromString(s));
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureTrafficCollectorManagementClientImpl.class);
}
