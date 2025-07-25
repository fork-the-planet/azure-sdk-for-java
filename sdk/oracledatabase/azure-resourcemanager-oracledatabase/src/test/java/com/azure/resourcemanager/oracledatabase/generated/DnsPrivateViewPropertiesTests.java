// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.DnsPrivateViewProperties;
import com.azure.resourcemanager.oracledatabase.models.DnsPrivateViewsLifecycleState;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class DnsPrivateViewPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DnsPrivateViewProperties model = BinaryData.fromString(
            "{\"ocid\":\"amvdkfwynwcvtbv\",\"displayName\":\"ayhmtnvyqiatkz\",\"isProtected\":false,\"lifecycleState\":\"Updating\",\"self\":\"npwzcjaes\",\"timeCreated\":\"2021-02-13T02:39:36Z\",\"timeUpdated\":\"2021-09-24T01:03:33Z\",\"provisioningState\":\"Canceled\"}")
            .toObject(DnsPrivateViewProperties.class);
        Assertions.assertEquals("amvdkfwynwcvtbv", model.ocid());
        Assertions.assertEquals("ayhmtnvyqiatkz", model.displayName());
        Assertions.assertFalse(model.isProtected());
        Assertions.assertEquals(DnsPrivateViewsLifecycleState.UPDATING, model.lifecycleState());
        Assertions.assertEquals("npwzcjaes", model.self());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-13T02:39:36Z"), model.timeCreated());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-24T01:03:33Z"), model.timeUpdated());
    }
}
