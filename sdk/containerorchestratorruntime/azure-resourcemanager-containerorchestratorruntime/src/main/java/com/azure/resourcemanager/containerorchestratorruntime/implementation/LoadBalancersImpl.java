// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerorchestratorruntime.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerorchestratorruntime.fluent.LoadBalancersClient;
import com.azure.resourcemanager.containerorchestratorruntime.fluent.models.LoadBalancerInner;
import com.azure.resourcemanager.containerorchestratorruntime.models.LoadBalancer;
import com.azure.resourcemanager.containerorchestratorruntime.models.LoadBalancers;

public final class LoadBalancersImpl implements LoadBalancers {
    private static final ClientLogger LOGGER = new ClientLogger(LoadBalancersImpl.class);

    private final LoadBalancersClient innerClient;

    private final com.azure.resourcemanager.containerorchestratorruntime.ContainerOrchestratorRuntimeManager serviceManager;

    public LoadBalancersImpl(LoadBalancersClient innerClient,
        com.azure.resourcemanager.containerorchestratorruntime.ContainerOrchestratorRuntimeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<LoadBalancer> getWithResponse(String resourceUri, String loadBalancerName, Context context) {
        Response<LoadBalancerInner> inner
            = this.serviceClient().getWithResponse(resourceUri, loadBalancerName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LoadBalancerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LoadBalancer get(String resourceUri, String loadBalancerName) {
        LoadBalancerInner inner = this.serviceClient().get(resourceUri, loadBalancerName);
        if (inner != null) {
            return new LoadBalancerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String resourceUri, String loadBalancerName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceUri, loadBalancerName, context);
    }

    public void deleteByResourceGroup(String resourceUri, String loadBalancerName) {
        this.serviceClient().delete(resourceUri, loadBalancerName);
    }

    public PagedIterable<LoadBalancer> list(String resourceUri) {
        PagedIterable<LoadBalancerInner> inner = this.serviceClient().list(resourceUri);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LoadBalancerImpl(inner1, this.manager()));
    }

    public PagedIterable<LoadBalancer> list(String resourceUri, Context context) {
        PagedIterable<LoadBalancerInner> inner = this.serviceClient().list(resourceUri, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LoadBalancerImpl(inner1, this.manager()));
    }

    public LoadBalancer getById(String id) {
        String resourceUri = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.KubernetesRuntime/loadBalancers/{loadBalancerName}", "resourceUri");
        if (resourceUri == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceUri'.", id)));
        }
        String loadBalancerName = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.KubernetesRuntime/loadBalancers/{loadBalancerName}",
            "loadBalancerName");
        if (loadBalancerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'loadBalancers'.", id)));
        }
        return this.getWithResponse(resourceUri, loadBalancerName, Context.NONE).getValue();
    }

    public Response<LoadBalancer> getByIdWithResponse(String id, Context context) {
        String resourceUri = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.KubernetesRuntime/loadBalancers/{loadBalancerName}", "resourceUri");
        if (resourceUri == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceUri'.", id)));
        }
        String loadBalancerName = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.KubernetesRuntime/loadBalancers/{loadBalancerName}",
            "loadBalancerName");
        if (loadBalancerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'loadBalancers'.", id)));
        }
        return this.getWithResponse(resourceUri, loadBalancerName, context);
    }

    public void deleteById(String id) {
        String resourceUri = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.KubernetesRuntime/loadBalancers/{loadBalancerName}", "resourceUri");
        if (resourceUri == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceUri'.", id)));
        }
        String loadBalancerName = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.KubernetesRuntime/loadBalancers/{loadBalancerName}",
            "loadBalancerName");
        if (loadBalancerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'loadBalancers'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceUri, loadBalancerName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceUri = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.KubernetesRuntime/loadBalancers/{loadBalancerName}", "resourceUri");
        if (resourceUri == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceUri'.", id)));
        }
        String loadBalancerName = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.KubernetesRuntime/loadBalancers/{loadBalancerName}",
            "loadBalancerName");
        if (loadBalancerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'loadBalancers'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceUri, loadBalancerName, context);
    }

    private LoadBalancersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.containerorchestratorruntime.ContainerOrchestratorRuntimeManager manager() {
        return this.serviceManager;
    }

    public LoadBalancerImpl define(String name) {
        return new LoadBalancerImpl(name, this.manager());
    }
}
