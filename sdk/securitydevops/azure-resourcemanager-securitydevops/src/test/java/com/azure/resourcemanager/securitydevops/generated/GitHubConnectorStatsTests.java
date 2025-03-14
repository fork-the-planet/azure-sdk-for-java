// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securitydevops.models.GitHubConnectorStats;
import com.azure.resourcemanager.securitydevops.models.GitHubConnectorStatsProperties;
import com.azure.resourcemanager.securitydevops.models.ProvisioningState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GitHubConnectorStatsTests {
    @Test
    public void testDeserialize() {
        GitHubConnectorStats model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"ownersCount\":6526803648153900113,\"reposCount\":2842723799650662842},\"id\":\"jqkwpyeicx\",\"name\":\"qciwqvhkhixuigdt\",\"type\":\"pbobjo\"}")
            .toObject(GitHubConnectorStats.class);
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.properties().provisioningState());
        Assertions.assertEquals(6526803648153900113L, model.properties().ownersCount());
        Assertions.assertEquals(2842723799650662842L, model.properties().reposCount());
    }

    @Test
    public void testSerialize() {
        GitHubConnectorStats model = new GitHubConnectorStats()
            .withProperties(new GitHubConnectorStatsProperties().withProvisioningState(ProvisioningState.SUCCEEDED)
                .withOwnersCount(6526803648153900113L)
                .withReposCount(2842723799650662842L));
        model = BinaryData.fromObject(model).toObject(GitHubConnectorStats.class);
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.properties().provisioningState());
        Assertions.assertEquals(6526803648153900113L, model.properties().ownersCount());
        Assertions.assertEquals(2842723799650662842L, model.properties().reposCount());
    }
}
