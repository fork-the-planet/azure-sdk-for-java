// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be
 * disabled if there is a single enabled backend in single enabled backend pool.
 */
public final class HealthProbeEnabled extends ExpandableStringEnum<HealthProbeEnabled> {
    /**
     * Static value Enabled for HealthProbeEnabled.
     */
    public static final HealthProbeEnabled ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for HealthProbeEnabled.
     */
    public static final HealthProbeEnabled DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of HealthProbeEnabled value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HealthProbeEnabled() {
    }

    /**
     * Creates or finds a HealthProbeEnabled from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HealthProbeEnabled.
     */
    public static HealthProbeEnabled fromString(String name) {
        return fromString(name, HealthProbeEnabled.class);
    }

    /**
     * Gets known HealthProbeEnabled values.
     * 
     * @return known HealthProbeEnabled values.
     */
    public static Collection<HealthProbeEnabled> values() {
        return values(HealthProbeEnabled.class);
    }
}
