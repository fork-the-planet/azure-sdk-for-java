// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.NetworkMappingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMappingCollection;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMappingFabricSpecificSettings;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMappingProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkMappingCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkMappingCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"state\":\"yiuokktwh\",\"primaryNetworkFriendlyName\":\"xw\",\"primaryNetworkId\":\"wqsmbsur\",\"primaryFabricFriendlyName\":\"imoryocfsfksym\",\"recoveryNetworkFriendlyName\":\"ys\",\"recoveryNetworkId\":\"i\",\"recoveryFabricArmId\":\"xhqyudxorrqnb\",\"recoveryFabricFriendlyName\":\"czvyifq\",\"fabricSpecificSettings\":{\"instanceType\":\"NetworkMappingFabricSpecificSettings\"}},\"location\":\"dvjsllrmvvdf\",\"id\":\"atkpnp\",\"name\":\"lexxbczwtru\",\"type\":\"iqzbq\"}],\"nextLink\":\"sovmyokacspkwl\"}")
            .toObject(NetworkMappingCollection.class);
        Assertions.assertEquals("yiuokktwh", model.value().get(0).properties().state());
        Assertions.assertEquals("xw", model.value().get(0).properties().primaryNetworkFriendlyName());
        Assertions.assertEquals("wqsmbsur", model.value().get(0).properties().primaryNetworkId());
        Assertions.assertEquals("imoryocfsfksym", model.value().get(0).properties().primaryFabricFriendlyName());
        Assertions.assertEquals("ys", model.value().get(0).properties().recoveryNetworkFriendlyName());
        Assertions.assertEquals("i", model.value().get(0).properties().recoveryNetworkId());
        Assertions.assertEquals("xhqyudxorrqnb", model.value().get(0).properties().recoveryFabricArmId());
        Assertions.assertEquals("czvyifq", model.value().get(0).properties().recoveryFabricFriendlyName());
        Assertions.assertEquals("dvjsllrmvvdf", model.value().get(0).location());
        Assertions.assertEquals("sovmyokacspkwl", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkMappingCollection model
            = new NetworkMappingCollection().withValue(Arrays.asList(new NetworkMappingInner()
                .withProperties(new NetworkMappingProperties().withState("yiuokktwh")
                    .withPrimaryNetworkFriendlyName("xw")
                    .withPrimaryNetworkId("wqsmbsur")
                    .withPrimaryFabricFriendlyName("imoryocfsfksym")
                    .withRecoveryNetworkFriendlyName("ys")
                    .withRecoveryNetworkId("i")
                    .withRecoveryFabricArmId("xhqyudxorrqnb")
                    .withRecoveryFabricFriendlyName("czvyifq")
                    .withFabricSpecificSettings(new NetworkMappingFabricSpecificSettings()))
                .withLocation("dvjsllrmvvdf"))).withNextLink("sovmyokacspkwl");
        model = BinaryData.fromObject(model).toObject(NetworkMappingCollection.class);
        Assertions.assertEquals("yiuokktwh", model.value().get(0).properties().state());
        Assertions.assertEquals("xw", model.value().get(0).properties().primaryNetworkFriendlyName());
        Assertions.assertEquals("wqsmbsur", model.value().get(0).properties().primaryNetworkId());
        Assertions.assertEquals("imoryocfsfksym", model.value().get(0).properties().primaryFabricFriendlyName());
        Assertions.assertEquals("ys", model.value().get(0).properties().recoveryNetworkFriendlyName());
        Assertions.assertEquals("i", model.value().get(0).properties().recoveryNetworkId());
        Assertions.assertEquals("xhqyudxorrqnb", model.value().get(0).properties().recoveryFabricArmId());
        Assertions.assertEquals("czvyifq", model.value().get(0).properties().recoveryFabricFriendlyName());
        Assertions.assertEquals("dvjsllrmvvdf", model.value().get(0).location());
        Assertions.assertEquals("sovmyokacspkwl", model.nextLink());
    }
}
