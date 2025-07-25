// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ResourceAzStatus;

public final class ResourceAzStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceAzStatus model = BinaryData.fromString(
            "{\"resourceName\":\"rzgszufoxci\",\"resourceType\":\"p\",\"isZoneResilient\":false,\"details\":\"mciodhkhazxkhn\"}")
            .toObject(ResourceAzStatus.class);
    }
}
