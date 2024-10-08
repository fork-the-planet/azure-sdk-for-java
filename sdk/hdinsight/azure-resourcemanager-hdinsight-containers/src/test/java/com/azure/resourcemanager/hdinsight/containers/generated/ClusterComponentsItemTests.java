// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterComponentsItem;
import org.junit.jupiter.api.Assertions;

public final class ClusterComponentsItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterComponentsItem model = BinaryData.fromString("{\"name\":\"ispnqzahmgkbrp\",\"version\":\"dhibnuq\"}")
            .toObject(ClusterComponentsItem.class);
        Assertions.assertEquals("ispnqzahmgkbrp", model.name());
        Assertions.assertEquals("dhibnuq", model.version());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterComponentsItem model = new ClusterComponentsItem().withName("ispnqzahmgkbrp").withVersion("dhibnuq");
        model = BinaryData.fromObject(model).toObject(ClusterComponentsItem.class);
        Assertions.assertEquals("ispnqzahmgkbrp", model.name());
        Assertions.assertEquals("dhibnuq", model.version());
    }
}
