// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.ChownMode;
import com.azure.resourcemanager.netapp.models.ExportPolicyRule;
import org.junit.jupiter.api.Assertions;

public final class ExportPolicyRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExportPolicyRule model = BinaryData.fromString(
            "{\"ruleIndex\":151199466,\"unixReadOnly\":true,\"unixReadWrite\":true,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":false,\"kerberos5pReadWrite\":false,\"cifs\":false,\"nfsv3\":true,\"nfsv41\":false,\"allowedClients\":\"ygmi\",\"hasRootAccess\":true,\"chownMode\":\"Restricted\"}")
            .toObject(ExportPolicyRule.class);
        Assertions.assertEquals(151199466, model.ruleIndex());
        Assertions.assertEquals(true, model.unixReadOnly());
        Assertions.assertEquals(true, model.unixReadWrite());
        Assertions.assertEquals(true, model.kerberos5ReadOnly());
        Assertions.assertEquals(true, model.kerberos5ReadWrite());
        Assertions.assertEquals(true, model.kerberos5IReadOnly());
        Assertions.assertEquals(true, model.kerberos5IReadWrite());
        Assertions.assertEquals(false, model.kerberos5PReadOnly());
        Assertions.assertEquals(false, model.kerberos5PReadWrite());
        Assertions.assertEquals(false, model.cifs());
        Assertions.assertEquals(true, model.nfsv3());
        Assertions.assertEquals(false, model.nfsv41());
        Assertions.assertEquals("ygmi", model.allowedClients());
        Assertions.assertEquals(true, model.hasRootAccess());
        Assertions.assertEquals(ChownMode.RESTRICTED, model.chownMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExportPolicyRule model = new ExportPolicyRule().withRuleIndex(151199466)
            .withUnixReadOnly(true)
            .withUnixReadWrite(true)
            .withKerberos5ReadOnly(true)
            .withKerberos5ReadWrite(true)
            .withKerberos5IReadOnly(true)
            .withKerberos5IReadWrite(true)
            .withKerberos5PReadOnly(false)
            .withKerberos5PReadWrite(false)
            .withCifs(false)
            .withNfsv3(true)
            .withNfsv41(false)
            .withAllowedClients("ygmi")
            .withHasRootAccess(true)
            .withChownMode(ChownMode.RESTRICTED);
        model = BinaryData.fromObject(model).toObject(ExportPolicyRule.class);
        Assertions.assertEquals(151199466, model.ruleIndex());
        Assertions.assertEquals(true, model.unixReadOnly());
        Assertions.assertEquals(true, model.unixReadWrite());
        Assertions.assertEquals(true, model.kerberos5ReadOnly());
        Assertions.assertEquals(true, model.kerberos5ReadWrite());
        Assertions.assertEquals(true, model.kerberos5IReadOnly());
        Assertions.assertEquals(true, model.kerberos5IReadWrite());
        Assertions.assertEquals(false, model.kerberos5PReadOnly());
        Assertions.assertEquals(false, model.kerberos5PReadWrite());
        Assertions.assertEquals(false, model.cifs());
        Assertions.assertEquals(true, model.nfsv3());
        Assertions.assertEquals(false, model.nfsv41());
        Assertions.assertEquals("ygmi", model.allowedClients());
        Assertions.assertEquals(true, model.hasRootAccess());
        Assertions.assertEquals(ChownMode.RESTRICTED, model.chownMode());
    }
}
