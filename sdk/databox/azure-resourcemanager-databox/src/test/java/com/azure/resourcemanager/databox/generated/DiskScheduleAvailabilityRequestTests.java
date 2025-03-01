// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.DiskScheduleAvailabilityRequest;
import org.junit.jupiter.api.Assertions;

public final class DiskScheduleAvailabilityRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiskScheduleAvailabilityRequest model = BinaryData.fromString(
            "{\"skuName\":\"DataBoxDisk\",\"expectedDataSizeInTeraBytes\":404775625,\"storageLocation\":\"gq\",\"country\":\"yhejhzisxgfp\"}")
            .toObject(DiskScheduleAvailabilityRequest.class);
        Assertions.assertEquals("gq", model.storageLocation());
        Assertions.assertEquals("yhejhzisxgfp", model.country());
        Assertions.assertEquals(404775625, model.expectedDataSizeInTeraBytes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiskScheduleAvailabilityRequest model = new DiskScheduleAvailabilityRequest().withStorageLocation("gq")
            .withCountry("yhejhzisxgfp")
            .withExpectedDataSizeInTeraBytes(404775625);
        model = BinaryData.fromObject(model).toObject(DiskScheduleAvailabilityRequest.class);
        Assertions.assertEquals("gq", model.storageLocation());
        Assertions.assertEquals("yhejhzisxgfp", model.country());
        Assertions.assertEquals(404775625, model.expectedDataSizeInTeraBytes());
    }
}
