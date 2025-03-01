// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.resourcemanager.devcenter.models.DevCenter;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DevCenters Update.
 */
public final class DevCentersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2024-02-01/examples/DevCenters_Patch.json
     */
    /**
     * Sample code: DevCenters_Update.
     * 
     * @param manager Entry point to DevCenterManager.
     */
    public static void devCentersUpdate(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        DevCenter resource = manager.devCenters()
            .getByResourceGroupWithResponse("rg1", "Contoso", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("CostCode", "fakeTokenPlaceholder")).apply();
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
