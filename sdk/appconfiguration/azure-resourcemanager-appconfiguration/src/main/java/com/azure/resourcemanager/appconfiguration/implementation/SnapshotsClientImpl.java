// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appconfiguration.fluent.SnapshotsClient;
import com.azure.resourcemanager.appconfiguration.fluent.models.SnapshotInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SnapshotsClient.
 */
public final class SnapshotsClientImpl implements SnapshotsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SnapshotsService service;

    /**
     * The service client containing this operation class.
     */
    private final AppConfigurationManagementClientImpl client;

    /**
     * Initializes an instance of SnapshotsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SnapshotsClientImpl(AppConfigurationManagementClientImpl client) {
        this.service
            = RestProxy.create(SnapshotsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AppConfigurationManagementClientSnapshots to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AppConfigurationMana")
    public interface SnapshotsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AppConfiguration/configurationStores/{configStoreName}/snapshots/{snapshotName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SnapshotInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("configStoreName") String configStoreName, @PathParam("snapshotName") String snapshotName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AppConfiguration/configurationStores/{configStoreName}/snapshots/{snapshotName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<SnapshotInner> getSync(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("configStoreName") String configStoreName, @PathParam("snapshotName") String snapshotName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AppConfiguration/configurationStores/{configStoreName}/snapshots/{snapshotName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> create(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("configStoreName") String configStoreName, @PathParam("snapshotName") String snapshotName,
            @QueryParam("api-version") String apiVersion, @BodyParam("application/json") SnapshotInner body,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AppConfiguration/configurationStores/{configStoreName}/snapshots/{snapshotName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<BinaryData> createSync(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("configStoreName") String configStoreName, @PathParam("snapshotName") String snapshotName,
            @QueryParam("api-version") String apiVersion, @BodyParam("application/json") SnapshotInner body,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets the properties of the specified snapshot. NOTE: This operation is intended for use in Azure Resource Manager
     * (ARM) Template deployments. For all other scenarios involving App Configuration snapshots the data plane API
     * should be used instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified snapshot along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SnapshotInner>> getWithResponseAsync(String resourceGroupName, String configStoreName,
        String snapshotName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configStoreName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configStoreName is required and cannot be null."));
        }
        if (snapshotName == null) {
            return Mono.error(new IllegalArgumentException("Parameter snapshotName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, configStoreName, snapshotName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the properties of the specified snapshot. NOTE: This operation is intended for use in Azure Resource Manager
     * (ARM) Template deployments. For all other scenarios involving App Configuration snapshots the data plane API
     * should be used instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified snapshot on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SnapshotInner> getAsync(String resourceGroupName, String configStoreName, String snapshotName) {
        return getWithResponseAsync(resourceGroupName, configStoreName, snapshotName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the properties of the specified snapshot. NOTE: This operation is intended for use in Azure Resource Manager
     * (ARM) Template deployments. For all other scenarios involving App Configuration snapshots the data plane API
     * should be used instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified snapshot along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SnapshotInner> getWithResponse(String resourceGroupName, String configStoreName,
        String snapshotName, Context context) {
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configStoreName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter configStoreName is required and cannot be null."));
        }
        if (snapshotName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter snapshotName is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getSync(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            configStoreName, snapshotName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets the properties of the specified snapshot. NOTE: This operation is intended for use in Azure Resource Manager
     * (ARM) Template deployments. For all other scenarios involving App Configuration snapshots the data plane API
     * should be used instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified snapshot.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SnapshotInner get(String resourceGroupName, String configStoreName, String snapshotName) {
        return getWithResponse(resourceGroupName, configStoreName, snapshotName, Context.NONE).getValue();
    }

    /**
     * Creates a snapshot. NOTE: This operation is intended for use in Azure Resource Manager (ARM) Template
     * deployments. For all other scenarios involving App Configuration snapshots the data plane API should be used
     * instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @param body The parameters for creating a snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the snapshot resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(String resourceGroupName, String configStoreName,
        String snapshotName, SnapshotInner body) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configStoreName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configStoreName is required and cannot be null."));
        }
        if (snapshotName == null) {
            return Mono.error(new IllegalArgumentException("Parameter snapshotName is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.create(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, configStoreName, snapshotName, this.client.getApiVersion(), body, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates a snapshot. NOTE: This operation is intended for use in Azure Resource Manager (ARM) Template
     * deployments. For all other scenarios involving App Configuration snapshots the data plane API should be used
     * instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @param body The parameters for creating a snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the snapshot resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Response<BinaryData> createWithResponse(String resourceGroupName, String configStoreName,
        String snapshotName, SnapshotInner body) {
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configStoreName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter configStoreName is required and cannot be null."));
        }
        if (snapshotName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter snapshotName is required and cannot be null."));
        }
        if (body == null) {
            throw LOGGER.atError().log(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return service.createSync(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            configStoreName, snapshotName, this.client.getApiVersion(), body, accept, Context.NONE);
    }

    /**
     * Creates a snapshot. NOTE: This operation is intended for use in Azure Resource Manager (ARM) Template
     * deployments. For all other scenarios involving App Configuration snapshots the data plane API should be used
     * instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @param body The parameters for creating a snapshot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the snapshot resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Response<BinaryData> createWithResponse(String resourceGroupName, String configStoreName,
        String snapshotName, SnapshotInner body, Context context) {
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configStoreName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter configStoreName is required and cannot be null."));
        }
        if (snapshotName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter snapshotName is required and cannot be null."));
        }
        if (body == null) {
            throw LOGGER.atError().log(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return service.createSync(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            configStoreName, snapshotName, this.client.getApiVersion(), body, accept, context);
    }

    /**
     * Creates a snapshot. NOTE: This operation is intended for use in Azure Resource Manager (ARM) Template
     * deployments. For all other scenarios involving App Configuration snapshots the data plane API should be used
     * instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @param body The parameters for creating a snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of the snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<SnapshotInner>, SnapshotInner> beginCreateAsync(String resourceGroupName,
        String configStoreName, String snapshotName, SnapshotInner body) {
        Mono<Response<Flux<ByteBuffer>>> mono
            = createWithResponseAsync(resourceGroupName, configStoreName, snapshotName, body);
        return this.client.<SnapshotInner, SnapshotInner>getLroResult(mono, this.client.getHttpPipeline(),
            SnapshotInner.class, SnapshotInner.class, this.client.getContext());
    }

    /**
     * Creates a snapshot. NOTE: This operation is intended for use in Azure Resource Manager (ARM) Template
     * deployments. For all other scenarios involving App Configuration snapshots the data plane API should be used
     * instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @param body The parameters for creating a snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<SnapshotInner>, SnapshotInner> beginCreate(String resourceGroupName,
        String configStoreName, String snapshotName, SnapshotInner body) {
        Response<BinaryData> response = createWithResponse(resourceGroupName, configStoreName, snapshotName, body);
        return this.client.<SnapshotInner, SnapshotInner>getLroResult(response, SnapshotInner.class,
            SnapshotInner.class, Context.NONE);
    }

    /**
     * Creates a snapshot. NOTE: This operation is intended for use in Azure Resource Manager (ARM) Template
     * deployments. For all other scenarios involving App Configuration snapshots the data plane API should be used
     * instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @param body The parameters for creating a snapshot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<SnapshotInner>, SnapshotInner> beginCreate(String resourceGroupName,
        String configStoreName, String snapshotName, SnapshotInner body, Context context) {
        Response<BinaryData> response
            = createWithResponse(resourceGroupName, configStoreName, snapshotName, body, context);
        return this.client.<SnapshotInner, SnapshotInner>getLroResult(response, SnapshotInner.class,
            SnapshotInner.class, context);
    }

    /**
     * Creates a snapshot. NOTE: This operation is intended for use in Azure Resource Manager (ARM) Template
     * deployments. For all other scenarios involving App Configuration snapshots the data plane API should be used
     * instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @param body The parameters for creating a snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the snapshot resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SnapshotInner> createAsync(String resourceGroupName, String configStoreName, String snapshotName,
        SnapshotInner body) {
        return beginCreateAsync(resourceGroupName, configStoreName, snapshotName, body).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Creates a snapshot. NOTE: This operation is intended for use in Azure Resource Manager (ARM) Template
     * deployments. For all other scenarios involving App Configuration snapshots the data plane API should be used
     * instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @param body The parameters for creating a snapshot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SnapshotInner create(String resourceGroupName, String configStoreName, String snapshotName,
        SnapshotInner body) {
        return beginCreate(resourceGroupName, configStoreName, snapshotName, body).getFinalResult();
    }

    /**
     * Creates a snapshot. NOTE: This operation is intended for use in Azure Resource Manager (ARM) Template
     * deployments. For all other scenarios involving App Configuration snapshots the data plane API should be used
     * instead.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configStoreName The name of the configuration store.
     * @param snapshotName The name of the snapshot.
     * @param body The parameters for creating a snapshot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SnapshotInner create(String resourceGroupName, String configStoreName, String snapshotName,
        SnapshotInner body, Context context) {
        return beginCreate(resourceGroupName, configStoreName, snapshotName, body, context).getFinalResult();
    }

    private static final ClientLogger LOGGER = new ClientLogger(SnapshotsClientImpl.class);
}
