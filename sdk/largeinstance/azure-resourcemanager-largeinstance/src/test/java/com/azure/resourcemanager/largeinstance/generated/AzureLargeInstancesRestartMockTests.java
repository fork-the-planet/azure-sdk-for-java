// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.largeinstance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.largeinstance.LargeInstanceManager;
import com.azure.resourcemanager.largeinstance.models.AzureLargeInstanceForcePowerState;
import com.azure.resourcemanager.largeinstance.models.ForceState;
import com.azure.resourcemanager.largeinstance.models.OperationStatusResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AzureLargeInstancesRestartMockTests {
    @Test
    public void testRestart() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"id\":\"hxw\",\"resourceId\":\"tyq\",\"name\":\"lbbovplw\",\"status\":\"bhvgy\",\"percentComplete\":82.802315,\"startTime\":\"2021-11-13T02:34Z\",\"endTime\":\"2021-01-13T18:03:39Z\",\"operations\":[{\"id\":\"sxqu\",\"resourceId\":\"fpl\",\"name\":\"gsxnkjzkdeslpv\",\"status\":\"opwi\",\"percentComplete\":41.176914,\"startTime\":\"2021-04-06T19:37:39Z\",\"endTime\":\"2021-12-05T06:49:37Z\",\"operations\":[{\"id\":\"baiuebbaumny\",\"resourceId\":\"ped\",\"name\":\"jn\",\"status\":\"bckhsmtxpsi\",\"percentComplete\":96.578255,\"startTime\":\"2021-06-30T11:17:19Z\",\"endTime\":\"2021-12-08T15:13:53Z\",\"operations\":[{\"status\":\"apskrdqm\"},{\"status\":\"jjdhtld\"}]},{\"id\":\"zxuutkncwscwsvl\",\"resourceId\":\"togt\",\"name\":\"upqsx\",\"status\":\"nmic\",\"percentComplete\":13.040853,\"startTime\":\"2020-12-28T17:16:14Z\",\"endTime\":\"2021-09-10T18:39:44Z\",\"operations\":[{\"status\":\"lo\"},{\"status\":\"notyfjfcnjbkcn\"}]}]},{\"id\":\"ttkphywpnvjtoqne\",\"resourceId\":\"clfp\",\"name\":\"hoxus\",\"status\":\"rpabg\",\"percentComplete\":36.845005,\"startTime\":\"2021-09-14T16:50:26Z\",\"endTime\":\"2020-12-23T01:06:53Z\",\"operations\":[{\"id\":\"ugxywpmueef\",\"resourceId\":\"wfqkquj\",\"name\":\"suyonobglaocq\",\"status\":\"tcc\",\"percentComplete\":62.299984,\"startTime\":\"2021-02-11T06:40:02Z\",\"endTime\":\"2021-07-13T20:38:11Z\",\"operations\":[{\"status\":\"moyrxvwfudwpz\"},{\"status\":\"txhdzh\"}]}]},{\"id\":\"bh\",\"resourceId\":\"frlh\",\"name\":\"sbkyvpycanuzbp\",\"status\":\"kafkuwbcrnwbm\",\"percentComplete\":39.313377,\"startTime\":\"2021-07-04T17:06:56Z\",\"endTime\":\"2021-09-03T17:59:20Z\",\"operations\":[{\"id\":\"rts\",\"resourceId\":\"spkdee\",\"name\":\"ofmxagkvtmelmqkr\",\"status\":\"ahvljuaha\",\"percentComplete\":50.34383,\"startTime\":\"2021-02-06T01:31:14Z\",\"endTime\":\"2021-02-17T13:46:53Z\",\"operations\":[{\"status\":\"alaexqpvfadmwsrc\"},{\"status\":\"gvxp\"},{\"status\":\"gomz\"},{\"status\":\"fmisg\"}]}]}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        LargeInstanceManager manager = LargeInstanceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationStatusResult response = manager.azureLargeInstances()
            .restart("dbpgnxytxhp", "xbzpfzab",
                new ForceState().withForceState(AzureLargeInstanceForcePowerState.ACTIVE),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hxw", response.id());
        Assertions.assertEquals("lbbovplw", response.name());
        Assertions.assertEquals("bhvgy", response.status());
        Assertions.assertEquals(82.802315F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-13T02:34Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-13T18:03:39Z"), response.endTime());
        Assertions.assertEquals("sxqu", response.operations().get(0).id());
        Assertions.assertEquals("gsxnkjzkdeslpv", response.operations().get(0).name());
        Assertions.assertEquals("opwi", response.operations().get(0).status());
        Assertions.assertEquals(41.176914F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-06T19:37:39Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-05T06:49:37Z"), response.operations().get(0).endTime());
        Assertions.assertEquals("baiuebbaumny", response.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("jn", response.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("bckhsmtxpsi", response.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(96.578255F, response.operations().get(0).operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-30T11:17:19Z"),
            response.operations().get(0).operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-08T15:13:53Z"),
            response.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("apskrdqm",
            response.operations().get(0).operations().get(0).operations().get(0).status());
    }
}
