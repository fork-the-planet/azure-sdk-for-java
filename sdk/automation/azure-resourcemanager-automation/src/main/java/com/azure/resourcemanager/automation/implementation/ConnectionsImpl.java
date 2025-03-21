// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.ConnectionsClient;
import com.azure.resourcemanager.automation.fluent.models.ConnectionInner;
import com.azure.resourcemanager.automation.models.Connection;
import com.azure.resourcemanager.automation.models.Connections;

public final class ConnectionsImpl implements Connections {
    private static final ClientLogger LOGGER = new ClientLogger(ConnectionsImpl.class);

    private final ConnectionsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public ConnectionsImpl(ConnectionsClient innerClient,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String automationAccountName,
        String connectionName, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, automationAccountName, connectionName, context);
    }

    public void delete(String resourceGroupName, String automationAccountName, String connectionName) {
        this.serviceClient().delete(resourceGroupName, automationAccountName, connectionName);
    }

    public Response<Connection> getWithResponse(String resourceGroupName, String automationAccountName,
        String connectionName, Context context) {
        Response<ConnectionInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, automationAccountName, connectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Connection get(String resourceGroupName, String automationAccountName, String connectionName) {
        ConnectionInner inner = this.serviceClient().get(resourceGroupName, automationAccountName, connectionName);
        if (inner != null) {
            return new ConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Connection> listByAutomationAccount(String resourceGroupName, String automationAccountName) {
        PagedIterable<ConnectionInner> inner
            = this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<Connection> listByAutomationAccount(String resourceGroupName, String automationAccountName,
        Context context) {
        PagedIterable<ConnectionInner> inner
            = this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConnectionImpl(inner1, this.manager()));
    }

    public Connection getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String connectionName = ResourceManagerUtils.getValueFromIdByName(id, "connections");
        if (connectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, connectionName, Context.NONE).getValue();
    }

    public Response<Connection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String connectionName = ResourceManagerUtils.getValueFromIdByName(id, "connections");
        if (connectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, connectionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String connectionName = ResourceManagerUtils.getValueFromIdByName(id, "connections");
        if (connectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, automationAccountName, connectionName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = ResourceManagerUtils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String connectionName = ResourceManagerUtils.getValueFromIdByName(id, "connections");
        if (connectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, automationAccountName, connectionName, context);
    }

    private ConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public ConnectionImpl define(String name) {
        return new ConnectionImpl(name, this.manager());
    }
}
