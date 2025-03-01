// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.OperationsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.TagResourceContractInner;
import com.azure.resourcemanager.apimanagement.models.Operations;
import com.azure.resourcemanager.apimanagement.models.TagResourceContract;

public final class OperationsImpl implements Operations {
    private static final ClientLogger LOGGER = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public OperationsImpl(OperationsClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TagResourceContract> listByTags(String resourceGroupName, String serviceName, String apiId) {
        PagedIterable<TagResourceContractInner> inner
            = this.serviceClient().listByTags(resourceGroupName, serviceName, apiId);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TagResourceContractImpl(inner1, this.manager()));
    }

    public PagedIterable<TagResourceContract> listByTags(String resourceGroupName, String serviceName, String apiId,
        String filter, Integer top, Integer skip, Boolean includeNotTaggedOperations, Context context) {
        PagedIterable<TagResourceContractInner> inner = this.serviceClient()
            .listByTags(resourceGroupName, serviceName, apiId, filter, top, skip, includeNotTaggedOperations, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TagResourceContractImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
