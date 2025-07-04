// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The partition mechanism that will be used for SAP table read in parallel.
 */
public final class SapTablePartitionOption extends ExpandableStringEnum<SapTablePartitionOption> {
    /**
     * Static value None for SapTablePartitionOption.
     */
    @Generated
    public static final SapTablePartitionOption NONE = fromString("None");

    /**
     * Static value PartitionOnInt for SapTablePartitionOption.
     */
    @Generated
    public static final SapTablePartitionOption PARTITION_ON_INT = fromString("PartitionOnInt");

    /**
     * Static value PartitionOnCalendarYear for SapTablePartitionOption.
     */
    @Generated
    public static final SapTablePartitionOption PARTITION_ON_CALENDAR_YEAR = fromString("PartitionOnCalendarYear");

    /**
     * Static value PartitionOnCalendarMonth for SapTablePartitionOption.
     */
    @Generated
    public static final SapTablePartitionOption PARTITION_ON_CALENDAR_MONTH = fromString("PartitionOnCalendarMonth");

    /**
     * Static value PartitionOnCalendarDate for SapTablePartitionOption.
     */
    @Generated
    public static final SapTablePartitionOption PARTITION_ON_CALENDAR_DATE = fromString("PartitionOnCalendarDate");

    /**
     * Static value PartitionOnTime for SapTablePartitionOption.
     */
    @Generated
    public static final SapTablePartitionOption PARTITION_ON_TIME = fromString("PartitionOnTime");

    /**
     * Creates a new instance of SapTablePartitionOption value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public SapTablePartitionOption() {
    }

    /**
     * Creates or finds a SapTablePartitionOption from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SapTablePartitionOption.
     */
    @Generated
    public static SapTablePartitionOption fromString(String name) {
        return fromString(name, SapTablePartitionOption.class);
    }

    /**
     * Gets known SapTablePartitionOption values.
     * 
     * @return known SapTablePartitionOption values.
     */
    @Generated
    public static Collection<SapTablePartitionOption> values() {
        return values(SapTablePartitionOption.class);
    }
}
