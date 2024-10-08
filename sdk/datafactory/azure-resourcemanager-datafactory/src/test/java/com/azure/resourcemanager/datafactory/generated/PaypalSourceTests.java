// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PaypalSource;

public final class PaypalSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PaypalSource model = BinaryData.fromString(
            "{\"type\":\"PaypalSource\",\"query\":\"dataylvrofhhitjhh\",\"queryTimeout\":\"datavwrc\",\"additionalColumns\":\"datahllmblls\",\"sourceRetryCount\":\"datafdrimoopfr\",\"sourceRetryWait\":\"datajjrhxornuoqpob\",\"maxConcurrentConnections\":\"datarsdx\",\"disableMetricsCollection\":\"datamq\",\"\":{\"lseoixqp\":\"databqyavcxj\",\"fsuwcmzpwkca\":\"datamsfqntakroxku\",\"zq\":\"datafq\"}}")
            .toObject(PaypalSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PaypalSource model = new PaypalSource().withSourceRetryCount("datafdrimoopfr")
            .withSourceRetryWait("datajjrhxornuoqpob")
            .withMaxConcurrentConnections("datarsdx")
            .withDisableMetricsCollection("datamq")
            .withQueryTimeout("datavwrc")
            .withAdditionalColumns("datahllmblls")
            .withQuery("dataylvrofhhitjhh");
        model = BinaryData.fromObject(model).toObject(PaypalSource.class);
    }
}
