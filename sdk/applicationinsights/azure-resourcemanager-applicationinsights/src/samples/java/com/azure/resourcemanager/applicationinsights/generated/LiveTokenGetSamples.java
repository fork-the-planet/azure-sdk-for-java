// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

/**
 * Samples for LiveToken Get.
 */
public final class LiveTokenGetSamples {
    /*
     * x-ms-original-file:
     * specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2021-10-14/examples/LiveTokenGet.
     * json
     */
    /**
     * Sample code: Get live token for resource.
     * 
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void
        getLiveTokenForResource(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.liveTokens()
            .getWithResponse(
                "subscriptions/df602c9c-7aa0-407d-a6fb-eb20c8bd1192/resourceGroups/FabrikamFiberApp/providers/microsoft.insights/components/CustomAvailabilityTest/providers/microsoft.insights/generatelivetoken",
                com.azure.core.util.Context.NONE);
    }
}
