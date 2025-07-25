// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.implementation.models.GiVersionListResult;
import org.junit.jupiter.api.Assertions;

public final class GiVersionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GiVersionListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"version\":\"twaenuuzko\"},\"id\":\"minrfdw\",\"name\":\"yuhhziu\",\"type\":\"efozbhdms\"},{\"properties\":{\"version\":\"mzqhoftrmaequi\"},\"id\":\"xicslfao\",\"name\":\"z\",\"type\":\"iyylhalnswhccsp\"}],\"nextLink\":\"aivwitqscywu\"}")
            .toObject(GiVersionListResult.class);
        Assertions.assertEquals("twaenuuzko", model.value().get(0).properties().version());
        Assertions.assertEquals("aivwitqscywu", model.nextLink());
    }
}
