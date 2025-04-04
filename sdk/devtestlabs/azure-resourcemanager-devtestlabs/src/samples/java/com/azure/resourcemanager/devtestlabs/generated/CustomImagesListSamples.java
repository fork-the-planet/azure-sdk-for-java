// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

/**
 * Samples for CustomImages List.
 */
public final class CustomImagesListSamples {
    /*
     * x-ms-original-file:
     * specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/CustomImages_List.json
     */
    /**
     * Sample code: CustomImages_List.
     * 
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void customImagesList(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager.customImages()
            .list("resourceGroupName", "{labName}", null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
