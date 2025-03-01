// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.License;
import com.azure.resourcemanager.hybridcompute.models.LicenseCoreType;
import com.azure.resourcemanager.hybridcompute.models.LicenseEdition;
import com.azure.resourcemanager.hybridcompute.models.LicenseState;
import com.azure.resourcemanager.hybridcompute.models.LicenseTarget;
import com.azure.resourcemanager.hybridcompute.models.LicenseType;
import com.azure.resourcemanager.hybridcompute.models.ProgramYear;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LicensesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"tenantId\":\"bn\",\"licenseType\":\"ESU\",\"licenseDetails\":{\"state\":\"Activated\",\"target\":\"Windows Server 2012\",\"edition\":\"Datacenter\",\"type\":\"vCore\",\"processors\":790882759,\"assignedLicenses\":1670220024,\"immutableId\":\"psttexoq\",\"volumeLicenseDetails\":[{\"programYear\":\"Year 1\",\"invoiceId\":\"ufmhrunc\"},{\"programYear\":\"Year 3\",\"invoiceId\":\"spkcdqzh\"},{\"programYear\":\"Year 3\",\"invoiceId\":\"dunqnd\"},{\"programYear\":\"Year 3\",\"invoiceId\":\"hrqbnjjrcg\"}]}},\"location\":\"ydcwboxjumv\",\"tags\":{\"tloqxfuojrn\":\"lihrraiouaubr\",\"mzdlyjdfqwmkyo\":\"iflrzpasccbiu\"},\"id\":\"ufdvruz\",\"name\":\"lzo\",\"type\":\"hpc\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridComputeManager manager = HybridComputeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<License> response
            = manager.licenses().listByResourceGroup("chzyvlixqnrk", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ydcwboxjumv", response.iterator().next().location());
        Assertions.assertEquals("lihrraiouaubr", response.iterator().next().tags().get("tloqxfuojrn"));
        Assertions.assertEquals("bn", response.iterator().next().tenantId());
        Assertions.assertEquals(LicenseType.ESU, response.iterator().next().licenseType());
        Assertions.assertEquals(LicenseState.ACTIVATED, response.iterator().next().licenseDetails().state());
        Assertions.assertEquals(LicenseTarget.WINDOWS_SERVER_2012,
            response.iterator().next().licenseDetails().target());
        Assertions.assertEquals(LicenseEdition.DATACENTER, response.iterator().next().licenseDetails().edition());
        Assertions.assertEquals(LicenseCoreType.V_CORE, response.iterator().next().licenseDetails().type());
        Assertions.assertEquals(790882759, response.iterator().next().licenseDetails().processors());
        Assertions.assertEquals(ProgramYear.YEAR_1,
            response.iterator().next().licenseDetails().volumeLicenseDetails().get(0).programYear());
        Assertions.assertEquals("ufmhrunc",
            response.iterator().next().licenseDetails().volumeLicenseDetails().get(0).invoiceId());
    }
}
