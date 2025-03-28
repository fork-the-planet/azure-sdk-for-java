// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/**
 * Samples for SimGroups GetByResourceGroup.
 */
public final class SimGroupsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2024-04-01/examples/SimGroupGet.json
     */
    /**
     * Sample code: Get SIM group.
     * 
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void getSIMGroup(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.simGroups()
            .getByResourceGroupWithResponse("testResourceGroupName", "testSimGroupName",
                com.azure.core.util.Context.NONE);
    }
}
