// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.resourcemanager.loganalytics.fluent.models.SharedKeysInner;

/**
 * An immutable client-side representation of SharedKeys.
 */
public interface SharedKeys {
    /**
     * Gets the primarySharedKey property: The primary shared key of a workspace.
     * 
     * @return the primarySharedKey value.
     */
    String primarySharedKey();

    /**
     * Gets the secondarySharedKey property: The secondary shared key of a workspace.
     * 
     * @return the secondarySharedKey value.
     */
    String secondarySharedKey();

    /**
     * Gets the inner com.azure.resourcemanager.loganalytics.fluent.models.SharedKeysInner object.
     * 
     * @return the inner object.
     */
    SharedKeysInner innerModel();
}
