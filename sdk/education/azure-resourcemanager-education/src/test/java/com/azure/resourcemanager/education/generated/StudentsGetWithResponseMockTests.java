// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.education.EducationManager;
import com.azure.resourcemanager.education.models.StudentDetails;
import com.azure.resourcemanager.education.models.StudentRole;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class StudentsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"firstName\":\"rqlfktsthsucocmn\",\"lastName\":\"yazttbtwwrqpue\",\"email\":\"ckzywbiexzfeyue\",\"role\":\"Admin\",\"budget\":{\"currency\":\"bxu\",\"value\":79.83865},\"subscriptionId\":\"qwalmuzyoxaepd\",\"expirationDate\":\"2021-06-08T12:36:20Z\",\"status\":\"Disabled\",\"effectiveDate\":\"2021-08-16T11:07:09Z\",\"subscriptionAlias\":\"xrhdwbavxbniwdjs\",\"subscriptionInviteLastSentDate\":\"2021-12-07T05:36:29Z\"},\"id\":\"dbpgnxytxhp\",\"name\":\"xbzpfzab\",\"type\":\"lcuhxwtctyqiklb\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EducationManager manager = EducationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        StudentDetails response = manager.students()
            .getWithResponse("nkxmyskpbhenbtk", "xywnytnrsynlqidy", "yxczfclh", "axdbabph",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("rqlfktsthsucocmn", response.firstName());
        Assertions.assertEquals("yazttbtwwrqpue", response.lastName());
        Assertions.assertEquals("ckzywbiexzfeyue", response.email());
        Assertions.assertEquals(StudentRole.ADMIN, response.role());
        Assertions.assertEquals("bxu", response.budget().currency());
        Assertions.assertEquals(79.83865F, response.budget().value());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-08T12:36:20Z"), response.expirationDate());
        Assertions.assertEquals("xrhdwbavxbniwdjs", response.subscriptionAlias());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-07T05:36:29Z"),
            response.subscriptionInviteLastSentDate());
    }
}
