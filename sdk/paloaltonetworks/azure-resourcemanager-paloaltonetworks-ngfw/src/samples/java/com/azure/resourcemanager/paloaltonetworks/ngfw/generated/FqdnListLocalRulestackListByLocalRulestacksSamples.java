// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for FqdnListLocalRulestack ListByLocalRulestacks. */
public final class FqdnListLocalRulestackListByLocalRulestacksSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/FqdnListLocalRulestack_ListByLocalRulestacks_MinimumSet_Gen.json
     */
    /**
     * Sample code: FqdnListLocalRulestack_ListByLocalRulestacks_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void fqdnListLocalRulestackListByLocalRulestacksMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.fqdnListLocalRulestacks().listByLocalRulestacks("rgopenapi", "lrs1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/FqdnListLocalRulestack_ListByLocalRulestacks_MaximumSet_Gen.json
     */
    /**
     * Sample code: FqdnListLocalRulestack_ListByLocalRulestacks_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void fqdnListLocalRulestackListByLocalRulestacksMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.fqdnListLocalRulestacks().listByLocalRulestacks("rgopenapi", "lrs1", com.azure.core.util.Context.NONE);
    }
}