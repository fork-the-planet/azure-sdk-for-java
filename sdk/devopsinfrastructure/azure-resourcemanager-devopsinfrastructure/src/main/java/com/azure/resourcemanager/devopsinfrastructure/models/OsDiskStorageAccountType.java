// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The storage account type of the OS disk.
 */
public final class OsDiskStorageAccountType extends ExpandableStringEnum<OsDiskStorageAccountType> {
    /**
     * Standard OS disk type.
     */
    public static final OsDiskStorageAccountType STANDARD = fromString("Standard");

    /**
     * Premium OS disk type.
     */
    public static final OsDiskStorageAccountType PREMIUM = fromString("Premium");

    /**
     * Standard SSD OS disk type.
     */
    public static final OsDiskStorageAccountType STANDARD_SSD = fromString("StandardSSD");

    /**
     * Creates a new instance of OsDiskStorageAccountType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OsDiskStorageAccountType() {
    }

    /**
     * Creates or finds a OsDiskStorageAccountType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OsDiskStorageAccountType.
     */
    public static OsDiskStorageAccountType fromString(String name) {
        return fromString(name, OsDiskStorageAccountType.class);
    }

    /**
     * Gets known OsDiskStorageAccountType values.
     * 
     * @return known OsDiskStorageAccountType values.
     */
    public static Collection<OsDiskStorageAccountType> values() {
        return values(OsDiskStorageAccountType.class);
    }
}
