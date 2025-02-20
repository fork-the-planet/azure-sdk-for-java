// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.models.LinkedService;
import com.azure.resourcemanager.loganalytics.models.LinkedServiceEntityStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LinkedServicesDeleteMockTests {
    @Test
    public void testDelete() throws Exception {
        String responseStr
            = "{\"properties\":{\"resourceId\":\"mjjyuojq\",\"writeAccessResourceId\":\"baxk\",\"provisioningState\":\"Succeeded\"},\"tags\":{\"jkwrusnkq\":\"nlb\",\"hdenxaulk\":\"hsyrqunj\",\"xuckpggqoweyir\":\"akdkifmjnnawtqab\"},\"id\":\"hlisngw\",\"name\":\"lqqmpiz\",\"type\":\"uwnpqxpxiwfcng\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LogAnalyticsManager manager = LogAnalyticsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        LinkedService response
            = manager.linkedServices().delete("bmhyreeudz", "av", "pdqmjxlyyzglgouw", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("nlb", response.tags().get("jkwrusnkq"));
        Assertions.assertEquals("mjjyuojq", response.resourceId());
        Assertions.assertEquals("baxk", response.writeAccessResourceId());
        Assertions.assertEquals(LinkedServiceEntityStatus.SUCCEEDED, response.provisioningState());
    }
}
