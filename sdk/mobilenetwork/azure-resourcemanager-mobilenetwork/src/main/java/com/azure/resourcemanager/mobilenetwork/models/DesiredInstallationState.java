// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The desired installation state of the packet core.
 */
public final class DesiredInstallationState extends ExpandableStringEnum<DesiredInstallationState> {
    /**
     * Static value Uninstalled for DesiredInstallationState.
     */
    public static final DesiredInstallationState UNINSTALLED = fromString("Uninstalled");

    /**
     * Static value Installed for DesiredInstallationState.
     */
    public static final DesiredInstallationState INSTALLED = fromString("Installed");

    /**
     * Creates a new instance of DesiredInstallationState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DesiredInstallationState() {
    }

    /**
     * Creates or finds a DesiredInstallationState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DesiredInstallationState.
     */
    public static DesiredInstallationState fromString(String name) {
        return fromString(name, DesiredInstallationState.class);
    }

    /**
     * Gets known DesiredInstallationState values.
     * 
     * @return known DesiredInstallationState values.
     */
    public static Collection<DesiredInstallationState> values() {
        return values(DesiredInstallationState.class);
    }
}
