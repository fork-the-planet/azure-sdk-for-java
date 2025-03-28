// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confidentialledger.models.AadBasedSecurityPrincipal;
import com.azure.resourcemanager.confidentialledger.models.LedgerRoleName;
import org.junit.jupiter.api.Assertions;

public final class AadBasedSecurityPrincipalTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AadBasedSecurityPrincipal model = BinaryData
            .fromString("{\"principalId\":\"qi\",\"tenantId\":\"hungbwjzrnf\",\"ledgerRoleName\":\"Administrator\"}")
            .toObject(AadBasedSecurityPrincipal.class);
        Assertions.assertEquals("qi", model.principalId());
        Assertions.assertEquals("hungbwjzrnf", model.tenantId());
        Assertions.assertEquals(LedgerRoleName.ADMINISTRATOR, model.ledgerRoleName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AadBasedSecurityPrincipal model = new AadBasedSecurityPrincipal().withPrincipalId("qi")
            .withTenantId("hungbwjzrnf")
            .withLedgerRoleName(LedgerRoleName.ADMINISTRATOR);
        model = BinaryData.fromObject(model).toObject(AadBasedSecurityPrincipal.class);
        Assertions.assertEquals("qi", model.principalId());
        Assertions.assertEquals("hungbwjzrnf", model.tenantId());
        Assertions.assertEquals(LedgerRoleName.ADMINISTRATOR, model.ledgerRoleName());
    }
}
