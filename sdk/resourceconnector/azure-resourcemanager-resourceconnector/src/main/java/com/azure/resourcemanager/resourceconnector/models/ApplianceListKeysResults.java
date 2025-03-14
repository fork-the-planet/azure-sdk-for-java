// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.models;

import com.azure.resourcemanager.resourceconnector.fluent.models.ApplianceListKeysResultsInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of ApplianceListKeysResults.
 */
public interface ApplianceListKeysResults {
    /**
     * Gets the artifactProfiles property: Map of artifacts that contains a list of ArtifactProfile used to upload
     * artifacts such as logs.
     * 
     * @return the artifactProfiles value.
     */
    Map<String, ArtifactProfile> artifactProfiles();

    /**
     * Gets the kubeconfigs property: The list of appliance kubeconfigs.
     * 
     * @return the kubeconfigs value.
     */
    List<ApplianceCredentialKubeconfig> kubeconfigs();

    /**
     * Gets the sshKeys property: Map of Customer User Public, Private SSH Keys and Certificate when available.
     * 
     * @return the sshKeys value.
     */
    Map<String, SshKey> sshKeys();

    /**
     * Gets the inner com.azure.resourcemanager.resourceconnector.fluent.models.ApplianceListKeysResultsInner object.
     * 
     * @return the inner object.
     */
    ApplianceListKeysResultsInner innerModel();
}
