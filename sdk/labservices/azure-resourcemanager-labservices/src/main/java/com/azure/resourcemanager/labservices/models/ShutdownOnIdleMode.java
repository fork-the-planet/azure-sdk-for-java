// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

/**
 * Defines whether to shut down VM on idle and the criteria for idle detection.
 */
public enum ShutdownOnIdleMode {
    /**
     * Enum value None.
     */
    NONE("None"),

    /**
     * Enum value UserAbsence.
     */
    USER_ABSENCE("UserAbsence"),

    /**
     * Enum value LowUsage.
     */
    LOW_USAGE("LowUsage");

    /**
     * The actual serialized value for a ShutdownOnIdleMode instance.
     */
    private final String value;

    ShutdownOnIdleMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ShutdownOnIdleMode instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ShutdownOnIdleMode object, or null if unable to parse.
     */
    public static ShutdownOnIdleMode fromString(String value) {
        if (value == null) {
            return null;
        }
        ShutdownOnIdleMode[] items = ShutdownOnIdleMode.values();
        for (ShutdownOnIdleMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
