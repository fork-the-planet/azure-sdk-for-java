// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.automation.AutomationManager;
import com.azure.resourcemanager.automation.models.ProvisioningState;
import com.azure.resourcemanager.automation.models.SourceControlSyncJob;
import com.azure.resourcemanager.automation.models.SyncType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SourceControlSyncJobsListByAutomationAccountMockTests {
    @Test
    public void testListByAutomationAccount() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"culregpqt\",\"type\":\"jhvrztnvgyshqrdg\",\"id\":\"wmewjzlpyk\",\"properties\":{\"sourceControlSyncJobId\":\"zzwjcayerzrran\",\"creationTime\":\"2021-08-18T13:41:14Z\",\"provisioningState\":\"Completed\",\"startTime\":\"2021-03-07T01:02:13Z\",\"endTime\":\"2021-02-10T03:00:51Z\",\"syncType\":\"FullSync\"}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AutomationManager manager = AutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SourceControlSyncJob> response = manager.sourceControlSyncJobs()
            .listByAutomationAccount("fhpri", "lfmpztr", "ud", "vhl", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zzwjcayerzrran", response.iterator().next().sourceControlSyncJobId());
        Assertions.assertEquals(ProvisioningState.COMPLETED, response.iterator().next().provisioningState());
        Assertions.assertEquals(SyncType.FULL_SYNC, response.iterator().next().syncType());
    }
}
