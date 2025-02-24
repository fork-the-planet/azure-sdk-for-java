// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkPacketBrokerProperties;
import org.junit.jupiter.api.Assertions;

public final class NetworkPacketBrokerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkPacketBrokerProperties model = BinaryData.fromString(
            "{\"networkFabricId\":\"caddtgc\",\"networkDeviceIds\":[\"gtvgwyu\",\"be\",\"fnzzryizwbxg\"],\"sourceInterfaceIds\":[\"xlayunomir\",\"p\",\"abenqlamwmg\",\"way\"],\"networkTapIds\":[\"nbcpjstbhemhcucs\",\"snxfbxu\",\"eapdrbzyv\"],\"neighborGroupIds\":[\"adulpodkaxp\",\"obkzhmhjdqltdel\",\"qrojadhfztlray\",\"rkgzkyhudbkuw\"],\"provisioningState\":\"Succeeded\"}")
            .toObject(NetworkPacketBrokerProperties.class);
        Assertions.assertEquals("caddtgc", model.networkFabricId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkPacketBrokerProperties model = new NetworkPacketBrokerProperties().withNetworkFabricId("caddtgc");
        model = BinaryData.fromObject(model).toObject(NetworkPacketBrokerProperties.class);
        Assertions.assertEquals("caddtgc", model.networkFabricId());
    }
}
