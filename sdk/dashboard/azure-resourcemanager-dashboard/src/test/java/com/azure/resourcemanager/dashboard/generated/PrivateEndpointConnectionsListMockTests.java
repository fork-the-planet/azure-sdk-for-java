// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.dashboard.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dashboard.DashboardManager;
import com.azure.resourcemanager.dashboard.models.PrivateEndpointConnection;
import com.azure.resourcemanager.dashboard.models.PrivateEndpointServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"kuwbcrnwb\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"seyvj\",\"actionsRequired\":\"rts\"},\"groupIds\":[\"pkdeemaofmxagkvt\",\"elmqk\"],\"provisioningState\":\"Deleting\"},\"id\":\"vljua\",\"name\":\"aquhcdhm\",\"type\":\"ualaexqpvfadmw\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DashboardManager manager = DashboardManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<PrivateEndpointConnection> response
            = manager.privateEndpointConnections().list("hrxsbk", "vpycanuzbp", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            response.iterator().next().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("seyvj", response.iterator().next().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("rts",
            response.iterator().next().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("pkdeemaofmxagkvt", response.iterator().next().groupIds().get(0));
    }
}
