// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

/**
 * Samples for InventoryItems ListByVCenter.
 */
public final class InventoryItemsListByVCenterSamples {
    /*
     * x-ms-original-file:
     * specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/stable/2023-10-01/examples/
     * InventoryItems_ListByVCenter.json
     */
    /**
     * Sample code: InventoryItemsListByVCenter.
     * 
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void
        inventoryItemsListByVCenter(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.inventoryItems().listByVCenter("testrg", "ContosoVCenter", com.azure.core.util.Context.NONE);
    }
}
