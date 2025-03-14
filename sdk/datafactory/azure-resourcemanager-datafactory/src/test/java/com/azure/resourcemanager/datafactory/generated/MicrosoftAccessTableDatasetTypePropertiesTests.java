// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.MicrosoftAccessTableDatasetTypeProperties;

public final class MicrosoftAccessTableDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MicrosoftAccessTableDatasetTypeProperties model = BinaryData.fromString("{\"tableName\":\"dataeyxdyu\"}")
            .toObject(MicrosoftAccessTableDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MicrosoftAccessTableDatasetTypeProperties model
            = new MicrosoftAccessTableDatasetTypeProperties().withTableName("dataeyxdyu");
        model = BinaryData.fromObject(model).toObject(MicrosoftAccessTableDatasetTypeProperties.class);
    }
}
