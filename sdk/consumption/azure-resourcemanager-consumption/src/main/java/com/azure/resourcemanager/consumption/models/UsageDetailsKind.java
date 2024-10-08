// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the kind of usage details.
 */
public final class UsageDetailsKind extends ExpandableStringEnum<UsageDetailsKind> {
    /**
     * Static value legacy for UsageDetailsKind.
     */
    public static final UsageDetailsKind LEGACY = fromString("legacy");

    /**
     * Static value modern for UsageDetailsKind.
     */
    public static final UsageDetailsKind MODERN = fromString("modern");

    /**
     * Creates a new instance of UsageDetailsKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UsageDetailsKind() {
    }

    /**
     * Creates or finds a UsageDetailsKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UsageDetailsKind.
     */
    public static UsageDetailsKind fromString(String name) {
        return fromString(name, UsageDetailsKind.class);
    }

    /**
     * Gets known UsageDetailsKind values.
     * 
     * @return known UsageDetailsKind values.
     */
    public static Collection<UsageDetailsKind> values() {
        return values(UsageDetailsKind.class);
    }
}
