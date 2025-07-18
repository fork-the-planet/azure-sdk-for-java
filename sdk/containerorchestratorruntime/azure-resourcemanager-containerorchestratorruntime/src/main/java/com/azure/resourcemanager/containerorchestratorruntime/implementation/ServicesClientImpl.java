// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerorchestratorruntime.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerorchestratorruntime.fluent.ServicesClient;
import com.azure.resourcemanager.containerorchestratorruntime.fluent.models.ServiceResourceInner;
import com.azure.resourcemanager.containerorchestratorruntime.implementation.models.ServiceResourceListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ServicesClient.
 */
public final class ServicesClientImpl implements ServicesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ServicesService service;

    /**
     * The service client containing this operation class.
     */
    private final ContainerOrchestratorRuntimeMgmtClientImpl client;

    /**
     * Initializes an instance of ServicesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ServicesClientImpl(ContainerOrchestratorRuntimeMgmtClientImpl client) {
        this.service = RestProxy.create(ServicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerOrchestratorRuntimeMgmtClientServices to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ContainerOrchestratorRuntimeMgmtClientServices")
    public interface ServicesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/{resourceUri}/providers/Microsoft.KubernetesRuntime/services/{serviceName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServiceResourceInner>> get(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @PathParam("serviceName") String serviceName, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/{resourceUri}/providers/Microsoft.KubernetesRuntime/services/{serviceName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<ServiceResourceInner> getSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @PathParam("serviceName") String serviceName, @HeaderParam("Accept") String accept, Context context);

        @Put("/{resourceUri}/providers/Microsoft.KubernetesRuntime/services/{serviceName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServiceResourceInner>> createOrUpdate(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @PathParam("serviceName") String serviceName, @HeaderParam("Content-Type") String contentType,
            @HeaderParam("Accept") String accept, @BodyParam("application/json") ServiceResourceInner resource,
            Context context);

        @Put("/{resourceUri}/providers/Microsoft.KubernetesRuntime/services/{serviceName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<ServiceResourceInner> createOrUpdateSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @PathParam("serviceName") String serviceName, @HeaderParam("Content-Type") String contentType,
            @HeaderParam("Accept") String accept, @BodyParam("application/json") ServiceResourceInner resource,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Delete("/{resourceUri}/providers/Microsoft.KubernetesRuntime/services/{serviceName}")
        @ExpectedResponses({ 200, 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @PathParam("serviceName") String serviceName, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Delete("/{resourceUri}/providers/Microsoft.KubernetesRuntime/services/{serviceName}")
        @ExpectedResponses({ 200, 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<Void> deleteSync(@HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @PathParam("serviceName") String serviceName, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/{resourceUri}/providers/Microsoft.KubernetesRuntime/services")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServiceResourceListResult>> list(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/{resourceUri}/providers/Microsoft.KubernetesRuntime/services")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<ServiceResourceListResult> listSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServiceResourceListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("endpoint") String endpoint,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<ServiceResourceListResult> listNextSync(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("endpoint") String endpoint, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ServiceResource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServiceResourceInner>> getWithResponseAsync(String resourceUri, String serviceName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(), resourceUri,
                serviceName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ServiceResource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServiceResourceInner> getAsync(String resourceUri, String serviceName) {
        return getWithResponseAsync(resourceUri, serviceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ServiceResource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ServiceResourceInner> getWithResponse(String resourceUri, String serviceName, Context context) {
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (serviceName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getSync(this.client.getEndpoint(), this.client.getApiVersion(), resourceUri, serviceName, accept,
            context);
    }

    /**
     * Get a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ServiceResource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceResourceInner get(String resourceUri, String serviceName) {
        return getWithResponse(resourceUri, serviceName, Context.NONE).getValue();
    }

    /**
     * Create a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service resource for an Arc connected cluster (Microsoft.Kubernetes/connectedClusters) along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServiceResourceInner>> createOrUpdateWithResponseAsync(String resourceUri, String serviceName,
        ServiceResourceInner resource) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (resource == null) {
            return Mono.error(new IllegalArgumentException("Parameter resource is required and cannot be null."));
        } else {
            resource.validate();
        }
        final String contentType = "application/json";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.createOrUpdate(this.client.getEndpoint(), this.client.getApiVersion(),
                resourceUri, serviceName, contentType, accept, resource, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service resource for an Arc connected cluster (Microsoft.Kubernetes/connectedClusters) on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServiceResourceInner> createOrUpdateAsync(String resourceUri, String serviceName,
        ServiceResourceInner resource) {
        return createOrUpdateWithResponseAsync(resourceUri, serviceName, resource)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service resource for an Arc connected cluster (Microsoft.Kubernetes/connectedClusters) along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ServiceResourceInner> createOrUpdateWithResponse(String resourceUri, String serviceName,
        ServiceResourceInner resource, Context context) {
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (serviceName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (resource == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter resource is required and cannot be null."));
        } else {
            resource.validate();
        }
        final String contentType = "application/json";
        final String accept = "application/json";
        return service.createOrUpdateSync(this.client.getEndpoint(), this.client.getApiVersion(), resourceUri,
            serviceName, contentType, accept, resource, context);
    }

    /**
     * Create a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service resource for an Arc connected cluster (Microsoft.Kubernetes/connectedClusters).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceResourceInner createOrUpdate(String resourceUri, String serviceName, ServiceResourceInner resource) {
        return createOrUpdateWithResponse(resourceUri, serviceName, resource, Context.NONE).getValue();
    }

    /**
     * Delete a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceUri, String serviceName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.delete(this.client.getEndpoint(), this.client.getApiVersion(), resourceUri,
                serviceName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Delete a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceUri, String serviceName) {
        return deleteWithResponseAsync(resourceUri, serviceName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String resourceUri, String serviceName, Context context) {
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (serviceName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.deleteSync(this.client.getEndpoint(), this.client.getApiVersion(), resourceUri, serviceName,
            accept, context);
    }

    /**
     * Delete a ServiceResource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param serviceName The name of the the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceUri, String serviceName) {
        deleteWithResponse(resourceUri, serviceName, Context.NONE);
    }

    /**
     * List ServiceResource resources by parent.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ServiceResource list operation along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ServiceResourceInner>> listSinglePageAsync(String resourceUri) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(), resourceUri,
                accept, context))
            .<PagedResponse<ServiceResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List ServiceResource resources by parent.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ServiceResource list operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ServiceResourceInner> listAsync(String resourceUri) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceUri), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List ServiceResource resources by parent.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ServiceResource list operation along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<ServiceResourceInner> listSinglePage(String resourceUri) {
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        Response<ServiceResourceListResult> res = service.listSync(this.client.getEndpoint(),
            this.client.getApiVersion(), resourceUri, accept, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(),
            res.getValue().nextLink(), null);
    }

    /**
     * List ServiceResource resources by parent.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ServiceResource list operation along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<ServiceResourceInner> listSinglePage(String resourceUri, Context context) {
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        Response<ServiceResourceListResult> res
            = service.listSync(this.client.getEndpoint(), this.client.getApiVersion(), resourceUri, accept, context);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(),
            res.getValue().nextLink(), null);
    }

    /**
     * List ServiceResource resources by parent.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ServiceResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceResourceInner> list(String resourceUri) {
        return new PagedIterable<>(() -> listSinglePage(resourceUri), nextLink -> listNextSinglePage(nextLink));
    }

    /**
     * List ServiceResource resources by parent.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ServiceResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceResourceInner> list(String resourceUri, Context context) {
        return new PagedIterable<>(() -> listSinglePage(resourceUri, context),
            nextLink -> listNextSinglePage(nextLink, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ServiceResource list operation along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ServiceResourceInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<ServiceResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ServiceResource list operation along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<ServiceResourceInner> listNextSinglePage(String nextLink) {
        if (nextLink == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        Response<ServiceResourceListResult> res
            = service.listNextSync(nextLink, this.client.getEndpoint(), accept, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(),
            res.getValue().nextLink(), null);
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ServiceResource list operation along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<ServiceResourceInner> listNextSinglePage(String nextLink, Context context) {
        if (nextLink == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        Response<ServiceResourceListResult> res
            = service.listNextSync(nextLink, this.client.getEndpoint(), accept, context);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(),
            res.getValue().nextLink(), null);
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServicesClientImpl.class);
}
