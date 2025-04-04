// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.migration.assessment.models.AzureSqlIaasSkuDto;

public final class AzureSqlIaasSkuDtoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureSqlIaasSkuDto model = BinaryData.fromString(
            "{\"virtualMachineSize\":{\"azureVmFamily\":\"Edv5_series\",\"cores\":1029083448,\"azureSkuName\":\"Standard_D2as_v5\",\"availableCores\":1218728383,\"maxNetworkInterfaces\":617532608},\"dataDiskSizes\":[{\"diskType\":\"Premium\",\"diskSize\":\"Premium_P30\",\"diskRedundancy\":\"LRS\",\"storageCost\":37.59306,\"recommendedSizeInGib\":99.90342,\"recommendedThroughputInMbps\":43.10251,\"recommendedIops\":58.430733},{\"diskType\":\"Premium\",\"diskSize\":\"StandardSSD_E6\",\"diskRedundancy\":\"Unknown\",\"storageCost\":52.928745,\"recommendedSizeInGib\":44.91767,\"recommendedThroughputInMbps\":91.69271,\"recommendedIops\":61.968582},{\"diskType\":\"Standard\",\"diskSize\":\"StandardSSD_E70\",\"diskRedundancy\":\"ZRS\",\"storageCost\":40.48493,\"recommendedSizeInGib\":90.719376,\"recommendedThroughputInMbps\":48.726143,\"recommendedIops\":45.43301}],\"logDiskSizes\":[{\"diskType\":\"PremiumV2\",\"diskSize\":\"Premium_P1\",\"diskRedundancy\":\"LRS\",\"storageCost\":47.28567,\"recommendedSizeInGib\":64.00328,\"recommendedThroughputInMbps\":63.62545,\"recommendedIops\":91.40803}],\"azureSqlTargetType\":\"AzureVirtualMachine\"}")
            .toObject(AzureSqlIaasSkuDto.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureSqlIaasSkuDto model = new AzureSqlIaasSkuDto();
        model = BinaryData.fromObject(model).toObject(AzureSqlIaasSkuDto.class);
    }
}
