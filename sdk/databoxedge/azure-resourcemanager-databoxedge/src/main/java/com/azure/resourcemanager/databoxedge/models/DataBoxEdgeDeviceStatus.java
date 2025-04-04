// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The status of the Data Box Edge/Gateway device.
 */
public final class DataBoxEdgeDeviceStatus extends ExpandableStringEnum<DataBoxEdgeDeviceStatus> {
    /**
     * Static value ReadyToSetup for DataBoxEdgeDeviceStatus.
     */
    public static final DataBoxEdgeDeviceStatus READY_TO_SETUP = fromString("ReadyToSetup");

    /**
     * Static value Online for DataBoxEdgeDeviceStatus.
     */
    public static final DataBoxEdgeDeviceStatus ONLINE = fromString("Online");

    /**
     * Static value Offline for DataBoxEdgeDeviceStatus.
     */
    public static final DataBoxEdgeDeviceStatus OFFLINE = fromString("Offline");

    /**
     * Static value NeedsAttention for DataBoxEdgeDeviceStatus.
     */
    public static final DataBoxEdgeDeviceStatus NEEDS_ATTENTION = fromString("NeedsAttention");

    /**
     * Static value Disconnected for DataBoxEdgeDeviceStatus.
     */
    public static final DataBoxEdgeDeviceStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Static value PartiallyDisconnected for DataBoxEdgeDeviceStatus.
     */
    public static final DataBoxEdgeDeviceStatus PARTIALLY_DISCONNECTED = fromString("PartiallyDisconnected");

    /**
     * Static value Maintenance for DataBoxEdgeDeviceStatus.
     */
    public static final DataBoxEdgeDeviceStatus MAINTENANCE = fromString("Maintenance");

    /**
     * Creates a new instance of DataBoxEdgeDeviceStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataBoxEdgeDeviceStatus() {
    }

    /**
     * Creates or finds a DataBoxEdgeDeviceStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataBoxEdgeDeviceStatus.
     */
    public static DataBoxEdgeDeviceStatus fromString(String name) {
        return fromString(name, DataBoxEdgeDeviceStatus.class);
    }

    /**
     * Gets known DataBoxEdgeDeviceStatus values.
     * 
     * @return known DataBoxEdgeDeviceStatus values.
     */
    public static Collection<DataBoxEdgeDeviceStatus> values() {
        return values(DataBoxEdgeDeviceStatus.class);
    }
}
