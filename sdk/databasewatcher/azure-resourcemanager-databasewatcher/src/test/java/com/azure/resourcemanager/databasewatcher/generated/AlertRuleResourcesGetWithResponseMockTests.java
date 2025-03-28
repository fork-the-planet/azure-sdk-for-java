// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.databasewatcher.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.databasewatcher.DatabaseWatcherManager;
import com.azure.resourcemanager.databasewatcher.models.AlertRuleCreationProperties;
import com.azure.resourcemanager.databasewatcher.models.AlertRuleResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AlertRuleResourcesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"alertRuleResourceId\":\"qzvszjf\",\"createdWithProperties\":\"None\",\"creationTime\":\"2021-03-12T20:34:44Z\",\"provisioningState\":\"Failed\",\"alertRuleTemplateId\":\"dxxiv\",\"alertRuleTemplateVersion\":\"tvtc\"},\"id\":\"qtdo\",\"name\":\"mcbxvwvxysl\",\"type\":\"bhsfxob\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DatabaseWatcherManager manager = DatabaseWatcherManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        AlertRuleResource response = manager.alertRuleResources()
            .getWithResponse("n", "u", "ivkrtsw", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("qzvszjf", response.properties().alertRuleResourceId());
        Assertions.assertEquals(AlertRuleCreationProperties.NONE, response.properties().createdWithProperties());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-12T20:34:44Z"), response.properties().creationTime());
        Assertions.assertEquals("dxxiv", response.properties().alertRuleTemplateId());
        Assertions.assertEquals("tvtc", response.properties().alertRuleTemplateVersion());
    }
}
