// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.SkuAvailabilityValidationRequest;
import com.azure.resourcemanager.databox.models.SkuName;
import com.azure.resourcemanager.databox.models.TransferType;
import org.junit.jupiter.api.Assertions;

public final class SkuAvailabilityValidationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuAvailabilityValidationRequest model = BinaryData.fromString(
            "{\"validationType\":\"ValidateSkuAvailability\",\"deviceType\":\"DataBoxDisk\",\"transferType\":\"ImportToAzure\",\"country\":\"klff\",\"location\":\"mouwqlgzrfzeey\"}")
            .toObject(SkuAvailabilityValidationRequest.class);
        Assertions.assertEquals(SkuName.DATA_BOX_DISK, model.deviceType());
        Assertions.assertEquals(TransferType.IMPORT_TO_AZURE, model.transferType());
        Assertions.assertEquals("klff", model.country());
        Assertions.assertEquals("mouwqlgzrfzeey", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuAvailabilityValidationRequest model
            = new SkuAvailabilityValidationRequest().withDeviceType(SkuName.DATA_BOX_DISK)
                .withTransferType(TransferType.IMPORT_TO_AZURE)
                .withCountry("klff")
                .withLocation("mouwqlgzrfzeey");
        model = BinaryData.fromObject(model).toObject(SkuAvailabilityValidationRequest.class);
        Assertions.assertEquals(SkuName.DATA_BOX_DISK, model.deviceType());
        Assertions.assertEquals(TransferType.IMPORT_TO_AZURE, model.transferType());
        Assertions.assertEquals("klff", model.country());
        Assertions.assertEquals("mouwqlgzrfzeey", model.location());
    }
}
