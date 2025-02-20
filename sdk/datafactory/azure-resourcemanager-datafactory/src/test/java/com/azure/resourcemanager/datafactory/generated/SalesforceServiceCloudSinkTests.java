// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceServiceCloudSink;
import com.azure.resourcemanager.datafactory.models.SalesforceSinkWriteBehavior;
import org.junit.jupiter.api.Assertions;

public final class SalesforceServiceCloudSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceServiceCloudSink model = BinaryData.fromString(
            "{\"type\":\"SalesforceServiceCloudSink\",\"writeBehavior\":\"Upsert\",\"externalIdFieldName\":\"datafl\",\"ignoreNullValues\":\"datagrnh\",\"writeBatchSize\":\"datasdmovbvnjyqqofdg\",\"writeBatchTimeout\":\"dataykc\",\"sinkRetryCount\":\"dataln\",\"sinkRetryWait\":\"datarggytyvox\",\"maxConcurrentConnections\":\"databyjg\",\"disableMetricsCollection\":\"datazjmukfwmhzarrft\",\"\":{\"vvab\":\"dataifrjgvhone\"}}")
            .toObject(SalesforceServiceCloudSink.class);
        Assertions.assertEquals(SalesforceSinkWriteBehavior.UPSERT, model.writeBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceServiceCloudSink model = new SalesforceServiceCloudSink().withWriteBatchSize("datasdmovbvnjyqqofdg")
            .withWriteBatchTimeout("dataykc")
            .withSinkRetryCount("dataln")
            .withSinkRetryWait("datarggytyvox")
            .withMaxConcurrentConnections("databyjg")
            .withDisableMetricsCollection("datazjmukfwmhzarrft")
            .withWriteBehavior(SalesforceSinkWriteBehavior.UPSERT)
            .withExternalIdFieldName("datafl")
            .withIgnoreNullValues("datagrnh");
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudSink.class);
        Assertions.assertEquals(SalesforceSinkWriteBehavior.UPSERT, model.writeBehavior());
    }
}
