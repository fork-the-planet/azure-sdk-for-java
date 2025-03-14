// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for AzureManagedDiskSkuDtoDiskRedundancy.
 */
public final class AzureManagedDiskSkuDtoDiskRedundancy
    extends ExpandableStringEnum<AzureManagedDiskSkuDtoDiskRedundancy> {
    /**
     * Static value Unknown for AzureManagedDiskSkuDtoDiskRedundancy.
     */
    public static final AzureManagedDiskSkuDtoDiskRedundancy UNKNOWN = fromString("Unknown");

    /**
     * Static value LRS for AzureManagedDiskSkuDtoDiskRedundancy.
     */
    public static final AzureManagedDiskSkuDtoDiskRedundancy LRS = fromString("LRS");

    /**
     * Static value ZRS for AzureManagedDiskSkuDtoDiskRedundancy.
     */
    public static final AzureManagedDiskSkuDtoDiskRedundancy ZRS = fromString("ZRS");

    /**
     * Creates a new instance of AzureManagedDiskSkuDtoDiskRedundancy value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureManagedDiskSkuDtoDiskRedundancy() {
    }

    /**
     * Creates or finds a AzureManagedDiskSkuDtoDiskRedundancy from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureManagedDiskSkuDtoDiskRedundancy.
     */
    public static AzureManagedDiskSkuDtoDiskRedundancy fromString(String name) {
        return fromString(name, AzureManagedDiskSkuDtoDiskRedundancy.class);
    }

    /**
     * Gets known AzureManagedDiskSkuDtoDiskRedundancy values.
     * 
     * @return known AzureManagedDiskSkuDtoDiskRedundancy values.
     */
    public static Collection<AzureManagedDiskSkuDtoDiskRedundancy> values() {
        return values(AzureManagedDiskSkuDtoDiskRedundancy.class);
    }
}
