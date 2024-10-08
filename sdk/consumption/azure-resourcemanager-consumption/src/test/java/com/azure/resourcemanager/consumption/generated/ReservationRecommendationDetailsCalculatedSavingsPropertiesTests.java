// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.consumption.models.ReservationRecommendationDetailsCalculatedSavingsProperties;
import org.junit.jupiter.api.Assertions;

public final class ReservationRecommendationDetailsCalculatedSavingsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationRecommendationDetailsCalculatedSavingsProperties model = BinaryData.fromString(
            "{\"onDemandCost\":75.00902,\"overageCost\":20.696604,\"quantity\":41.557693,\"reservationCost\":47.54201,\"totalReservationCost\":51.447792,\"reservedUnitCount\":98.37528,\"savings\":14.778721}")
            .toObject(ReservationRecommendationDetailsCalculatedSavingsProperties.class);
        Assertions.assertEquals(98.37528F, model.reservedUnitCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationRecommendationDetailsCalculatedSavingsProperties model
            = new ReservationRecommendationDetailsCalculatedSavingsProperties().withReservedUnitCount(98.37528F);
        model
            = BinaryData.fromObject(model).toObject(ReservationRecommendationDetailsCalculatedSavingsProperties.class);
        Assertions.assertEquals(98.37528F, model.reservedUnitCount());
    }
}
