// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.models.LogAnalyticsQueryPackQuery;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class QueriesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"id\":\"rcxfailcfxwmdb\",\"displayName\":\"xdfgsftufqobr\",\"timeCreated\":\"2021-06-10T09:16:23Z\",\"timeModified\":\"2021-07-03T04:16:46Z\",\"author\":\"cc\",\"description\":\"nhxk\",\"body\":\"zvytnrzvuljraaer\",\"related\":{\"categories\":[\"qgukkjqnv\"],\"resourceTypes\":[\"ylaxxulcdi\",\"dosfjbjsvgjrw\"],\"solutions\":[\"vyc\",\"t\",\"c\",\"xgccknfnw\"]},\"tags\":{\"z\":[\"vpdvjdhttzae\",\"edxihchrphkmcrj\",\"qnsdfzpbgtgky\",\"kdghrjeuutlwx\"],\"oajvgcxtxjcs\":[\"hokvbwnh\",\"tqlgehgppi\",\"ifhpf\"],\"q\":[\"afidltugsres\",\"kssjhoiftxfk\",\"wegprh\",\"tillucbiqtg\"]},\"properties\":\"datamcwsldrizetpwb\"},\"id\":\"lllibph\",\"name\":\"zmizakakan\",\"type\":\"p\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LogAnalyticsManager manager = LogAnalyticsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<LogAnalyticsQueryPackQuery> response = manager.queries()
            .list("vodhtn", "irudh", 522814180418790552L, false, "sckdlp", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xdfgsftufqobr", response.iterator().next().displayName());
        Assertions.assertEquals("nhxk", response.iterator().next().description());
        Assertions.assertEquals("zvytnrzvuljraaer", response.iterator().next().body());
        Assertions.assertEquals("qgukkjqnv", response.iterator().next().related().categories().get(0));
        Assertions.assertEquals("ylaxxulcdi", response.iterator().next().related().resourceTypes().get(0));
        Assertions.assertEquals("vyc", response.iterator().next().related().solutions().get(0));
        Assertions.assertEquals("vpdvjdhttzae", response.iterator().next().tags().get("z").get(0));
    }
}
