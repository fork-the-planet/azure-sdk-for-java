// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

/**
 * Samples for Catalogs ListDevices.
 */
public final class CatalogsListDevicesSamples {
    /*
     * x-ms-original-file:
     * specification/sphere/resource-manager/Microsoft.AzureSphere/stable/2024-04-01/examples/PostListDevicesByCatalog.
     * json
     */
    /**
     * Sample code: Catalogs_ListDevices.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsListDevices(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs()
            .listDevices("MyResourceGroup1", "MyCatalog1", null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
