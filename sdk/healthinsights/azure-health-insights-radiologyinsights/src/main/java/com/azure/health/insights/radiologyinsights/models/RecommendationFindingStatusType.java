// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Recommendation finding status.
 */
public final class RecommendationFindingStatusType extends ExpandableStringEnum<RecommendationFindingStatusType> {

    /**
     * Present finding status.
     */
    @Generated
    public static final RecommendationFindingStatusType PRESENT = fromString("present");

    /**
     * Differential finding status.
     */
    @Generated
    public static final RecommendationFindingStatusType DIFFERENTIAL = fromString("differential");

    /**
     * Rule out finding status.
     */
    @Generated
    public static final RecommendationFindingStatusType RULE_OUT = fromString("ruleOut");

    /**
     * Conditional finding status.
     */
    @Generated
    public static final RecommendationFindingStatusType CONDITIONAL = fromString("conditional");

    /**
     * Creates a new instance of RecommendationFindingStatusType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public RecommendationFindingStatusType() {
    }

    /**
     * Creates or finds a RecommendationFindingStatusType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecommendationFindingStatusType.
     */
    @Generated
    public static RecommendationFindingStatusType fromString(String name) {
        return fromString(name, RecommendationFindingStatusType.class);
    }

    /**
     * Gets known RecommendationFindingStatusType values.
     *
     * @return known RecommendationFindingStatusType values.
     */
    @Generated
    public static Collection<RecommendationFindingStatusType> values() {
        return values(RecommendationFindingStatusType.class);
    }
}
