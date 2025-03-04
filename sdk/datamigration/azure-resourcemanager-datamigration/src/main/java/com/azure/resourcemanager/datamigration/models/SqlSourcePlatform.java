// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * An enumeration of source platform types.
 */
public final class SqlSourcePlatform extends ExpandableStringEnum<SqlSourcePlatform> {
    /**
     * Static value SqlOnPrem for SqlSourcePlatform.
     */
    public static final SqlSourcePlatform SQL_ON_PREM = fromString("SqlOnPrem");

    /**
     * Creates a new instance of SqlSourcePlatform value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SqlSourcePlatform() {
    }

    /**
     * Creates or finds a SqlSourcePlatform from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SqlSourcePlatform.
     */
    public static SqlSourcePlatform fromString(String name) {
        return fromString(name, SqlSourcePlatform.class);
    }

    /**
     * Gets known SqlSourcePlatform values.
     * 
     * @return known SqlSourcePlatform values.
     */
    public static Collection<SqlSourcePlatform> values() {
        return values(SqlSourcePlatform.class);
    }
}
