// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.Schedule;
import com.azure.resourcemanager.devtestlabs.models.ScheduleFragment;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SchedulesUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"status\":\"Disabled\",\"taskType\":\"rdhabsr\",\"weeklyRecurrence\":{\"weekdays\":[\"rhpqatiwkkvya\",\"xkvvcs\",\"msvuvdjkqxetq\"],\"time\":\"livrjjxnwx\"},\"dailyRecurrence\":{\"time\":\"p\"},\"hourlyRecurrence\":{\"minute\":502816571},\"timeZoneId\":\"hzlxpgfquw\",\"notificationSettings\":{\"status\":\"Disabled\",\"timeInMinutes\":1697047368,\"webhookUrl\":\"lwcerwkwb\",\"emailRecipient\":\"xljtxbusqtbxxn\",\"notificationLocale\":\"i\"},\"createdDate\":\"2021-10-10T00:35:57Z\",\"targetResourceId\":\"gbdgzp\",\"provisioningState\":\"secnadbuwqrgxf\",\"uniqueIdentifier\":\"mqiyn\"},\"location\":\"zoellnkkiiwvmtum\",\"tags\":{\"rguncanldu\":\"mdjfuaxroqvqpi\",\"x\":\"zorxsb\"},\"id\":\"qk\",\"name\":\"xym\",\"type\":\"kqv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevTestLabsManager manager = DevTestLabsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Schedule response = manager.schedules()
            .updateWithResponse("sbvr", "aqgvto", "rulfuct",
                new ScheduleFragment().withTags(mapOf("hxlyubqjrostvrje", "thcfj", "ztr", "mtzzbeq")),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("zoellnkkiiwvmtum", response.location());
        Assertions.assertEquals("mdjfuaxroqvqpi", response.tags().get("rguncanldu"));
        Assertions.assertEquals(EnableStatus.DISABLED, response.status());
        Assertions.assertEquals("rdhabsr", response.taskType());
        Assertions.assertEquals("rhpqatiwkkvya", response.weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("livrjjxnwx", response.weeklyRecurrence().time());
        Assertions.assertEquals("p", response.dailyRecurrence().time());
        Assertions.assertEquals(502816571, response.hourlyRecurrence().minute());
        Assertions.assertEquals("hzlxpgfquw", response.timeZoneId());
        Assertions.assertEquals(EnableStatus.DISABLED, response.notificationSettings().status());
        Assertions.assertEquals(1697047368, response.notificationSettings().timeInMinutes());
        Assertions.assertEquals("lwcerwkwb", response.notificationSettings().webhookUrl());
        Assertions.assertEquals("xljtxbusqtbxxn", response.notificationSettings().emailRecipient());
        Assertions.assertEquals("i", response.notificationSettings().notificationLocale());
        Assertions.assertEquals("gbdgzp", response.targetResourceId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
