// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

/**
 * Samples for StandbyContainerGroupPoolRuntimeViews Get.
 */
public final class StandbyContainerGroupPoolRuntimeViewsGetSamples {
    /*
     * x-ms-original-file: 2025-03-01/StandbyContainerGroupPoolRuntimeViews_Get.json
     */
    /**
     * Sample code: StandbyContainerGroupPoolRuntimeViews_Get.
     * 
     * @param manager Entry point to StandbyPoolManager.
     */
    public static void
        standbyContainerGroupPoolRuntimeViewsGet(com.azure.resourcemanager.standbypool.StandbyPoolManager manager) {
        manager.standbyContainerGroupPoolRuntimeViews()
            .getWithResponse("rgstandbypool", "pool", "latest", com.azure.core.util.Context.NONE);
    }
}
