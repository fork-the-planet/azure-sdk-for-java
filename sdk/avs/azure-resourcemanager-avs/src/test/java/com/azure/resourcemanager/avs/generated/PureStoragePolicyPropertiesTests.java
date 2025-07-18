// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.PureStoragePolicyProperties;
import org.junit.jupiter.api.Assertions;

public final class PureStoragePolicyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PureStoragePolicyProperties model = BinaryData.fromString(
            "{\"storagePolicyDefinition\":\"gdakchz\",\"storagePoolId\":\"vl\",\"provisioningState\":\"Succeeded\"}")
            .toObject(PureStoragePolicyProperties.class);
        Assertions.assertEquals("gdakchz", model.storagePolicyDefinition());
        Assertions.assertEquals("vl", model.storagePoolId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PureStoragePolicyProperties model
            = new PureStoragePolicyProperties().withStoragePolicyDefinition("gdakchz").withStoragePoolId("vl");
        model = BinaryData.fromObject(model).toObject(PureStoragePolicyProperties.class);
        Assertions.assertEquals("gdakchz", model.storagePolicyDefinition());
        Assertions.assertEquals("vl", model.storagePoolId());
    }
}
