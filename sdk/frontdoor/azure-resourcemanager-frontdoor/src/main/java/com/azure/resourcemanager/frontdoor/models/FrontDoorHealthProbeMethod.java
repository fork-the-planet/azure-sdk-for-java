// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Configures which HTTP method to use to probe the backends defined under backendPools.
 */
public final class FrontDoorHealthProbeMethod extends ExpandableStringEnum<FrontDoorHealthProbeMethod> {
    /**
     * Static value GET for FrontDoorHealthProbeMethod.
     */
    public static final FrontDoorHealthProbeMethod GET = fromString("GET");

    /**
     * Static value HEAD for FrontDoorHealthProbeMethod.
     */
    public static final FrontDoorHealthProbeMethod HEAD = fromString("HEAD");

    /**
     * Creates a new instance of FrontDoorHealthProbeMethod value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FrontDoorHealthProbeMethod() {
    }

    /**
     * Creates or finds a FrontDoorHealthProbeMethod from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FrontDoorHealthProbeMethod.
     */
    public static FrontDoorHealthProbeMethod fromString(String name) {
        return fromString(name, FrontDoorHealthProbeMethod.class);
    }

    /**
     * Gets known FrontDoorHealthProbeMethod values.
     * 
     * @return known FrontDoorHealthProbeMethod values.
     */
    public static Collection<FrontDoorHealthProbeMethod> values() {
        return values(FrontDoorHealthProbeMethod.class);
    }
}
