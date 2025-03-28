// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.loganalytics.fluent.models.OperationStatusInner;

/**
 * An immutable client-side representation of OperationStatus.
 */
public interface OperationStatus {
    /**
     * Gets the id property: The operation Id.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The operation name.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the startTime property: The start time of the operation.
     * 
     * @return the startTime value.
     */
    String startTime();

    /**
     * Gets the endTime property: The end time of the operation.
     * 
     * @return the endTime value.
     */
    String endTime();

    /**
     * Gets the status property: The status of the operation.
     * 
     * @return the status value.
     */
    String status();

    /**
     * Gets the error property: The error detail of the operation if any.
     * 
     * @return the error value.
     */
    ManagementError error();

    /**
     * Gets the inner com.azure.resourcemanager.loganalytics.fluent.models.OperationStatusInner object.
     * 
     * @return the inner object.
     */
    OperationStatusInner innerModel();
}
