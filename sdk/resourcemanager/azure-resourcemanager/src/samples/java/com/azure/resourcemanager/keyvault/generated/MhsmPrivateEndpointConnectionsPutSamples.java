// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

import com.azure.resourcemanager.keyvault.fluent.models.MhsmPrivateEndpointConnectionInner;
import com.azure.resourcemanager.keyvault.models.MhsmPrivateLinkServiceConnectionState;
import com.azure.resourcemanager.keyvault.models.PrivateEndpointServiceConnectionStatus;

/**
 * Samples for MhsmPrivateEndpointConnections Put.
 */
public final class MhsmPrivateEndpointConnectionsPutSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * ManagedHsm_putPrivateEndpointConnection.json
     */
    /**
     * Sample code: ManagedHsmPutPrivateEndpointConnection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void managedHsmPutPrivateEndpointConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.vaults()
            .manager()
            .serviceClient()
            .getMhsmPrivateEndpointConnections()
            .putWithResponse("sample-group", "sample-mhsm", "sample-pec",
                new MhsmPrivateEndpointConnectionInner()
                    .withPrivateLinkServiceConnectionState(new MhsmPrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("My name is Joe and I'm approving this.")),
                com.azure.core.util.Context.NONE);
    }
}
