// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.ModelCapacityListResultValueItem;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LocationBasedModelCapacitiesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"location\":\"ycsxzu\",\"properties\":{\"model\":{\"publisher\":\"lsmdesqplpvmjc\",\"format\":\"ewbidyvteowxv\",\"name\":\"iudeu\",\"version\":\"sxze\",\"source\":\"axwk\",\"sourceAccount\":\"ykhv\",\"callRateLimit\":{\"count\":36.75517,\"renewalPeriod\":93.7912,\"rules\":[{},{},{}]}},\"skuName\":\"znabaobns\",\"availableCapacity\":77.23243,\"availableFinetuneCapacity\":76.454056},\"id\":\"ltymkmvguihywart\",\"name\":\"pphkixkykxds\",\"type\":\"j\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ModelCapacityListResultValueItem> response = manager.locationBasedModelCapacities()
            .list("hdroznnh", "rlktgjcsggu", "hemlwywaee", "zgfbukklelssx", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ycsxzu", response.iterator().next().location());
        Assertions.assertEquals("lsmdesqplpvmjc", response.iterator().next().properties().model().publisher());
        Assertions.assertEquals("ewbidyvteowxv", response.iterator().next().properties().model().format());
        Assertions.assertEquals("iudeu", response.iterator().next().properties().model().name());
        Assertions.assertEquals("sxze", response.iterator().next().properties().model().version());
        Assertions.assertEquals("axwk", response.iterator().next().properties().model().source());
        Assertions.assertEquals("ykhv", response.iterator().next().properties().model().sourceAccount());
        Assertions.assertEquals("znabaobns", response.iterator().next().properties().skuName());
        Assertions.assertEquals(77.23243F, response.iterator().next().properties().availableCapacity());
        Assertions.assertEquals(76.454056F, response.iterator().next().properties().availableFinetuneCapacity());
    }
}
