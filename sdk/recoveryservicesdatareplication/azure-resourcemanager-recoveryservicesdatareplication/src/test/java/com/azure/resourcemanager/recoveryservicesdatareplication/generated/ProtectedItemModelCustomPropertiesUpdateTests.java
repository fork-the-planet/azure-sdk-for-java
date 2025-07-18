// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ProtectedItemModelCustomPropertiesUpdate;

public final class ProtectedItemModelCustomPropertiesUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProtectedItemModelCustomPropertiesUpdate model
            = BinaryData.fromString("{\"instanceType\":\"ProtectedItemModelCustomPropertiesUpdate\"}")
                .toObject(ProtectedItemModelCustomPropertiesUpdate.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProtectedItemModelCustomPropertiesUpdate model = new ProtectedItemModelCustomPropertiesUpdate();
        model = BinaryData.fromObject(model).toObject(ProtectedItemModelCustomPropertiesUpdate.class);
    }
}
