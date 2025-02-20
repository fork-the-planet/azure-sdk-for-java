// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.fluent.models.IotConnectorInner;
import com.azure.resourcemanager.healthcareapis.models.IotConnectorCollection;
import com.azure.resourcemanager.healthcareapis.models.IotEventHubIngestionEndpointConfiguration;
import com.azure.resourcemanager.healthcareapis.models.IotMappingProperties;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityIdentity;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityType;
import com.azure.resourcemanager.healthcareapis.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IotConnectorCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotConnectorCollection model = BinaryData.fromString(
            "{\"nextLink\":\"ibx\",\"value\":[{\"properties\":{\"provisioningState\":\"Canceled\",\"ingestionEndpointConfiguration\":{\"eventHubName\":\"lmuzy\",\"consumerGroup\":\"aepdkzjanc\",\"fullyQualifiedEventHubNamespace\":\"rhdwbavxbniw\"},\"deviceMapping\":{\"content\":\"datawz\"}},\"identity\":{\"type\":\"None\",\"principalId\":\"5935d86c-2ce5-407f-a4f1-789b0af4e6c8\",\"tenantId\":\"0507481f-84f4-42e5-a9cf-c5ff134429fc\",\"userAssignedIdentities\":{\"x\":{\"principalId\":\"e6da41e8-04bc-49c1-afbf-e388250cc21f\",\"clientId\":\"7b005ba2-5a83-48f3-92c4-9c8198025721\"},\"xbzpfzab\":{\"principalId\":\"53f55637-aae2-4dbe-8932-32b7304dea07\",\"clientId\":\"35fa3415-6983-49a6-ad5f-65e2e062b6df\"},\"uhxwtctyqiklbbov\":{\"principalId\":\"d8214d94-b76e-4ce1-963d-2da0ee73b056\",\"clientId\":\"a77a78d3-4ca0-456c-b149-448714682780\"}}},\"tags\":{\"kfssxqukkf\":\"zbhvgyuguosv\",\"mg\":\"l\",\"vlopwiyighx\":\"xnkjzkdesl\"},\"location\":\"dwzbaiue\",\"etag\":\"a\",\"id\":\"m\",\"name\":\"yqupedeojnabckh\",\"type\":\"mtxpsiebtfh\"},{\"properties\":{\"provisioningState\":\"Verifying\",\"ingestionEndpointConfiguration\":{\"eventHubName\":\"skrdqmhjj\",\"consumerGroup\":\"tldwkyzxuutk\",\"fullyQualifiedEventHubNamespace\":\"ws\"},\"deviceMapping\":{\"content\":\"datavlxotogtwrupqsx\"}},\"identity\":{\"type\":\"None\",\"principalId\":\"5a47d99d-5978-4294-8c45-5dc66a91271d\",\"tenantId\":\"8c72d0ff-cf5c-4f2a-9a8f-1d289ca7cc4a\",\"userAssignedIdentities\":{\"o\":{\"principalId\":\"d8272c09-dd59-4f2e-ac53-903c0c3f4ab0\",\"clientId\":\"317d3644-aa2e-4326-905f-295cd7ff3a17\"}}},\"tags\":{\"notyfjfcnjbkcn\":\"lo\",\"kphywpnvjto\":\"dhbt\"},\"location\":\"ermclfplphoxuscr\",\"etag\":\"bgyepsbj\",\"id\":\"azqugxywpmueefj\",\"name\":\"wfqkquj\",\"type\":\"dsuyonobgla\"}]}")
            .toObject(IotConnectorCollection.class);
        Assertions.assertEquals("ibx", model.nextLink());
        Assertions.assertEquals("a", model.value().get(0).etag());
        Assertions.assertEquals("dwzbaiue", model.value().get(0).location());
        Assertions.assertEquals("zbhvgyuguosv", model.value().get(0).tags().get("kfssxqukkf"));
        Assertions.assertEquals(ServiceManagedIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("lmuzy", model.value().get(0).ingestionEndpointConfiguration().eventHubName());
        Assertions.assertEquals("aepdkzjanc", model.value().get(0).ingestionEndpointConfiguration().consumerGroup());
        Assertions.assertEquals("rhdwbavxbniw",
            model.value().get(0).ingestionEndpointConfiguration().fullyQualifiedEventHubNamespace());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotConnectorCollection model = new IotConnectorCollection().withNextLink("ibx")
            .withValue(Arrays.asList(
                new IotConnectorInner().withEtag("a")
                    .withLocation("dwzbaiue")
                    .withTags(mapOf("kfssxqukkf", "zbhvgyuguosv", "mg", "l", "vlopwiyighx", "xnkjzkdesl"))
                    .withIdentity(new ServiceManagedIdentityIdentity().withType(ServiceManagedIdentityType.NONE)
                        .withUserAssignedIdentities(mapOf("x", new UserAssignedIdentity(), "xbzpfzab",
                            new UserAssignedIdentity(), "uhxwtctyqiklbbov", new UserAssignedIdentity())))
                    .withIngestionEndpointConfiguration(
                        new IotEventHubIngestionEndpointConfiguration().withEventHubName("lmuzy")
                            .withConsumerGroup("aepdkzjanc")
                            .withFullyQualifiedEventHubNamespace("rhdwbavxbniw"))
                    .withDeviceMapping(new IotMappingProperties().withContent("datawz")),
                new IotConnectorInner().withEtag("bgyepsbj")
                    .withLocation("ermclfplphoxuscr")
                    .withTags(mapOf("notyfjfcnjbkcn", "lo", "kphywpnvjto", "dhbt"))
                    .withIdentity(new ServiceManagedIdentityIdentity().withType(ServiceManagedIdentityType.NONE)
                        .withUserAssignedIdentities(mapOf("o", new UserAssignedIdentity())))
                    .withIngestionEndpointConfiguration(
                        new IotEventHubIngestionEndpointConfiguration().withEventHubName("skrdqmhjj")
                            .withConsumerGroup("tldwkyzxuutk")
                            .withFullyQualifiedEventHubNamespace("ws"))
                    .withDeviceMapping(new IotMappingProperties().withContent("datavlxotogtwrupqsx"))));
        model = BinaryData.fromObject(model).toObject(IotConnectorCollection.class);
        Assertions.assertEquals("ibx", model.nextLink());
        Assertions.assertEquals("a", model.value().get(0).etag());
        Assertions.assertEquals("dwzbaiue", model.value().get(0).location());
        Assertions.assertEquals("zbhvgyuguosv", model.value().get(0).tags().get("kfssxqukkf"));
        Assertions.assertEquals(ServiceManagedIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("lmuzy", model.value().get(0).ingestionEndpointConfiguration().eventHubName());
        Assertions.assertEquals("aepdkzjanc", model.value().get(0).ingestionEndpointConfiguration().consumerGroup());
        Assertions.assertEquals("rhdwbavxbniw",
            model.value().get(0).ingestionEndpointConfiguration().fullyQualifiedEventHubNamespace());
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
