// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/**
 * Samples for CertificateObjectGlobalRulestack Get.
 */
public final class CertificateObjectGlobalRulestackGetSamples {
    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * CertificateObjectGlobalRulestack_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectGlobalRulestack_Get_MinimumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void certificateObjectGlobalRulestackGetMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.certificateObjectGlobalRulestacks()
            .getWithResponse("praval", "armid1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * CertificateObjectGlobalRulestack_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectGlobalRulestack_Get_MaximumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void certificateObjectGlobalRulestackGetMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.certificateObjectGlobalRulestacks()
            .getWithResponse("praval", "armid1", com.azure.core.util.Context.NONE);
    }
}
