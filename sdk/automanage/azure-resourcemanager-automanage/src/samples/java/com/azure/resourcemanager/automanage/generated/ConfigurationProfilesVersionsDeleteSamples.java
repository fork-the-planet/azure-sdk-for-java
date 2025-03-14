// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.generated;

/**
 * Samples for ConfigurationProfilesVersions Delete.
 */
public final class ConfigurationProfilesVersionsDeleteSamples {
    /*
     * x-ms-original-file: specification/automanage/resource-manager/Microsoft.Automanage/stable/2022-05-04/examples/
     * deleteConfigurationProfileVersion.json
     */
    /**
     * Sample code: Delete a configuration profile version.
     * 
     * @param manager Entry point to AutomanageManager.
     */
    public static void
        deleteAConfigurationProfileVersion(com.azure.resourcemanager.automanage.AutomanageManager manager) {
        manager.configurationProfilesVersions()
            .deleteWithResponse("rg", "customConfigurationProfile", "version1", com.azure.core.util.Context.NONE);
    }
}
