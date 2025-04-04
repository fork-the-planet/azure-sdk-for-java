// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

/**
 * Samples for ConfigurationAssignmentsForResourceGroup Delete.
 */
public final class ConfigurationAssignmentsForResourceGroupDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/maintenance/resource-manager/Microsoft.Maintenance/preview/2023-10-01-preview/examples/
     * ConfigurationAssignmentsForResourceGroup_Delete.json
     */
    /**
     * Sample code: ConfigurationAssignmentsForResourceGroup_Delete.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsForResourceGroupDelete(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentsForResourceGroups()
            .deleteByResourceGroupWithResponse("examplerg", "workervmConfiguration", com.azure.core.util.Context.NONE);
    }
}
