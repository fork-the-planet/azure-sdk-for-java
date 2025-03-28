// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreControlPlaneVersionPropertiesFormat;
import com.azure.resourcemanager.mobilenetwork.models.ObsoleteVersion;
import com.azure.resourcemanager.mobilenetwork.models.Platform;
import com.azure.resourcemanager.mobilenetwork.models.PlatformType;
import com.azure.resourcemanager.mobilenetwork.models.RecommendedVersion;
import com.azure.resourcemanager.mobilenetwork.models.VersionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PacketCoreControlPlaneVersionPropertiesFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCoreControlPlaneVersionPropertiesFormat model = BinaryData.fromString(
            "{\"provisioningState\":\"Deleted\",\"platforms\":[{\"platformType\":\"3P-AZURE-STACK-HCI\",\"versionState\":\"ValidationFailed\",\"minimumPlatformSoftwareVersion\":\"hykojoxafnndlpic\",\"maximumPlatformSoftwareVersion\":\"o\",\"recommendedVersion\":\"Recommended\",\"obsoleteVersion\":\"Obsolete\",\"haUpgradesAvailable\":[\"bpkkpwdre\"]},{\"platformType\":\"3P-AZURE-STACK-HCI\",\"versionState\":\"ValidationFailed\",\"minimumPlatformSoftwareVersion\":\"fovljxyws\",\"maximumPlatformSoftwareVersion\":\"syrsndsytgadgvra\",\"recommendedVersion\":\"Recommended\",\"obsoleteVersion\":\"Obsolete\",\"haUpgradesAvailable\":[\"zar\"]}]}")
            .toObject(PacketCoreControlPlaneVersionPropertiesFormat.class);
        Assertions.assertEquals(PlatformType.THREE_P_AZURE_STACK_HCI, model.platforms().get(0).platformType());
        Assertions.assertEquals(VersionState.VALIDATION_FAILED, model.platforms().get(0).versionState());
        Assertions.assertEquals("hykojoxafnndlpic", model.platforms().get(0).minimumPlatformSoftwareVersion());
        Assertions.assertEquals("o", model.platforms().get(0).maximumPlatformSoftwareVersion());
        Assertions.assertEquals(RecommendedVersion.RECOMMENDED, model.platforms().get(0).recommendedVersion());
        Assertions.assertEquals(ObsoleteVersion.OBSOLETE, model.platforms().get(0).obsoleteVersion());
        Assertions.assertEquals("bpkkpwdre", model.platforms().get(0).haUpgradesAvailable().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCoreControlPlaneVersionPropertiesFormat model
            = new PacketCoreControlPlaneVersionPropertiesFormat().withPlatforms(Arrays.asList(
                new Platform().withPlatformType(PlatformType.THREE_P_AZURE_STACK_HCI)
                    .withVersionState(VersionState.VALIDATION_FAILED)
                    .withMinimumPlatformSoftwareVersion("hykojoxafnndlpic")
                    .withMaximumPlatformSoftwareVersion("o")
                    .withRecommendedVersion(RecommendedVersion.RECOMMENDED)
                    .withObsoleteVersion(ObsoleteVersion.OBSOLETE)
                    .withHaUpgradesAvailable(Arrays.asList("bpkkpwdre")),
                new Platform().withPlatformType(PlatformType.THREE_P_AZURE_STACK_HCI)
                    .withVersionState(VersionState.VALIDATION_FAILED)
                    .withMinimumPlatformSoftwareVersion("fovljxyws")
                    .withMaximumPlatformSoftwareVersion("syrsndsytgadgvra")
                    .withRecommendedVersion(RecommendedVersion.RECOMMENDED)
                    .withObsoleteVersion(ObsoleteVersion.OBSOLETE)
                    .withHaUpgradesAvailable(Arrays.asList("zar"))));
        model = BinaryData.fromObject(model).toObject(PacketCoreControlPlaneVersionPropertiesFormat.class);
        Assertions.assertEquals(PlatformType.THREE_P_AZURE_STACK_HCI, model.platforms().get(0).platformType());
        Assertions.assertEquals(VersionState.VALIDATION_FAILED, model.platforms().get(0).versionState());
        Assertions.assertEquals("hykojoxafnndlpic", model.platforms().get(0).minimumPlatformSoftwareVersion());
        Assertions.assertEquals("o", model.platforms().get(0).maximumPlatformSoftwareVersion());
        Assertions.assertEquals(RecommendedVersion.RECOMMENDED, model.platforms().get(0).recommendedVersion());
        Assertions.assertEquals(ObsoleteVersion.OBSOLETE, model.platforms().get(0).obsoleteVersion());
        Assertions.assertEquals("bpkkpwdre", model.platforms().get(0).haUpgradesAvailable().get(0));
    }
}
