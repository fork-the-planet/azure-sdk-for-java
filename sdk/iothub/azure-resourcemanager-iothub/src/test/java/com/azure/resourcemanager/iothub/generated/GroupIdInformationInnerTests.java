// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.iothub.models.GroupIdInformationProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GroupIdInformationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GroupIdInformationInner model =
            BinaryData
                .fromString(
                    "{\"id\":\"nzar\",\"name\":\"lquuijfqkacewii\",\"type\":\"pubjibw\",\"properties\":{\"groupId\":\"f\",\"requiredMembers\":[\"qkvpuvksgplsakn\",\"n\",\"synljphuopxodl\",\"iyntorzihle\"],\"requiredZoneNames\":[\"swsrms\",\"yzrpzbchckqqzq\",\"ox\"]}}")
                .toObject(GroupIdInformationInner.class);
        Assertions.assertEquals("f", model.properties().groupId());
        Assertions.assertEquals("qkvpuvksgplsakn", model.properties().requiredMembers().get(0));
        Assertions.assertEquals("swsrms", model.properties().requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GroupIdInformationInner model =
            new GroupIdInformationInner()
                .withProperties(
                    new GroupIdInformationProperties()
                        .withGroupId("f")
                        .withRequiredMembers(Arrays.asList("qkvpuvksgplsakn", "n", "synljphuopxodl", "iyntorzihle"))
                        .withRequiredZoneNames(Arrays.asList("swsrms", "yzrpzbchckqqzq", "ox")));
        model = BinaryData.fromObject(model).toObject(GroupIdInformationInner.class);
        Assertions.assertEquals("f", model.properties().groupId());
        Assertions.assertEquals("qkvpuvksgplsakn", model.properties().requiredMembers().get(0));
        Assertions.assertEquals("swsrms", model.properties().requiredZoneNames().get(0));
    }
}