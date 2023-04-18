// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confidentialledger.fluent.models.ManagedCcfInner;
import com.azure.resourcemanager.confidentialledger.models.ManagedCcfList;
import com.azure.resourcemanager.confidentialledger.models.ManagedCcfProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedCcfListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedCcfList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"appName\":\"joghmewuama\",\"appUri\":\"rzayv\",\"identityServiceUri\":\"pgvdf\",\"memberIdentityCertificates\":[],\"provisioningState\":\"Deleting\",\"nodeCount\":1659633182},\"location\":\"tqxln\",\"tags\":{\"xdqmidtthzrvqdra\":\"efgugnxk\",\"skanyk\":\"hjybigehoqfbo\",\"nhzgpphrcgyn\":\"zlcuiywgqywgndrv\"},\"id\":\"ocpecfvmmco\",\"name\":\"fsxlzevgbmqjqa\",\"type\":\"c\"}],\"nextLink\":\"mivkwlzuvcc\"}")
                .toObject(ManagedCcfList.class);
        Assertions.assertEquals("tqxln", model.value().get(0).location());
        Assertions.assertEquals("efgugnxk", model.value().get(0).tags().get("xdqmidtthzrvqdra"));
        Assertions.assertEquals(1659633182, model.value().get(0).properties().nodeCount());
        Assertions.assertEquals("mivkwlzuvcc", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedCcfList model =
            new ManagedCcfList()
                .withValue(
                    Arrays
                        .asList(
                            new ManagedCcfInner()
                                .withLocation("tqxln")
                                .withTags(
                                    mapOf(
                                        "xdqmidtthzrvqdra",
                                        "efgugnxk",
                                        "skanyk",
                                        "hjybigehoqfbo",
                                        "nhzgpphrcgyn",
                                        "zlcuiywgqywgndrv"))
                                .withProperties(
                                    new ManagedCcfProperties()
                                        .withMemberIdentityCertificates(Arrays.asList())
                                        .withNodeCount(1659633182))))
                .withNextLink("mivkwlzuvcc");
        model = BinaryData.fromObject(model).toObject(ManagedCcfList.class);
        Assertions.assertEquals("tqxln", model.value().get(0).location());
        Assertions.assertEquals("efgugnxk", model.value().get(0).tags().get("xdqmidtthzrvqdra"));
        Assertions.assertEquals(1659633182, model.value().get(0).properties().nodeCount());
        Assertions.assertEquals("mivkwlzuvcc", model.nextLink());
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