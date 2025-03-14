// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.json;

/**
 * Contains configuration options for creating a {@link JsonReader} or {@link JsonWriter}.
 *
 * @see com.azure.json
 * @see JsonProvider
 * @see JsonProviders
 */
public final class JsonOptions {

    private boolean nonNumericNumbersSupported = true;
    private boolean isJsoncSupported;

    /**
     * Creates an instance of {@link JsonOptions}.
     */
    public JsonOptions() {
    }

    /**
     * Whether non-numeric numbers such as {@code NaN}, {@code Infinity}, {@code +Infinity} and {@code -Infinity} are
     * supported.
     * <p>
     * By default, this is configured to true.
     *
     * @return Whether non-numeric numbers are supported.
     */
    public boolean isNonNumericNumbersSupported() {
        return nonNumericNumbersSupported;
    }

    /**
     * Whether non-numeric numbers such as {@code NaN}, {@code Infinity}, {@code +Infinity} and {@code -Infinity} are
     * supported.
     * <p>
     * By default, this is configured to true.
     *
     * @param nonNumericNumbersSupported Whether non-numeric numbers are supported.
     * @return The updated JsonOptions object.
     */
    public JsonOptions setNonNumericNumbersSupported(boolean nonNumericNumbersSupported) {
        this.nonNumericNumbersSupported = nonNumericNumbersSupported;
        return this;
    }

    /**
     * Whether JSONC (JSON with comments) is supported.
     * By default, this is configured to false.
     *
     * @return Whether JSONC is supported.
     */
    public boolean isJsoncSupported() {
        return isJsoncSupported;
    }

    /**
     * Sets whether JSONC (JSON with comments) is supported.
     * By default, this is configured to false.
     *
     * @param jsoncSupported Whether JSONC is supported.
     * @return The updated JsonOptions object.
     */
    public JsonOptions setJsoncSupported(boolean jsoncSupported) {
        this.isJsoncSupported = jsoncSupported;
        return this;
    }

}
