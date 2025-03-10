// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

/**
 * Samples for RoleAssignments Delete.
 */
public final class RoleAssignmentsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/customer-insights/resource-manager/Microsoft.CustomerInsights/stable/2017-04-26/examples/
     * RoleAssignmentsDelete.json
     */
    /**
     * Sample code: RoleAssignments_Delete.
     * 
     * @param manager Entry point to CustomerInsightsManager.
     */
    public static void
        roleAssignmentsDelete(com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager) {
        manager.roleAssignments()
            .deleteWithResponse("TestHubRG", "sdkTestHub", "assignmentName8976", com.azure.core.util.Context.NONE);
    }
}
