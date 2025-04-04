// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.education.fluent.models.GrantDetailProperties;

public final class GrantDetailPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GrantDetailProperties model = BinaryData.fromString(
            "{\"offerCap\":{\"currency\":\"ixjsprozvcputeg\",\"value\":94.32142},\"effectiveDate\":\"2021-06-23T09:15:06Z\",\"offerType\":\"Student\",\"expirationDate\":\"2021-10-01T05:00:03Z\",\"status\":\"Inactive\",\"allocatedBudget\":{\"currency\":\"pjhulsuuvmkj\",\"value\":0.87149143}}")
            .toObject(GrantDetailProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GrantDetailProperties model = new GrantDetailProperties();
        model = BinaryData.fromObject(model).toObject(GrantDetailProperties.class);
    }
}
