// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.cloudhealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cloudhealth.models.DependenciesAggregationType;
import com.azure.resourcemanager.cloudhealth.models.DependenciesSignalGroup;
import org.junit.jupiter.api.Assertions;

public final class DependenciesSignalGroupTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DependenciesSignalGroup model = BinaryData.fromString(
            "{\"aggregationType\":\"Thresholds\",\"degradedThreshold\":\"pnapnyiropuh\",\"unhealthyThreshold\":\"gvpgy\"}")
            .toObject(DependenciesSignalGroup.class);
        Assertions.assertEquals(DependenciesAggregationType.THRESHOLDS, model.aggregationType());
        Assertions.assertEquals("pnapnyiropuh", model.degradedThreshold());
        Assertions.assertEquals("gvpgy", model.unhealthyThreshold());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DependenciesSignalGroup model
            = new DependenciesSignalGroup().withAggregationType(DependenciesAggregationType.THRESHOLDS)
                .withDegradedThreshold("pnapnyiropuh")
                .withUnhealthyThreshold("gvpgy");
        model = BinaryData.fromObject(model).toObject(DependenciesSignalGroup.class);
        Assertions.assertEquals(DependenciesAggregationType.THRESHOLDS, model.aggregationType());
        Assertions.assertEquals("pnapnyiropuh", model.degradedThreshold());
        Assertions.assertEquals("gvpgy", model.unhealthyThreshold());
    }
}
