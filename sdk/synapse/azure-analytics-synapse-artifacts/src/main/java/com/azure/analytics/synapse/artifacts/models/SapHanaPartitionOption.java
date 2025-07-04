// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The partition mechanism that will be used for SAP HANA read in parallel.
 */
public final class SapHanaPartitionOption extends ExpandableStringEnum<SapHanaPartitionOption> {
    /**
     * Static value None for SapHanaPartitionOption.
     */
    @Generated
    public static final SapHanaPartitionOption NONE = fromString("None");

    /**
     * Static value PhysicalPartitionsOfTable for SapHanaPartitionOption.
     */
    @Generated
    public static final SapHanaPartitionOption PHYSICAL_PARTITIONS_OF_TABLE = fromString("PhysicalPartitionsOfTable");

    /**
     * Static value SapHanaDynamicRange for SapHanaPartitionOption.
     */
    @Generated
    public static final SapHanaPartitionOption SAP_HANA_DYNAMIC_RANGE = fromString("SapHanaDynamicRange");

    /**
     * Creates a new instance of SapHanaPartitionOption value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public SapHanaPartitionOption() {
    }

    /**
     * Creates or finds a SapHanaPartitionOption from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SapHanaPartitionOption.
     */
    @Generated
    public static SapHanaPartitionOption fromString(String name) {
        return fromString(name, SapHanaPartitionOption.class);
    }

    /**
     * Gets known SapHanaPartitionOption values.
     * 
     * @return known SapHanaPartitionOption values.
     */
    @Generated
    public static Collection<SapHanaPartitionOption> values() {
        return values(SapHanaPartitionOption.class);
    }
}
