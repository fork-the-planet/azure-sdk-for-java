// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.synapse.models.SensitivityLabelRank;
import org.junit.jupiter.api.Assertions;

public final class SensitivityLabelInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SensitivityLabelInner model = BinaryData.fromString(
            "{\"properties\":{\"schemaName\":\"zrp\",\"tableName\":\"imlnwiaaomylw\",\"columnName\":\"z\",\"labelName\":\"cse\",\"labelId\":\"wwnpj\",\"informationType\":\"fz\",\"informationTypeId\":\"pchwa\",\"isDisabled\":false,\"rank\":\"None\"},\"managedBy\":\"nfepgf\",\"id\":\"wetwlyxgncxykxh\",\"name\":\"jhlimmbcxfhbcpo\",\"type\":\"xvxcjzhq\"}")
            .toObject(SensitivityLabelInner.class);
        Assertions.assertEquals("cse", model.labelName());
        Assertions.assertEquals("wwnpj", model.labelId());
        Assertions.assertEquals("fz", model.informationType());
        Assertions.assertEquals("pchwa", model.informationTypeId());
        Assertions.assertEquals(SensitivityLabelRank.NONE, model.rank());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SensitivityLabelInner model = new SensitivityLabelInner().withLabelName("cse")
            .withLabelId("wwnpj")
            .withInformationType("fz")
            .withInformationTypeId("pchwa")
            .withRank(SensitivityLabelRank.NONE);
        model = BinaryData.fromObject(model).toObject(SensitivityLabelInner.class);
        Assertions.assertEquals("cse", model.labelName());
        Assertions.assertEquals("wwnpj", model.labelId());
        Assertions.assertEquals("fz", model.informationType());
        Assertions.assertEquals("pchwa", model.informationTypeId());
        Assertions.assertEquals(SensitivityLabelRank.NONE, model.rank());
    }
}
