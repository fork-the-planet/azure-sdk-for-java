// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.LocalUserNotAllowed;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LocalUserNotAllowedTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LocalUserNotAllowed model = BinaryData.fromString(
            "{\"ruleType\":\"LocalUserNotAllowed\",\"allowlistValues\":[\"dpuviyf\",\"aabeolhbhlvbmxuq\"],\"valueType\":\"IpCidr\",\"displayName\":\"tkcudfbsfarfsiow\",\"description\":\"jxnqp\",\"isEnabled\":true}")
            .toObject(LocalUserNotAllowed.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("dpuviyf", model.allowlistValues().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LocalUserNotAllowed model = new LocalUserNotAllowed().withIsEnabled(true)
            .withAllowlistValues(Arrays.asList("dpuviyf", "aabeolhbhlvbmxuq"));
        model = BinaryData.fromObject(model).toObject(LocalUserNotAllowed.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("dpuviyf", model.allowlistValues().get(0));
    }
}
