// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Scale type.
 */
public final class ScaleType extends ExpandableStringEnum<ScaleType> {
    /**
     * Static value HA for ScaleType.
     */
    public static final ScaleType HA = fromString("HA");

    /**
     * Creates a new instance of ScaleType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScaleType() {
    }

    /**
     * Creates or finds a ScaleType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ScaleType.
     */
    public static ScaleType fromString(String name) {
        return fromString(name, ScaleType.class);
    }

    /**
     * Gets known ScaleType values.
     * 
     * @return known ScaleType values.
     */
    public static Collection<ScaleType> values() {
        return values(ScaleType.class);
    }
}
