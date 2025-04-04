// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.BookmarkProperties;
import com.azure.resourcemanager.securityinsights.models.IncidentInfo;
import com.azure.resourcemanager.securityinsights.models.IncidentSeverity;
import com.azure.resourcemanager.securityinsights.models.UserInfo;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class BookmarkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BookmarkProperties model = BinaryData.fromString(
            "{\"created\":\"2021-05-08T13:34:52Z\",\"createdBy\":{\"email\":\"glmjth\",\"name\":\"kw\",\"objectId\":\"2465c5c0-6f86-4f84-ba3f-59023614fb30\"},\"displayName\":\"eicxmqciwqvhkhi\",\"labels\":[\"gdtopbobjogh\",\"e\",\"u\"],\"notes\":\"a\",\"query\":\"hrzayvvtpgvdf\",\"queryResult\":\"otkftutqxlngx\",\"updated\":\"2021-12-03T02:20:16Z\",\"updatedBy\":{\"email\":\"gnxkrxdqmidtth\",\"name\":\"vqdra\",\"objectId\":\"edee10b2-5f55-4ab1-994a-208bf16c1919\"},\"eventTime\":\"2021-09-24T23:35:33Z\",\"queryStartTime\":\"2021-09-14T02:51:19Z\",\"queryEndTime\":\"2021-06-25T18:07:24Z\",\"incidentInfo\":{\"incidentId\":\"qfbow\",\"severity\":\"Informational\",\"title\":\"yktz\",\"relationName\":\"u\"}}")
            .toObject(BookmarkProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-08T13:34:52Z"), model.created());
        Assertions.assertEquals(UUID.fromString("2465c5c0-6f86-4f84-ba3f-59023614fb30"), model.createdBy().objectId());
        Assertions.assertEquals("eicxmqciwqvhkhi", model.displayName());
        Assertions.assertEquals("gdtopbobjogh", model.labels().get(0));
        Assertions.assertEquals("a", model.notes());
        Assertions.assertEquals("hrzayvvtpgvdf", model.query());
        Assertions.assertEquals("otkftutqxlngx", model.queryResult());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-03T02:20:16Z"), model.updated());
        Assertions.assertEquals(UUID.fromString("edee10b2-5f55-4ab1-994a-208bf16c1919"), model.updatedBy().objectId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-24T23:35:33Z"), model.eventTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-14T02:51:19Z"), model.queryStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-25T18:07:24Z"), model.queryEndTime());
        Assertions.assertEquals("qfbow", model.incidentInfo().incidentId());
        Assertions.assertEquals(IncidentSeverity.INFORMATIONAL, model.incidentInfo().severity());
        Assertions.assertEquals("yktz", model.incidentInfo().title());
        Assertions.assertEquals("u", model.incidentInfo().relationName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BookmarkProperties model = new BookmarkProperties().withCreated(OffsetDateTime.parse("2021-05-08T13:34:52Z"))
            .withCreatedBy(new UserInfo().withObjectId(UUID.fromString("2465c5c0-6f86-4f84-ba3f-59023614fb30")))
            .withDisplayName("eicxmqciwqvhkhi")
            .withLabels(Arrays.asList("gdtopbobjogh", "e", "u"))
            .withNotes("a")
            .withQuery("hrzayvvtpgvdf")
            .withQueryResult("otkftutqxlngx")
            .withUpdated(OffsetDateTime.parse("2021-12-03T02:20:16Z"))
            .withUpdatedBy(new UserInfo().withObjectId(UUID.fromString("edee10b2-5f55-4ab1-994a-208bf16c1919")))
            .withEventTime(OffsetDateTime.parse("2021-09-24T23:35:33Z"))
            .withQueryStartTime(OffsetDateTime.parse("2021-09-14T02:51:19Z"))
            .withQueryEndTime(OffsetDateTime.parse("2021-06-25T18:07:24Z"))
            .withIncidentInfo(new IncidentInfo().withIncidentId("qfbow")
                .withSeverity(IncidentSeverity.INFORMATIONAL)
                .withTitle("yktz")
                .withRelationName("u"));
        model = BinaryData.fromObject(model).toObject(BookmarkProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-08T13:34:52Z"), model.created());
        Assertions.assertEquals(UUID.fromString("2465c5c0-6f86-4f84-ba3f-59023614fb30"), model.createdBy().objectId());
        Assertions.assertEquals("eicxmqciwqvhkhi", model.displayName());
        Assertions.assertEquals("gdtopbobjogh", model.labels().get(0));
        Assertions.assertEquals("a", model.notes());
        Assertions.assertEquals("hrzayvvtpgvdf", model.query());
        Assertions.assertEquals("otkftutqxlngx", model.queryResult());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-03T02:20:16Z"), model.updated());
        Assertions.assertEquals(UUID.fromString("edee10b2-5f55-4ab1-994a-208bf16c1919"), model.updatedBy().objectId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-24T23:35:33Z"), model.eventTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-14T02:51:19Z"), model.queryStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-25T18:07:24Z"), model.queryEndTime());
        Assertions.assertEquals("qfbow", model.incidentInfo().incidentId());
        Assertions.assertEquals(IncidentSeverity.INFORMATIONAL, model.incidentInfo().severity());
        Assertions.assertEquals("yktz", model.incidentInfo().title());
        Assertions.assertEquals("u", model.incidentInfo().relationName());
    }
}
