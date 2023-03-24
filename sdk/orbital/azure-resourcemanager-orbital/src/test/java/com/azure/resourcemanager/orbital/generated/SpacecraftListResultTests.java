// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.orbital.fluent.models.SpacecraftInner;
import com.azure.resourcemanager.orbital.models.SpacecraftListResult;
import com.azure.resourcemanager.orbital.models.SpacecraftsPropertiesProvisioningState;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SpacecraftListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SpacecraftListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"creating\",\"noradId\":\"hxqh\",\"titleLine\":\"bifpikxwczb\",\"tleLine1\":\"scnpqxuhivy\",\"tleLine2\":\"n\",\"links\":[]},\"location\":\"b\",\"tags\":{\"vd\":\"k\",\"fwvuk\":\"mjgr\"},\"id\":\"gaudcc\",\"name\":\"nhsjcnyej\",\"type\":\"kryhtnapczwlokj\"}],\"nextLink\":\"mkkvnip\"}")
                .toObject(SpacecraftListResult.class);
        Assertions.assertEquals("b", model.value().get(0).location());
        Assertions.assertEquals("k", model.value().get(0).tags().get("vd"));
        Assertions
            .assertEquals(SpacecraftsPropertiesProvisioningState.CREATING, model.value().get(0).provisioningState());
        Assertions.assertEquals("hxqh", model.value().get(0).noradId());
        Assertions.assertEquals("bifpikxwczb", model.value().get(0).titleLine());
        Assertions.assertEquals("scnpqxuhivy", model.value().get(0).tleLine1());
        Assertions.assertEquals("n", model.value().get(0).tleLine2());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SpacecraftListResult model =
            new SpacecraftListResult()
                .withValue(
                    Arrays
                        .asList(
                            new SpacecraftInner()
                                .withLocation("b")
                                .withTags(mapOf("vd", "k", "fwvuk", "mjgr"))
                                .withProvisioningState(SpacecraftsPropertiesProvisioningState.CREATING)
                                .withNoradId("hxqh")
                                .withTitleLine("bifpikxwczb")
                                .withTleLine1("scnpqxuhivy")
                                .withTleLine2("n")
                                .withLinks(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(SpacecraftListResult.class);
        Assertions.assertEquals("b", model.value().get(0).location());
        Assertions.assertEquals("k", model.value().get(0).tags().get("vd"));
        Assertions
            .assertEquals(SpacecraftsPropertiesProvisioningState.CREATING, model.value().get(0).provisioningState());
        Assertions.assertEquals("hxqh", model.value().get(0).noradId());
        Assertions.assertEquals("bifpikxwczb", model.value().get(0).titleLine());
        Assertions.assertEquals("scnpqxuhivy", model.value().get(0).tleLine1());
        Assertions.assertEquals("n", model.value().get(0).tleLine2());
    }

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