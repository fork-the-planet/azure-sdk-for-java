// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.IntegrationRuntimesClient;
import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeAuthKeysInner;
import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeConnectionInfoInner;
import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeMonitoringDataInner;
import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner;
import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeResourceInner;
import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeStatusResponseInner;
import com.azure.resourcemanager.datafactory.models.CreateLinkedIntegrationRuntimeRequest;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeAuthKeys;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeConnectionInfo;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeMonitoringData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeRegenerateKeyParameters;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeResource;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeStatusResponse;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimes;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntimeRequest;

public final class IntegrationRuntimesImpl implements IntegrationRuntimes {
    private static final ClientLogger LOGGER = new ClientLogger(IntegrationRuntimesImpl.class);

    private final IntegrationRuntimesClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public IntegrationRuntimesImpl(IntegrationRuntimesClient innerClient,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<IntegrationRuntimeResource> listByFactory(String resourceGroupName, String factoryName) {
        PagedIterable<IntegrationRuntimeResourceInner> inner
            = this.serviceClient().listByFactory(resourceGroupName, factoryName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new IntegrationRuntimeResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<IntegrationRuntimeResource> listByFactory(String resourceGroupName, String factoryName,
        Context context) {
        PagedIterable<IntegrationRuntimeResourceInner> inner
            = this.serviceClient().listByFactory(resourceGroupName, factoryName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new IntegrationRuntimeResourceImpl(inner1, this.manager()));
    }

    public Response<IntegrationRuntimeResource> getWithResponse(String resourceGroupName, String factoryName,
        String integrationRuntimeName, String ifNoneMatch, Context context) {
        Response<IntegrationRuntimeResourceInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, factoryName, integrationRuntimeName, ifNoneMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new IntegrationRuntimeResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeResource get(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimeResourceInner inner
            = this.serviceClient().get(resourceGroupName, factoryName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String factoryName,
        String integrationRuntimeName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public void delete(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        this.serviceClient().delete(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public Response<IntegrationRuntimeStatusResponse> getStatusWithResponse(String resourceGroupName,
        String factoryName, String integrationRuntimeName, Context context) {
        Response<IntegrationRuntimeStatusResponseInner> inner = this.serviceClient()
            .getStatusWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new IntegrationRuntimeStatusResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeStatusResponse getStatus(String resourceGroupName, String factoryName,
        String integrationRuntimeName) {
        IntegrationRuntimeStatusResponseInner inner
            = this.serviceClient().getStatus(resourceGroupName, factoryName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeStatusResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse>
        listOutboundNetworkDependenciesEndpointsWithResponse(String resourceGroupName, String factoryName,
            String integrationRuntimeName, Context context) {
        Response<IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner> inner = this.serviceClient()
            .listOutboundNetworkDependenciesEndpointsWithResponse(resourceGroupName, factoryName,
                integrationRuntimeName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseImpl(inner.getValue(),
                    this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse listOutboundNetworkDependenciesEndpoints(
        String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner inner = this.serviceClient()
            .listOutboundNetworkDependenciesEndpoints(resourceGroupName, factoryName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeConnectionInfo> getConnectionInfoWithResponse(String resourceGroupName,
        String factoryName, String integrationRuntimeName, Context context) {
        Response<IntegrationRuntimeConnectionInfoInner> inner = this.serviceClient()
            .getConnectionInfoWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new IntegrationRuntimeConnectionInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeConnectionInfo getConnectionInfo(String resourceGroupName, String factoryName,
        String integrationRuntimeName) {
        IntegrationRuntimeConnectionInfoInner inner
            = this.serviceClient().getConnectionInfo(resourceGroupName, factoryName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeConnectionInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeAuthKeys> regenerateAuthKeyWithResponse(String resourceGroupName,
        String factoryName, String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters, Context context) {
        Response<IntegrationRuntimeAuthKeysInner> inner = this.serviceClient()
            .regenerateAuthKeyWithResponse(resourceGroupName, factoryName, integrationRuntimeName,
                regenerateKeyParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new IntegrationRuntimeAuthKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeAuthKeys regenerateAuthKey(String resourceGroupName, String factoryName,
        String integrationRuntimeName, IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters) {
        IntegrationRuntimeAuthKeysInner inner = this.serviceClient()
            .regenerateAuthKey(resourceGroupName, factoryName, integrationRuntimeName, regenerateKeyParameters);
        if (inner != null) {
            return new IntegrationRuntimeAuthKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeAuthKeys> listAuthKeysWithResponse(String resourceGroupName, String factoryName,
        String integrationRuntimeName, Context context) {
        Response<IntegrationRuntimeAuthKeysInner> inner = this.serviceClient()
            .listAuthKeysWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new IntegrationRuntimeAuthKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeAuthKeys listAuthKeys(String resourceGroupName, String factoryName,
        String integrationRuntimeName) {
        IntegrationRuntimeAuthKeysInner inner
            = this.serviceClient().listAuthKeys(resourceGroupName, factoryName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeAuthKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public IntegrationRuntimeStatusResponse start(String resourceGroupName, String factoryName,
        String integrationRuntimeName) {
        IntegrationRuntimeStatusResponseInner inner
            = this.serviceClient().start(resourceGroupName, factoryName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeStatusResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public IntegrationRuntimeStatusResponse start(String resourceGroupName, String factoryName,
        String integrationRuntimeName, Context context) {
        IntegrationRuntimeStatusResponseInner inner
            = this.serviceClient().start(resourceGroupName, factoryName, integrationRuntimeName, context);
        if (inner != null) {
            return new IntegrationRuntimeStatusResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void stop(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        this.serviceClient().stop(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public void stop(String resourceGroupName, String factoryName, String integrationRuntimeName, Context context) {
        this.serviceClient().stop(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public Response<Void> syncCredentialsWithResponse(String resourceGroupName, String factoryName,
        String integrationRuntimeName, Context context) {
        return this.serviceClient()
            .syncCredentialsWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public void syncCredentials(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        this.serviceClient().syncCredentials(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public Response<IntegrationRuntimeMonitoringData> getMonitoringDataWithResponse(String resourceGroupName,
        String factoryName, String integrationRuntimeName, Context context) {
        Response<IntegrationRuntimeMonitoringDataInner> inner = this.serviceClient()
            .getMonitoringDataWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new IntegrationRuntimeMonitoringDataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeMonitoringData getMonitoringData(String resourceGroupName, String factoryName,
        String integrationRuntimeName) {
        IntegrationRuntimeMonitoringDataInner inner
            = this.serviceClient().getMonitoringData(resourceGroupName, factoryName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeMonitoringDataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> upgradeWithResponse(String resourceGroupName, String factoryName,
        String integrationRuntimeName, Context context) {
        return this.serviceClient()
            .upgradeWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    public void upgrade(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        this.serviceClient().upgrade(resourceGroupName, factoryName, integrationRuntimeName);
    }

    public Response<Void> removeLinksWithResponse(String resourceGroupName, String factoryName,
        String integrationRuntimeName, LinkedIntegrationRuntimeRequest linkedIntegrationRuntimeRequest,
        Context context) {
        return this.serviceClient()
            .removeLinksWithResponse(resourceGroupName, factoryName, integrationRuntimeName,
                linkedIntegrationRuntimeRequest, context);
    }

    public void removeLinks(String resourceGroupName, String factoryName, String integrationRuntimeName,
        LinkedIntegrationRuntimeRequest linkedIntegrationRuntimeRequest) {
        this.serviceClient()
            .removeLinks(resourceGroupName, factoryName, integrationRuntimeName, linkedIntegrationRuntimeRequest);
    }

    public Response<IntegrationRuntimeStatusResponse> createLinkedIntegrationRuntimeWithResponse(
        String resourceGroupName, String factoryName, String integrationRuntimeName,
        CreateLinkedIntegrationRuntimeRequest createLinkedIntegrationRuntimeRequest, Context context) {
        Response<IntegrationRuntimeStatusResponseInner> inner = this.serviceClient()
            .createLinkedIntegrationRuntimeWithResponse(resourceGroupName, factoryName, integrationRuntimeName,
                createLinkedIntegrationRuntimeRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new IntegrationRuntimeStatusResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeStatusResponse createLinkedIntegrationRuntime(String resourceGroupName, String factoryName,
        String integrationRuntimeName, CreateLinkedIntegrationRuntimeRequest createLinkedIntegrationRuntimeRequest) {
        IntegrationRuntimeStatusResponseInner inner = this.serviceClient()
            .createLinkedIntegrationRuntime(resourceGroupName, factoryName, integrationRuntimeName,
                createLinkedIntegrationRuntimeRequest);
        if (inner != null) {
            return new IntegrationRuntimeStatusResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public IntegrationRuntimeResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String integrationRuntimeName = ResourceManagerUtils.getValueFromIdByName(id, "integrationRuntimes");
        if (integrationRuntimeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'integrationRuntimes'.", id)));
        }
        String localIfNoneMatch = null;
        return this
            .getWithResponse(resourceGroupName, factoryName, integrationRuntimeName, localIfNoneMatch, Context.NONE)
            .getValue();
    }

    public Response<IntegrationRuntimeResource> getByIdWithResponse(String id, String ifNoneMatch, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String integrationRuntimeName = ResourceManagerUtils.getValueFromIdByName(id, "integrationRuntimes");
        if (integrationRuntimeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'integrationRuntimes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, factoryName, integrationRuntimeName, ifNoneMatch, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String integrationRuntimeName = ResourceManagerUtils.getValueFromIdByName(id, "integrationRuntimes");
        if (integrationRuntimeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'integrationRuntimes'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, factoryName, integrationRuntimeName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String integrationRuntimeName = ResourceManagerUtils.getValueFromIdByName(id, "integrationRuntimes");
        if (integrationRuntimeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'integrationRuntimes'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, factoryName, integrationRuntimeName, context);
    }

    private IntegrationRuntimesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    public IntegrationRuntimeResourceImpl define(String name) {
        return new IntegrationRuntimeResourceImpl(name, this.manager());
    }
}
