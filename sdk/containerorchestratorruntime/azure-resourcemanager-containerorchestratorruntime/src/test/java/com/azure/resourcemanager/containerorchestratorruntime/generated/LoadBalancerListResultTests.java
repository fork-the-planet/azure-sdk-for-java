// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerorchestratorruntime.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerorchestratorruntime.implementation.models.LoadBalancerListResult;
import com.azure.resourcemanager.containerorchestratorruntime.models.AdvertiseMode;
import org.junit.jupiter.api.Assertions;

public final class LoadBalancerListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LoadBalancerListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"addresses\":[\"eiachboosflnr\",\"sfqpteehz\",\"vypyqrimzinpv\"],\"serviceSelector\":{\"nohjt\":\"dkirsoodqxhcr\",\"soifiyipjxsqw\":\"kwh\",\"bznorcjxvsnby\":\"gr\"},\"advertiseMode\":\"ARP\",\"bgpPeers\":[\"nmoc\"],\"provisioningState\":\"Canceled\"},\"id\":\"hurzafblj\",\"name\":\"gpbtoqcjmklj\",\"type\":\"vbqid\"},{\"properties\":{\"addresses\":[\"jzyulpk\",\"dj\"],\"serviceSelector\":{\"e\":\"khbzhfepgzg\",\"scpai\":\"zloc\"},\"advertiseMode\":\"BGP\",\"bgpPeers\":[\"bcsglumma\",\"tjaodxobnb\"],\"provisioningState\":\"Updating\"},\"id\":\"pxokajionp\",\"name\":\"mexgstxgcp\",\"type\":\"dg\"}],\"nextLink\":\"ajrmvdjwzrlovmc\"}")
            .toObject(LoadBalancerListResult.class);
        Assertions.assertEquals("eiachboosflnr", model.value().get(0).properties().addresses().get(0));
        Assertions.assertEquals("dkirsoodqxhcr", model.value().get(0).properties().serviceSelector().get("nohjt"));
        Assertions.assertEquals(AdvertiseMode.ARP, model.value().get(0).properties().advertiseMode());
        Assertions.assertEquals("nmoc", model.value().get(0).properties().bgpPeers().get(0));
        Assertions.assertEquals("ajrmvdjwzrlovmc", model.nextLink());
    }
}
