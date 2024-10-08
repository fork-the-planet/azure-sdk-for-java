// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The paths which will be mounted to container task's container.
 */
public final class ContainerHostDataPath extends ExpandableStringEnum<ContainerHostDataPath> {
    /**
     * Static value Shared for ContainerHostDataPath.
     */
    public static final ContainerHostDataPath SHARED = fromString("Shared");

    /**
     * Static value Startup for ContainerHostDataPath.
     */
    public static final ContainerHostDataPath STARTUP = fromString("Startup");

    /**
     * Static value VfsMounts for ContainerHostDataPath.
     */
    public static final ContainerHostDataPath VFS_MOUNTS = fromString("VfsMounts");

    /**
     * Static value Task for ContainerHostDataPath.
     */
    public static final ContainerHostDataPath TASK = fromString("Task");

    /**
     * Static value JobPrep for ContainerHostDataPath.
     */
    public static final ContainerHostDataPath JOB_PREP = fromString("JobPrep");

    /**
     * Static value Applications for ContainerHostDataPath.
     */
    public static final ContainerHostDataPath APPLICATIONS = fromString("Applications");

    /**
     * Creates a new instance of ContainerHostDataPath value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ContainerHostDataPath() {
    }

    /**
     * Creates or finds a ContainerHostDataPath from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ContainerHostDataPath.
     */
    public static ContainerHostDataPath fromString(String name) {
        return fromString(name, ContainerHostDataPath.class);
    }

    /**
     * Gets known ContainerHostDataPath values.
     * 
     * @return known ContainerHostDataPath values.
     */
    public static Collection<ContainerHostDataPath> values() {
        return values(ContainerHostDataPath.class);
    }
}
