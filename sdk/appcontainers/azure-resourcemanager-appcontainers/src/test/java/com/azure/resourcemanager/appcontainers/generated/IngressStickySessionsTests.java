// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.Affinity;
import com.azure.resourcemanager.appcontainers.models.IngressStickySessions;
import org.junit.jupiter.api.Assertions;

public final class IngressStickySessionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IngressStickySessions model =
            BinaryData.fromString("{\"affinity\":\"sticky\"}").toObject(IngressStickySessions.class);
        Assertions.assertEquals(Affinity.STICKY, model.affinity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IngressStickySessions model = new IngressStickySessions().withAffinity(Affinity.STICKY);
        model = BinaryData.fromObject(model).toObject(IngressStickySessions.class);
        Assertions.assertEquals(Affinity.STICKY, model.affinity());
    }
}