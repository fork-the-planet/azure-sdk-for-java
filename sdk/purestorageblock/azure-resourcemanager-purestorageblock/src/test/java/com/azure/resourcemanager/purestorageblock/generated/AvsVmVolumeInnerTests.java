// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.purestorageblock.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purestorageblock.fluent.models.AvsVmVolumeInner;
import org.junit.jupiter.api.Assertions;

public final class AvsVmVolumeInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvsVmVolumeInner model = BinaryData.fromString(
            "{\"properties\":{\"storagePoolInternalId\":\"uenvrkp\",\"storagePoolResourceId\":\"uaibrebqaaysj\",\"volumeInternalId\":\"xqtnq\",\"displayName\":\"ezl\",\"space\":{\"totalUsed\":6879851489693220346,\"unique\":3644100748262359557,\"snapshots\":3086933290402300840,\"shared\":8477209307411238262},\"softDeletion\":{\"destroyed\":true,\"eradicationTimestamp\":\"m\"},\"createdTimestamp\":\"d\",\"provisionedSize\":4417313243230783512,\"volumeType\":\"avs\",\"avs\":{\"diskId\":\"yeozphvwauyqncy\",\"diskName\":\"upkvipmdsc\",\"folder\":\"xqupevzhf\",\"avsVmInternalId\":\"totxhojujb\",\"avsVmResourceId\":\"pelmcuvhixbjxyf\",\"avsVmName\":\"n\",\"avsStorageContainerResourceId\":\"lrcoolsttpki\"},\"provisioningState\":\"Failed\"},\"id\":\"nujrywvtyl\",\"name\":\"fpncurdo\",\"type\":\"wiithtywub\"}")
            .toObject(AvsVmVolumeInner.class);
        Assertions.assertTrue(model.properties().softDeletion().destroyed());
    }
}
