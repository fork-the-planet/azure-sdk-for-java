// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mongocluster.models.PrivateLinkResourceProperties;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceProperties model = BinaryData
            .fromString("{\"groupId\":\"bob\",\"requiredMembers\":[\"hm\",\"w\"],\"requiredZoneNames\":[\"a\"]}")
            .toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("a", model.requiredZoneNames().get(0));
    }
}
