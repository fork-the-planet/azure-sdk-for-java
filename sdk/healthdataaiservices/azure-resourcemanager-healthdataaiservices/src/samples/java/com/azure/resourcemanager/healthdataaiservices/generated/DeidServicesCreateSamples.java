// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.healthdataaiservices.generated;

import com.azure.resourcemanager.healthdataaiservices.models.DeidServiceProperties;
import com.azure.resourcemanager.healthdataaiservices.models.ManagedServiceIdentity;
import com.azure.resourcemanager.healthdataaiservices.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.healthdataaiservices.models.PublicNetworkAccess;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DeidServices Create.
 */
public final class DeidServicesCreateSamples {
    /*
     * x-ms-original-file: 2024-09-20/DeidServices_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: DeidServices_Create - generated by [MaximumSet] rule. [stable].
     * 
     * @param manager Entry point to HealthDataAIServicesManager.
     */
    public static void deidServicesCreateGeneratedByMaximumSetRuleStable(
        com.azure.resourcemanager.healthdataaiservices.HealthDataAIServicesManager manager) {
        manager.deidServices()
            .define("deidTest")
            .withRegion("qwyhvdwcsjulggagdqxlmazcl")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf())
            .withProperties(new DeidServiceProperties().withPublicNetworkAccess(PublicNetworkAccess.ENABLED))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE)
                .withUserAssignedIdentities(mapOf()))
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
