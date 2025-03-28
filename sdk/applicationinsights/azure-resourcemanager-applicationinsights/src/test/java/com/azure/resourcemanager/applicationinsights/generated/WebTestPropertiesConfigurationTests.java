// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.WebTestPropertiesConfiguration;
import org.junit.jupiter.api.Assertions;

public final class WebTestPropertiesConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebTestPropertiesConfiguration model
            = BinaryData.fromString("{\"WebTest\":\"qjsdpydnfyhxdeo\"}").toObject(WebTestPropertiesConfiguration.class);
        Assertions.assertEquals("qjsdpydnfyhxdeo", model.webTest());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebTestPropertiesConfiguration model = new WebTestPropertiesConfiguration().withWebTest("qjsdpydnfyhxdeo");
        model = BinaryData.fromObject(model).toObject(WebTestPropertiesConfiguration.class);
        Assertions.assertEquals("qjsdpydnfyhxdeo", model.webTest());
    }
}
