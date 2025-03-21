// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalAssignment;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.PrincipalType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DatabasePrincipalAssignmentsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"principalId\":\"mjel\",\"role\":\"UnrestrictedViewer\",\"tenantId\":\"cigeleohdbvqvw\",\"principalType\":\"Group\",\"tenantName\":\"opwbeonrlkwzd\",\"principalName\":\"bxcea\",\"provisioningState\":\"Succeeded\",\"aadObjectId\":\"tsoqfyiaseqchk\"},\"id\":\"ttzrazisgyki\",\"name\":\"emv\",\"type\":\"nbwzohmnrxxbso\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        KustoManager manager = KustoManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DatabasePrincipalAssignment response = manager.databasePrincipalAssignments()
            .define("k")
            .withExistingDatabase("spnxwqagnepzw", "klsbsbqqqagw", "rxaomzisglrrcze")
            .withPrincipalId("ltn")
            .withRole(DatabasePrincipalRole.INGESTOR)
            .withTenantId("hqo")
            .withPrincipalType(PrincipalType.GROUP)
            .create();

        Assertions.assertEquals("mjel", response.principalId());
        Assertions.assertEquals(DatabasePrincipalRole.UNRESTRICTED_VIEWER, response.role());
        Assertions.assertEquals("cigeleohdbvqvw", response.tenantId());
        Assertions.assertEquals(PrincipalType.GROUP, response.principalType());
    }
}
