// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DelegatedSubnetUsage;

public final class DelegatedSubnetUsageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DelegatedSubnetUsage model = BinaryData.fromString("{\"subnetName\":\"x\",\"usage\":7062133650624687777}")
            .toObject(DelegatedSubnetUsage.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DelegatedSubnetUsage model = new DelegatedSubnetUsage();
        model = BinaryData.fromObject(model).toObject(DelegatedSubnetUsage.class);
    }
}
