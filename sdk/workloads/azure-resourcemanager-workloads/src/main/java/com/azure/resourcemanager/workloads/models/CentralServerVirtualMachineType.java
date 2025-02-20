// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines the type of central server VM.
 */
public final class CentralServerVirtualMachineType extends ExpandableStringEnum<CentralServerVirtualMachineType> {
    /**
     * Static value Primary for CentralServerVirtualMachineType.
     */
    public static final CentralServerVirtualMachineType PRIMARY = fromString("Primary");

    /**
     * Static value Secondary for CentralServerVirtualMachineType.
     */
    public static final CentralServerVirtualMachineType SECONDARY = fromString("Secondary");

    /**
     * Static value Unknown for CentralServerVirtualMachineType.
     */
    public static final CentralServerVirtualMachineType UNKNOWN = fromString("Unknown");

    /**
     * Static value ASCS for CentralServerVirtualMachineType.
     */
    public static final CentralServerVirtualMachineType ASCS = fromString("ASCS");

    /**
     * Static value ERSInactive for CentralServerVirtualMachineType.
     */
    public static final CentralServerVirtualMachineType ERSINACTIVE = fromString("ERSInactive");

    /**
     * Static value ERS for CentralServerVirtualMachineType.
     */
    public static final CentralServerVirtualMachineType ERS = fromString("ERS");

    /**
     * Static value Standby for CentralServerVirtualMachineType.
     */
    public static final CentralServerVirtualMachineType STANDBY = fromString("Standby");

    /**
     * Creates a new instance of CentralServerVirtualMachineType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CentralServerVirtualMachineType() {
    }

    /**
     * Creates or finds a CentralServerVirtualMachineType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CentralServerVirtualMachineType.
     */
    public static CentralServerVirtualMachineType fromString(String name) {
        return fromString(name, CentralServerVirtualMachineType.class);
    }

    /**
     * Gets known CentralServerVirtualMachineType values.
     * 
     * @return known CentralServerVirtualMachineType values.
     */
    public static Collection<CentralServerVirtualMachineType> values() {
        return values(CentralServerVirtualMachineType.class);
    }
}
