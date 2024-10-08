// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadataPropertyBagItem;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticDataProviderMetadataPropertyBagItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticDataProviderMetadataPropertyBagItem model
            = BinaryData.fromString("{\"name\":\"vjlboxqvk\",\"value\":\"mxho\"}")
                .toObject(DiagnosticDataProviderMetadataPropertyBagItem.class);
        Assertions.assertEquals("vjlboxqvk", model.name());
        Assertions.assertEquals("mxho", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticDataProviderMetadataPropertyBagItem model
            = new DiagnosticDataProviderMetadataPropertyBagItem().withName("vjlboxqvk").withValue("mxho");
        model = BinaryData.fromObject(model).toObject(DiagnosticDataProviderMetadataPropertyBagItem.class);
        Assertions.assertEquals("vjlboxqvk", model.name());
        Assertions.assertEquals("mxho", model.value());
    }
}
