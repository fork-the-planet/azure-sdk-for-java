// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.MaintenanceWindowsInner;
import com.azure.resourcemanager.synapse.models.DayOfWeek;
import com.azure.resourcemanager.synapse.models.MaintenanceWindowTimeRange;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MaintenanceWindowsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MaintenanceWindowsInner model = BinaryData.fromString(
            "{\"properties\":{\"timeRanges\":[{\"dayOfWeek\":\"Tuesday\",\"startTime\":\"lerchpq\",\"duration\":\"f\"},{\"dayOfWeek\":\"Thursday\",\"startTime\":\"bwidfcxsspuunn\",\"duration\":\"yhkx\"},{\"dayOfWeek\":\"Tuesday\",\"startTime\":\"rihpfhoq\",\"duration\":\"a\"},{\"dayOfWeek\":\"Sunday\",\"startTime\":\"omdjvlpjxxkzbrm\",\"duration\":\"eivsiykzkdnc\"}]},\"id\":\"dxonbzoggculap\",\"name\":\"wyrpgogtqxepnyl\",\"type\":\"fuajly\"}")
            .toObject(MaintenanceWindowsInner.class);
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.timeRanges().get(0).dayOfWeek());
        Assertions.assertEquals("lerchpq", model.timeRanges().get(0).startTime());
        Assertions.assertEquals("f", model.timeRanges().get(0).duration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MaintenanceWindowsInner model = new MaintenanceWindowsInner().withTimeRanges(Arrays.asList(
            new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.TUESDAY)
                .withStartTime("lerchpq")
                .withDuration("f"),
            new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.THURSDAY)
                .withStartTime("bwidfcxsspuunn")
                .withDuration("yhkx"),
            new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.TUESDAY)
                .withStartTime("rihpfhoq")
                .withDuration("a"),
            new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.SUNDAY)
                .withStartTime("omdjvlpjxxkzbrm")
                .withDuration("eivsiykzkdnc")));
        model = BinaryData.fromObject(model).toObject(MaintenanceWindowsInner.class);
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.timeRanges().get(0).dayOfWeek());
        Assertions.assertEquals("lerchpq", model.timeRanges().get(0).startTime());
        Assertions.assertEquals("f", model.timeRanges().get(0).duration());
    }
}
