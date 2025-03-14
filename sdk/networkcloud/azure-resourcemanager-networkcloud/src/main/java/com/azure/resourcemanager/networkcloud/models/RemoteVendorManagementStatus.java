// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The indicator of whether the remote vendor management feature is enabled or disabled, or unsupported if it is an
 * unsupported feature.
 */
public final class RemoteVendorManagementStatus extends ExpandableStringEnum<RemoteVendorManagementStatus> {
    /**
     * Static value Enabled for RemoteVendorManagementStatus.
     */
    public static final RemoteVendorManagementStatus ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for RemoteVendorManagementStatus.
     */
    public static final RemoteVendorManagementStatus DISABLED = fromString("Disabled");

    /**
     * Static value Unsupported for RemoteVendorManagementStatus.
     */
    public static final RemoteVendorManagementStatus UNSUPPORTED = fromString("Unsupported");

    /**
     * Creates a new instance of RemoteVendorManagementStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RemoteVendorManagementStatus() {
    }

    /**
     * Creates or finds a RemoteVendorManagementStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RemoteVendorManagementStatus.
     */
    public static RemoteVendorManagementStatus fromString(String name) {
        return fromString(name, RemoteVendorManagementStatus.class);
    }

    /**
     * Gets known RemoteVendorManagementStatus values.
     * 
     * @return known RemoteVendorManagementStatus values.
     */
    public static Collection<RemoteVendorManagementStatus> values() {
        return values(RemoteVendorManagementStatus.class);
    }
}
