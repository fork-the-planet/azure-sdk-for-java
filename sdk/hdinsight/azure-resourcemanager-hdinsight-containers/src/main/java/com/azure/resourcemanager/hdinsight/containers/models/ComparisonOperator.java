// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The comparison operator.
 */
public final class ComparisonOperator extends ExpandableStringEnum<ComparisonOperator> {
    /**
     * Static value greaterThan for ComparisonOperator.
     */
    public static final ComparisonOperator GREATER_THAN = fromString("greaterThan");

    /**
     * Static value greaterThanOrEqual for ComparisonOperator.
     */
    public static final ComparisonOperator GREATER_THAN_OR_EQUAL = fromString("greaterThanOrEqual");

    /**
     * Static value lessThan for ComparisonOperator.
     */
    public static final ComparisonOperator LESS_THAN = fromString("lessThan");

    /**
     * Static value lessThanOrEqual for ComparisonOperator.
     */
    public static final ComparisonOperator LESS_THAN_OR_EQUAL = fromString("lessThanOrEqual");

    /**
     * Creates a new instance of ComparisonOperator value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ComparisonOperator() {
    }

    /**
     * Creates or finds a ComparisonOperator from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ComparisonOperator.
     */
    public static ComparisonOperator fromString(String name) {
        return fromString(name, ComparisonOperator.class);
    }

    /**
     * Gets known ComparisonOperator values.
     * 
     * @return known ComparisonOperator values.
     */
    public static Collection<ComparisonOperator> values() {
        return values(ComparisonOperator.class);
    }
}
