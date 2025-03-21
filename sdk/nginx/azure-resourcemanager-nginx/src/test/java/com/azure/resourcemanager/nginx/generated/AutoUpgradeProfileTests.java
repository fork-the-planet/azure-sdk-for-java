// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.AutoUpgradeProfile;
import org.junit.jupiter.api.Assertions;

public final class AutoUpgradeProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutoUpgradeProfile model
            = BinaryData.fromString("{\"upgradeChannel\":\"c\"}").toObject(AutoUpgradeProfile.class);
        Assertions.assertEquals("c", model.upgradeChannel());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutoUpgradeProfile model = new AutoUpgradeProfile().withUpgradeChannel("c");
        model = BinaryData.fromObject(model).toObject(AutoUpgradeProfile.class);
        Assertions.assertEquals("c", model.upgradeChannel());
    }
}
