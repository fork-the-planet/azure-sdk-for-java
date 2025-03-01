// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotoperations.fluent.models.DataflowProfileResourceInner;
import com.azure.resourcemanager.iotoperations.models.DataflowProfileProperties;
import com.azure.resourcemanager.iotoperations.models.DiagnosticsLogs;
import com.azure.resourcemanager.iotoperations.models.ExtendedLocation;
import com.azure.resourcemanager.iotoperations.models.ExtendedLocationType;
import com.azure.resourcemanager.iotoperations.models.Metrics;
import com.azure.resourcemanager.iotoperations.models.ProfileDiagnostics;
import org.junit.jupiter.api.Assertions;

public final class DataflowProfileResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataflowProfileResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"diagnostics\":{\"logs\":{\"level\":\"olbgycduiertgccy\"},\"metrics\":{\"prometheusPort\":50940581}},\"instanceCount\":76010479,\"provisioningState\":\"Canceled\"},\"extendedLocation\":{\"name\":\"lqlfm\",\"type\":\"CustomLocation\"},\"id\":\"bbglzpswiydmc\",\"name\":\"yhz\",\"type\":\"xssadbzmnvdf\"}")
            .toObject(DataflowProfileResourceInner.class);
        Assertions.assertEquals("olbgycduiertgccy", model.properties().diagnostics().logs().level());
        Assertions.assertEquals(50940581, model.properties().diagnostics().metrics().prometheusPort());
        Assertions.assertEquals(76010479, model.properties().instanceCount());
        Assertions.assertEquals("lqlfm", model.extendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.CUSTOM_LOCATION, model.extendedLocation().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataflowProfileResourceInner model = new DataflowProfileResourceInner()
            .withProperties(
                new DataflowProfileProperties()
                    .withDiagnostics(
                        new ProfileDiagnostics().withLogs(new DiagnosticsLogs().withLevel("olbgycduiertgccy"))
                            .withMetrics(new Metrics().withPrometheusPort(50940581)))
                    .withInstanceCount(76010479))
            .withExtendedLocation(
                new ExtendedLocation().withName("lqlfm").withType(ExtendedLocationType.CUSTOM_LOCATION));
        model = BinaryData.fromObject(model).toObject(DataflowProfileResourceInner.class);
        Assertions.assertEquals("olbgycduiertgccy", model.properties().diagnostics().logs().level());
        Assertions.assertEquals(50940581, model.properties().diagnostics().metrics().prometheusPort());
        Assertions.assertEquals(76010479, model.properties().instanceCount());
        Assertions.assertEquals("lqlfm", model.extendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.CUSTOM_LOCATION, model.extendedLocation().type());
    }
}
