// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.resourcemanager.kusto.models.Cluster;

/**
 * Samples for Clusters Update.
 */
public final class ClustersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2024-04-13/examples/KustoClustersUpdate.json
     */
    /**
     * Sample code: KustoClustersUpdate.
     * 
     * @param manager Entry point to KustoManager.
     */
    public static void kustoClustersUpdate(com.azure.resourcemanager.kusto.KustoManager manager) {
        Cluster resource = manager.clusters()
            .getByResourceGroupWithResponse("kustorptest", "kustoCluster2", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withIfMatch("*").apply();
    }
}
