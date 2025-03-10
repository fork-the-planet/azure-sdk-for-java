// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.fluent.models.RecommendationActionInner;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RecommendationActionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecommendationActionInner model = BinaryData.fromString(
            "{\"properties\":{\"advisorName\":\"bm\",\"sessionId\":\"wuwprzqlv\",\"actionId\":1484000584,\"createdTime\":\"2021-02-19T06:27:55Z\",\"expirationTime\":\"2021-02-13T23:39:41Z\",\"reason\":\"khfxobbcswsrt\",\"recommendationType\":\"iplrbpbewtghfgb\",\"details\":{\"gibtnm\":\"wxzvlvqhjkb\"}},\"id\":\"iebwwaloayqcgwrt\",\"name\":\"j\",\"type\":\"zg\"}")
            .toObject(RecommendationActionInner.class);
        Assertions.assertEquals("bm", model.advisorName());
        Assertions.assertEquals("wuwprzqlv", model.sessionId());
        Assertions.assertEquals(1484000584, model.actionId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-19T06:27:55Z"), model.createdTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-13T23:39:41Z"), model.expirationTime());
        Assertions.assertEquals("khfxobbcswsrt", model.reason());
        Assertions.assertEquals("iplrbpbewtghfgb", model.recommendationType());
        Assertions.assertEquals("wxzvlvqhjkb", model.details().get("gibtnm"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecommendationActionInner model = new RecommendationActionInner().withAdvisorName("bm")
            .withSessionId("wuwprzqlv")
            .withActionId(1484000584)
            .withCreatedTime(OffsetDateTime.parse("2021-02-19T06:27:55Z"))
            .withExpirationTime(OffsetDateTime.parse("2021-02-13T23:39:41Z"))
            .withReason("khfxobbcswsrt")
            .withRecommendationType("iplrbpbewtghfgb")
            .withDetails(mapOf("gibtnm", "wxzvlvqhjkb"));
        model = BinaryData.fromObject(model).toObject(RecommendationActionInner.class);
        Assertions.assertEquals("bm", model.advisorName());
        Assertions.assertEquals("wuwprzqlv", model.sessionId());
        Assertions.assertEquals(1484000584, model.actionId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-19T06:27:55Z"), model.createdTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-13T23:39:41Z"), model.expirationTime());
        Assertions.assertEquals("khfxobbcswsrt", model.reason());
        Assertions.assertEquals("iplrbpbewtghfgb", model.recommendationType());
        Assertions.assertEquals("wxzvlvqhjkb", model.details().get("gibtnm"));
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
