// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.VaultSettingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VaultSettingCollection;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VaultSettingProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VaultSettingCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VaultSettingCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"migrationSolutionId\":\"v\",\"vmwareToAzureProviderType\":\"oakizvoai\"},\"location\":\"a\",\"id\":\"lnuwiguy\",\"name\":\"lykwphvxz\",\"type\":\"wxh\"},{\"properties\":{\"migrationSolutionId\":\"jtlkexaonwivkcqh\",\"vmwareToAzureProviderType\":\"hxknlccrmmkyupi\"},\"location\":\"byqjfkakfqfrkem\",\"id\":\"il\",\"name\":\"udxjascowv\",\"type\":\"djkpdxph\"},{\"properties\":{\"migrationSolutionId\":\"snmgzvyfi\",\"vmwareToAzureProviderType\":\"kzuqnwsith\"},\"location\":\"olyahluqwqulsut\",\"id\":\"jb\",\"name\":\"xykfhyq\",\"type\":\"zvqqugdrftbcvexr\"}],\"nextLink\":\"quowtljvfwhrea\"}")
            .toObject(VaultSettingCollection.class);
        Assertions.assertEquals("v", model.value().get(0).properties().migrationSolutionId());
        Assertions.assertEquals("oakizvoai", model.value().get(0).properties().vmwareToAzureProviderType());
        Assertions.assertEquals("a", model.value().get(0).location());
        Assertions.assertEquals("quowtljvfwhrea", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VaultSettingCollection model
            = new VaultSettingCollection()
                .withValue(Arrays.asList(
                    new VaultSettingInner().withProperties(new VaultSettingProperties().withMigrationSolutionId("v")
                        .withVmwareToAzureProviderType("oakizvoai")).withLocation("a"),
                    new VaultSettingInner()
                        .withProperties(new VaultSettingProperties().withMigrationSolutionId("jtlkexaonwivkcqh")
                            .withVmwareToAzureProviderType("hxknlccrmmkyupi"))
                        .withLocation("byqjfkakfqfrkem"),
                    new VaultSettingInner()
                        .withProperties(new VaultSettingProperties().withMigrationSolutionId("snmgzvyfi")
                            .withVmwareToAzureProviderType("kzuqnwsith"))
                        .withLocation("olyahluqwqulsut")))
                .withNextLink("quowtljvfwhrea");
        model = BinaryData.fromObject(model).toObject(VaultSettingCollection.class);
        Assertions.assertEquals("v", model.value().get(0).properties().migrationSolutionId());
        Assertions.assertEquals("oakizvoai", model.value().get(0).properties().vmwareToAzureProviderType());
        Assertions.assertEquals("a", model.value().get(0).location());
        Assertions.assertEquals("quowtljvfwhrea", model.nextLink());
    }
}
