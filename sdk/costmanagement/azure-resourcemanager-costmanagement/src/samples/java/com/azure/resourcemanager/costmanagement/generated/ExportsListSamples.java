// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

/**
 * Samples for Exports List.
 */
public final class ExportsListSamples {
    /*
     * x-ms-original-file:
     * specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/
     * ExportsGetByResourceGroup.json
     */
    /**
     * Sample code: ExportsGetByResourceGroup.
     * 
     * @param manager Entry point to CostManagementManager.
     */
    public static void
        exportsGetByResourceGroup(com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager.exports()
            .listWithResponse("subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MYDEVTESTRG", null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/
     * ExportsGetByDepartment.json
     */
    /**
     * Sample code: ExportsGetByDepartment.
     * 
     * @param manager Entry point to CostManagementManager.
     */
    public static void exportsGetByDepartment(com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager.exports()
            .listWithResponse("providers/Microsoft.Billing/billingAccounts/12/departments/123", null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/
     * ExportsGetByBillingAccount.json
     */
    /**
     * Sample code: ExportsGetByBillingAccount.
     * 
     * @param manager Entry point to CostManagementManager.
     */
    public static void
        exportsGetByBillingAccount(com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager.exports()
            .listWithResponse("providers/Microsoft.Billing/billingAccounts/123456", null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/
     * ExportsGetByEnrollmentAccount.json
     */
    /**
     * Sample code: ExportsGetByEnrollmentAccount.
     * 
     * @param manager Entry point to CostManagementManager.
     */
    public static void
        exportsGetByEnrollmentAccount(com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager.exports()
            .listWithResponse("providers/Microsoft.Billing/billingAccounts/100/enrollmentAccounts/456", null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/
     * ExportsGetByManagementGroup.json
     */
    /**
     * Sample code: ExportsGetByManagementGroup.
     * 
     * @param manager Entry point to CostManagementManager.
     */
    public static void
        exportsGetByManagementGroup(com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager.exports()
            .listWithResponse("providers/Microsoft.Management/managementGroups/TestMG", null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/
     * ExportsGetBySubscription.json
     */
    /**
     * Sample code: ExportsGetBySubscription.
     * 
     * @param manager Entry point to CostManagementManager.
     */
    public static void
        exportsGetBySubscription(com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager.exports()
            .listWithResponse("subscriptions/00000000-0000-0000-0000-000000000000", null,
                com.azure.core.util.Context.NONE);
    }
}
