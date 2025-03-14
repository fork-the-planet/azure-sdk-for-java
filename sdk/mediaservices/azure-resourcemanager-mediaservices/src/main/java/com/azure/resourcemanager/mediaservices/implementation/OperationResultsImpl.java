// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.fluent.OperationResultsClient;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetTrackInner;
import com.azure.resourcemanager.mediaservices.models.AssetTrack;
import com.azure.resourcemanager.mediaservices.models.OperationResults;
import com.azure.resourcemanager.mediaservices.models.OperationResultsGetResponse;

public final class OperationResultsImpl implements OperationResults {
    private static final ClientLogger LOGGER = new ClientLogger(OperationResultsImpl.class);

    private final OperationResultsClient innerClient;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    public OperationResultsImpl(OperationResultsClient innerClient,
        com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<AssetTrack> getWithResponse(String resourceGroupName, String accountName, String assetName,
        String trackName, String operationId, Context context) {
        OperationResultsGetResponse inner = this.serviceClient()
            .getWithResponse(resourceGroupName, accountName, assetName, trackName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AssetTrackImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AssetTrack get(String resourceGroupName, String accountName, String assetName, String trackName,
        String operationId) {
        AssetTrackInner inner
            = this.serviceClient().get(resourceGroupName, accountName, assetName, trackName, operationId);
        if (inner != null) {
            return new AssetTrackImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private OperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }
}
