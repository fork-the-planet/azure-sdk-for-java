// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.ManagedIdentitySqlControlSettingsModelInner;
import com.azure.resourcemanager.synapse.models.ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity;
import com.azure.resourcemanager.synapse.models.ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState;
import org.junit.jupiter.api.Assertions;

public final class ManagedIdentitySqlControlSettingsModelInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentitySqlControlSettingsModelInner model = BinaryData.fromString(
            "{\"properties\":{\"grantSqlControlToManagedIdentity\":{\"desiredState\":\"Enabled\",\"actualState\":\"Unknown\"}},\"id\":\"sbcrymodizrxklo\",\"name\":\"d\",\"type\":\"nazpmk\"}")
            .toObject(ManagedIdentitySqlControlSettingsModelInner.class);
        Assertions.assertEquals(
            ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState.ENABLED,
            model.grantSqlControlToManagedIdentity().desiredState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentitySqlControlSettingsModelInner model
            = new ManagedIdentitySqlControlSettingsModelInner().withGrantSqlControlToManagedIdentity(
                new ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity().withDesiredState(
                    ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState.ENABLED));
        model = BinaryData.fromObject(model).toObject(ManagedIdentitySqlControlSettingsModelInner.class);
        Assertions.assertEquals(
            ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState.ENABLED,
            model.grantSqlControlToManagedIdentity().desiredState());
    }
}
