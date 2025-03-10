// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securitydevops.fluent.models.GitHubConnectorInner;
import com.azure.resourcemanager.securitydevops.models.GitHubConnector;
import com.azure.resourcemanager.securitydevops.models.GitHubConnectorProperties;
import java.util.Collections;
import java.util.Map;

public final class GitHubConnectorImpl implements GitHubConnector, GitHubConnector.Definition, GitHubConnector.Update {
    private GitHubConnectorInner innerObject;

    private final com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public GitHubConnectorProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public GitHubConnectorInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securitydevops.SecurityDevOpsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String gitHubConnectorName;

    public GitHubConnectorImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public GitHubConnector create() {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubConnectors()
            .createOrUpdate(resourceGroupName, gitHubConnectorName, this.innerModel(), Context.NONE);
        return this;
    }

    public GitHubConnector create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubConnectors()
            .createOrUpdate(resourceGroupName, gitHubConnectorName, this.innerModel(), context);
        return this;
    }

    GitHubConnectorImpl(String name, com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager) {
        this.innerObject = new GitHubConnectorInner();
        this.serviceManager = serviceManager;
        this.gitHubConnectorName = name;
    }

    public GitHubConnectorImpl update() {
        return this;
    }

    public GitHubConnector apply() {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubConnectors()
            .update(resourceGroupName, gitHubConnectorName, this.innerModel(), Context.NONE);
        return this;
    }

    public GitHubConnector apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubConnectors()
            .update(resourceGroupName, gitHubConnectorName, this.innerModel(), context);
        return this;
    }

    GitHubConnectorImpl(GitHubConnectorInner innerObject,
        com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.gitHubConnectorName = Utils.getValueFromIdByName(innerObject.id(), "gitHubConnectors");
    }

    public GitHubConnector refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubConnectors()
            .getByResourceGroupWithResponse(resourceGroupName, gitHubConnectorName, Context.NONE)
            .getValue();
        return this;
    }

    public GitHubConnector refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubConnectors()
            .getByResourceGroupWithResponse(resourceGroupName, gitHubConnectorName, context)
            .getValue();
        return this;
    }

    public GitHubConnectorImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public GitHubConnectorImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public GitHubConnectorImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public GitHubConnectorImpl withProperties(GitHubConnectorProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
