// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object describing the detected language. */
@Immutable
public final class DetectedLanguage {
    /*
     * A string representing the code of the detected language.
     */
    @JsonProperty(value = "language", required = true)
    private String language;

    /*
     * A float value indicating the confidence in the result.
     * The score is between zero and one and a low score indicates a low confidence.
     */
    @JsonProperty(value = "score", required = true)
    private double score;

    /**
     * Creates an instance of DetectedLanguage class.
     *
     * @param language the language value to set.
     * @param score the score value to set.
     */
    @JsonCreator
    private DetectedLanguage(
            @JsonProperty(value = "language", required = true) String language,
            @JsonProperty(value = "score", required = true) double score) {
        this.language = language;
        this.score = score;
    }

    /**
     * Get the language property: A string representing the code of the detected language.
     *
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Get the score property: A float value indicating the confidence in the result. The score is between zero and one
     * and a low score indicates a low confidence.
     *
     * @return the score value.
     */
    public double getScore() {
        return this.score;
    }
}