// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.iotcentral.IotCentralManager;
import com.azure.resourcemanager.iotcentral.models.PrivateLinkResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateLinksListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"groupId\":\"vinvkj\",\"requiredMembers\":[\"xrbuukzclew\",\"hmlwpaztzpo\",\"ncckw\"],\"requiredZoneNames\":[\"qwhxxbuyqaxzfeqz\",\"ppriol\",\"or\",\"altol\"]},\"id\":\"cwsobqwcs\",\"name\":\"bnwdcfh\",\"type\":\"cqdpfuv\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        IotCentralManager manager = IotCentralManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PrivateLinkResource> response
            = manager.privateLinks().list("dszue", "psbzkfzbeyvpn", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("qwhxxbuyqaxzfeqz", response.iterator().next().requiredZoneNames().get(0));
    }
}
