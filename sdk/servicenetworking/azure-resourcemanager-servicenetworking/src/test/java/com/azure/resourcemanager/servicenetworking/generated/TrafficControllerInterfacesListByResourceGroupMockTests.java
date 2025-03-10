// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.servicenetworking.TrafficControllerManager;
import com.azure.resourcemanager.servicenetworking.models.TrafficController;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TrafficControllerInterfacesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"configurationEndpoints\":[\"vlvqhjkbegi\",\"t\",\"mxiebw\",\"aloayqcgwrtzju\"],\"frontends\":[{\"id\":\"yzm\"},{\"id\":\"txon\"},{\"id\":\"mtsavjcbpwxqp\"}],\"associations\":[{\"id\":\"nftguvriuhpr\"},{\"id\":\"mdyvxqtayriw\"},{\"id\":\"ro\"}],\"securityPolicies\":[{\"id\":\"exrmcqibycnojvk\"},{\"id\":\"mefqsgzvahapjyzh\"}],\"securityPolicyConfigurations\":{\"wafSecurityPolicy\":{\"id\":\"qzcjrvxdj\"}},\"provisioningState\":\"Updating\"},\"location\":\"lxkvu\",\"tags\":{\"nluthnnp\":\"zovawjvz\",\"jzuaejxdultskzbb\":\"nxipeil\",\"wozuhkf\":\"dzumveekg\",\"uusdttouwa\":\"bsjyofdx\"},\"id\":\"oekqvk\",\"name\":\"lns\",\"type\":\"vbxwyjsflhh\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        TrafficControllerManager manager = TrafficControllerManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<TrafficController> response
            = manager.trafficControllerInterfaces().listByResourceGroup("c", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("lxkvu", response.iterator().next().location());
        Assertions.assertEquals("zovawjvz", response.iterator().next().tags().get("nluthnnp"));
        Assertions.assertEquals("qzcjrvxdj",
            response.iterator().next().properties().securityPolicyConfigurations().wafSecurityPolicy().id());
    }
}
