// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deploymentmanager.models.SasAuthentication;
import org.junit.jupiter.api.Assertions;

public final class SasAuthenticationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SasAuthentication model
            = BinaryData.fromString("{\"type\":\"Sas\",\"properties\":{\"sasUri\":\"shcbkhajdeyeamdp\"}}")
                .toObject(SasAuthentication.class);
        Assertions.assertEquals("shcbkhajdeyeamdp", model.sasUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SasAuthentication model = new SasAuthentication().withSasUri("shcbkhajdeyeamdp");
        model = BinaryData.fromObject(model).toObject(SasAuthentication.class);
        Assertions.assertEquals("shcbkhajdeyeamdp", model.sasUri());
    }
}
