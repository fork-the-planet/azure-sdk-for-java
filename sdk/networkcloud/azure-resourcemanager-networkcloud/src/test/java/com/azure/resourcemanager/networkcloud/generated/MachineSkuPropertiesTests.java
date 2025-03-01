// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.MachineSkuProperties;

public final class MachineSkuPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineSkuProperties model = BinaryData.fromString(
            "{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":8363769759075681134,\"cpuSockets\":3611469908670095920,\"disks\":[{\"capacityGB\":6054984412383572813,\"connection\":\"SATA\",\"type\":\"SSD\"},{\"capacityGB\":189738325553867740,\"connection\":\"RAID\",\"type\":\"HDD\"}],\"generation\":\"wgck\",\"hardwareVersion\":\"cxvdfffwafqrouda\",\"memoryCapacityGB\":5249211644397946556,\"model\":\"h\",\"networkInterfaces\":[{\"address\":\"bunzozudh\",\"deviceConnectionType\":\"PCI\",\"model\":\"moy\",\"physicalSlot\":5518974152844939947,\"portCount\":6989479455559512040,\"portSpeed\":4304469233132949889,\"vendor\":\"nbzydvfvfcj\"},{\"address\":\"eoisrvhmgor\",\"deviceConnectionType\":\"PCI\",\"model\":\"is\",\"physicalSlot\":485076229692339772,\"portCount\":1866063520897299166,\"portSpeed\":5855537162726309030,\"vendor\":\"a\"},{\"address\":\"xilcbtgnhnzey\",\"deviceConnectionType\":\"PCI\",\"model\":\"jfzqlqhycavodgg\",\"physicalSlot\":4279783517540718218,\"portCount\":195420941787005324,\"portSpeed\":5853456136608072876,\"vendor\":\"lrariaawiu\"}],\"totalThreads\":2737212263841825681,\"vendor\":\"qfby\"}")
            .toObject(MachineSkuProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineSkuProperties model = new MachineSkuProperties();
        model = BinaryData.fromObject(model).toObject(MachineSkuProperties.class);
    }
}
