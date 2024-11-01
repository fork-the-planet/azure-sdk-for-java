// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

/**
 * Samples for VNetPeering ListByWorkspace.
 */
public final class VNetPeeringListByWorkspaceSamples {
    /*
     * x-ms-original-file: specification/databricks/resource-manager/Microsoft.Databricks/stable/2023-02-01/examples/
     * WorkspaceVirtualNetPeeringList.json
     */
    /**
     * Sample code: List all vNet Peerings for the workspace.
     * 
     * @param manager Entry point to AzureDatabricksManager.
     */
    public static void
        listAllVNetPeeringsForTheWorkspace(com.azure.resourcemanager.databricks.AzureDatabricksManager manager) {
        manager.vNetPeerings().listByWorkspace("rg", "myWorkspace", com.azure.core.util.Context.NONE);
    }
}
