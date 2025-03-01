// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

/**
 * Samples for PublicCloudConnectors GetByResourceGroup.
 */
public final class PublicCloudConnectorsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-12-01/PublicCloudConnectors_Get.json
     */
    /**
     * Sample code: PublicCloudConnectors_Get.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void
        publicCloudConnectorsGet(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.publicCloudConnectors()
            .getByResourceGroupWithResponse("rgpublicCloud", "rzygvnpsnrdylwzdbsscjazvamyxmh",
                com.azure.core.util.Context.NONE);
    }
}
