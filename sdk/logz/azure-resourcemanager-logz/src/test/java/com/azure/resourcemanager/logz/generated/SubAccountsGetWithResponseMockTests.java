// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.logz.LogzManager;
import com.azure.resourcemanager.logz.models.LogzMonitorResource;
import com.azure.resourcemanager.logz.models.ManagedIdentityTypes;
import com.azure.resourcemanager.logz.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.logz.models.MonitoringStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SubAccountsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Canceled\",\"monitoringStatus\":\"Disabled\",\"marketplaceSubscriptionStatus\":\"Active\",\"logzOrganizationProperties\":{\"companyName\":\"yuq\",\"id\":\"pqlpq\",\"enterpriseAppId\":\"ciuqgbdb\",\"singleSignOnUrl\":\"auvfbtkuwhhmhyk\"},\"userInfo\":{\"firstName\":\"xafnndlpichko\",\"lastName\":\"kcdyhbpk\",\"emailAddress\":\"wdreqnovvqfovl\",\"phoneNumber\":\"ywsuwsy\"},\"planData\":{\"usageType\":\"dsytgadgvr\",\"billingCycle\":\"aeneqnzarrwl\",\"planDetails\":\"uijfqk\",\"effectiveDate\":\"2021-06-20T18:32:46Z\"},\"liftrResourceCategory\":\"Unknown\",\"liftrResourcePreference\":288092317},\"identity\":{\"principalId\":\"ubjibww\",\"tenantId\":\"tohqkvpuvksgp\",\"type\":\"UserAssigned\"},\"location\":\"kn\",\"tags\":{\"iyntorzihle\":\"synljphuopxodl\",\"yzrpzbchckqqzq\":\"sjswsrms\",\"ysuiizynkedya\":\"ox\"},\"id\":\"rwyhqmibzyhwitsm\",\"name\":\"pyy\",\"type\":\"pcdpumnz\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LogzManager manager = LogzManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        LogzMonitorResource response = manager.subAccounts()
            .getWithResponse("nwashrtd", "kcnqxwbpo", "ulpiuj", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("kn", response.location());
        Assertions.assertEquals("synljphuopxodl", response.tags().get("iyntorzihle"));
        Assertions.assertEquals(MonitoringStatus.DISABLED, response.properties().monitoringStatus());
        Assertions.assertEquals(MarketplaceSubscriptionStatus.ACTIVE,
            response.properties().marketplaceSubscriptionStatus());
        Assertions.assertEquals("yuq", response.properties().logzOrganizationProperties().companyName());
        Assertions.assertEquals("ciuqgbdb", response.properties().logzOrganizationProperties().enterpriseAppId());
        Assertions.assertEquals("auvfbtkuwhhmhyk",
            response.properties().logzOrganizationProperties().singleSignOnUrl());
        Assertions.assertEquals("xafnndlpichko", response.properties().userInfo().firstName());
        Assertions.assertEquals("kcdyhbpk", response.properties().userInfo().lastName());
        Assertions.assertEquals("wdreqnovvqfovl", response.properties().userInfo().emailAddress());
        Assertions.assertEquals("ywsuwsy", response.properties().userInfo().phoneNumber());
        Assertions.assertEquals("dsytgadgvr", response.properties().planData().usageType());
        Assertions.assertEquals("aeneqnzarrwl", response.properties().planData().billingCycle());
        Assertions.assertEquals("uijfqk", response.properties().planData().planDetails());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-20T18:32:46Z"),
            response.properties().planData().effectiveDate());
        Assertions.assertEquals(ManagedIdentityTypes.USER_ASSIGNED, response.identity().type());
    }
}
