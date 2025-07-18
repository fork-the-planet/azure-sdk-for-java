// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.implementation.models.ProvisionedNetworkListResult;
import org.junit.jupiter.api.Assertions;

public final class ProvisionedNetworkListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProvisionedNetworkListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"addressPrefix\":\"rvhmgor\",\"networkType\":\"vsan\"},\"id\":\"is\",\"name\":\"vwmzhwplefaxvxil\",\"type\":\"btgn\"},{\"properties\":{\"provisioningState\":\"Canceled\",\"addressPrefix\":\"qxtjjfzqlqhyca\",\"networkType\":\"hcxManagement\"},\"id\":\"gxdbeesmie\",\"name\":\"nlrariaawiuagy\",\"type\":\"wqfbylyrfgiagt\"}],\"nextLink\":\"jocqwogfnzjvusf\"}")
            .toObject(ProvisionedNetworkListResult.class);
        Assertions.assertEquals("jocqwogfnzjvusf", model.nextLink());
    }
}
