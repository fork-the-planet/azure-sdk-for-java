// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

/**
 * The elevation level of the user.
 */
public enum ElevationLevel {
    /**
     * Enum value NonAdmin.
     */
    NON_ADMIN("NonAdmin"),

    /**
     * Enum value Admin.
     */
    ADMIN("Admin");

    /**
     * The actual serialized value for a ElevationLevel instance.
     */
    private final String value;

    ElevationLevel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ElevationLevel instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ElevationLevel object, or null if unable to parse.
     */
    public static ElevationLevel fromString(String value) {
        if (value == null) {
            return null;
        }
        ElevationLevel[] items = ElevationLevel.values();
        for (ElevationLevel item : items) {
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
