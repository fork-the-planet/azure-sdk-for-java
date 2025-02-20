// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsCollectionInner;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsInner;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadata;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadataPropertyBagItem;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataTableResponseObject;
import com.azure.resourcemanager.appcontainers.models.DiagnosticRendering;
import com.azure.resourcemanager.appcontainers.models.DiagnosticSupportTopic;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsDataApiResponse;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsDefinition;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsProperties;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticsCollectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticsCollectionInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"metadata\":{\"id\":\"kifmjn\",\"name\":\"wtqabpxuckp\",\"description\":\"qoweyirdhl\",\"author\":\"ngwflqqmpizruwn\",\"category\":\"xpxiwfcngjs\",\"supportTopicList\":[{}],\"analysisTypes\":[\"xtmkzjvkviir\",\"gfgrwsdp\",\"ra\",\"zvzbglbyv\"],\"type\":\"tctbrxkjzwrgxffm\",\"score\":41.11345},\"dataset\":[{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}}],\"status\":{\"message\":\"bydpizqaclnapxb\",\"statusId\":504122160},\"dataProviderMetadata\":{\"providerName\":\"gjkn\",\"propertyBag\":[{},{}]}},\"id\":\"cttuxuu\",\"name\":\"i\",\"type\":\"flqo\"},{\"properties\":{\"metadata\":{\"id\":\"rehmr\",\"name\":\"hvsujztc\",\"description\":\"tqjtwhauu\",\"author\":\"prnjletlxsmr\",\"category\":\"do\",\"supportTopicList\":[{}],\"analysisTypes\":[\"owa\",\"iynknlq\",\"zdvpiw\",\"xqszdtmaajquh\"],\"type\":\"ylr\",\"score\":3.5013914},\"dataset\":[{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}}],\"status\":{\"message\":\"p\",\"statusId\":26175151},\"dataProviderMetadata\":{\"providerName\":\"kyjpmspbps\",\"propertyBag\":[{},{},{},{}]}},\"id\":\"pyogtieyuj\",\"name\":\"vczkcnyxrxmunjd\",\"type\":\"vg\"},{\"properties\":{\"metadata\":{\"id\":\"xl\",\"name\":\"aglqivbgkcvkh\",\"description\":\"vuqd\",\"author\":\"voniypfp\",\"category\":\"cpzgpxtiv\",\"supportTopicList\":[{},{}],\"analysisTypes\":[\"dibgqjxgpnrhgov\",\"gpikqmh\",\"ao\"],\"type\":\"rmzvupo\",\"score\":95.10622},\"dataset\":[{\"table\":{},\"renderingProperties\":{}}],\"status\":{\"message\":\"vkfvxcnqmxqpswok\",\"statusId\":1070878319},\"dataProviderMetadata\":{\"providerName\":\"ggdhbemzqkzszuw\",\"propertyBag\":[{},{}]}},\"id\":\"lxxhljfp\",\"name\":\"picrmnzhrgmqgjsx\",\"type\":\"pqcbfrmbodthsq\"},{\"properties\":{\"metadata\":{\"id\":\"iibakcl\",\"name\":\"jfrnxousxauzlwv\",\"description\":\"mwohqfzizvuxmmkj\",\"author\":\"thnwpzte\",\"category\":\"vmribiat\",\"supportTopicList\":[{},{},{},{}],\"analysisTypes\":[\"cfotangcfhnykzcu\",\"swvxwlmzqwmv\",\"xnjmxm\"],\"type\":\"qudtcvclx\",\"score\":26.504374},\"dataset\":[{\"table\":{},\"renderingProperties\":{}}],\"status\":{\"message\":\"buiyji\",\"statusId\":850664792},\"dataProviderMetadata\":{\"providerName\":\"dugneiknp\",\"propertyBag\":[{},{}]}},\"id\":\"jiuqhibtozi\",\"name\":\"qw\",\"type\":\"edmurrxxge\"}],\"nextLink\":\"ktvqylkmqpzoy\"}")
            .toObject(DiagnosticsCollectionInner.class);
        Assertions.assertEquals("xtmkzjvkviir", model.value().get(0).properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("bydpizqaclnapxb", model.value().get(0).properties().status().message());
        Assertions.assertEquals(504122160, model.value().get(0).properties().status().statusId());
        Assertions.assertEquals("gjkn", model.value().get(0).properties().dataProviderMetadata().providerName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticsCollectionInner model = new DiagnosticsCollectionInner().withValue(Arrays.asList(
            new DiagnosticsInner().withProperties(new DiagnosticsProperties()
                .withMetadata(
                    new DiagnosticsDefinition().withSupportTopicList(Arrays.asList(new DiagnosticSupportTopic()))
                        .withAnalysisTypes(Arrays.asList("xtmkzjvkviir", "gfgrwsdp", "ra", "zvzbglbyv")))
                .withDataset(Arrays.asList(
                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                        .withRenderingProperties(new DiagnosticRendering()),
                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                        .withRenderingProperties(new DiagnosticRendering()),
                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                        .withRenderingProperties(new DiagnosticRendering()),
                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                        .withRenderingProperties(new DiagnosticRendering())))
                .withStatus(new DiagnosticsStatus().withMessage("bydpizqaclnapxb").withStatusId(504122160))
                .withDataProviderMetadata(new DiagnosticDataProviderMetadata().withProviderName("gjkn")
                    .withPropertyBag(Arrays.asList(new DiagnosticDataProviderMetadataPropertyBagItem(),
                        new DiagnosticDataProviderMetadataPropertyBagItem())))),
            new DiagnosticsInner()
                .withProperties(new DiagnosticsProperties()
                    .withMetadata(
                        new DiagnosticsDefinition().withSupportTopicList(Arrays.asList(new DiagnosticSupportTopic()))
                            .withAnalysisTypes(Arrays.asList("owa", "iynknlq", "zdvpiw", "xqszdtmaajquh")))
                    .withDataset(Arrays.asList(
                        new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                            .withRenderingProperties(new DiagnosticRendering()),
                        new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                            .withRenderingProperties(new DiagnosticRendering()),
                        new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                            .withRenderingProperties(new DiagnosticRendering()),
                        new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                            .withRenderingProperties(new DiagnosticRendering())))
                    .withStatus(new DiagnosticsStatus().withMessage("p").withStatusId(26175151))
                    .withDataProviderMetadata(new DiagnosticDataProviderMetadata().withProviderName("kyjpmspbps")
                        .withPropertyBag(Arrays.asList(new DiagnosticDataProviderMetadataPropertyBagItem(),
                            new DiagnosticDataProviderMetadataPropertyBagItem(),
                            new DiagnosticDataProviderMetadataPropertyBagItem(),
                            new DiagnosticDataProviderMetadataPropertyBagItem())))),
            new DiagnosticsInner()
                .withProperties(
                    new DiagnosticsProperties()
                        .withMetadata(new DiagnosticsDefinition()
                            .withSupportTopicList(
                                Arrays.asList(new DiagnosticSupportTopic(), new DiagnosticSupportTopic()))
                            .withAnalysisTypes(Arrays.asList("dibgqjxgpnrhgov", "gpikqmh", "ao")))
                        .withDataset(Arrays
                            .asList(new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                .withRenderingProperties(new DiagnosticRendering())))
                        .withStatus(new DiagnosticsStatus().withMessage("vkfvxcnqmxqpswok").withStatusId(1070878319))
                        .withDataProviderMetadata(new DiagnosticDataProviderMetadata()
                            .withProviderName("ggdhbemzqkzszuw")
                            .withPropertyBag(Arrays.asList(new DiagnosticDataProviderMetadataPropertyBagItem(),
                                new DiagnosticDataProviderMetadataPropertyBagItem())))),
            new DiagnosticsInner().withProperties(new DiagnosticsProperties()
                .withMetadata(new DiagnosticsDefinition()
                    .withSupportTopicList(Arrays.asList(new DiagnosticSupportTopic(), new DiagnosticSupportTopic(),
                        new DiagnosticSupportTopic(), new DiagnosticSupportTopic()))
                    .withAnalysisTypes(Arrays.asList("cfotangcfhnykzcu", "swvxwlmzqwmv", "xnjmxm")))
                .withDataset(
                    Arrays.asList(new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                        .withRenderingProperties(new DiagnosticRendering())))
                .withStatus(new DiagnosticsStatus().withMessage("buiyji").withStatusId(850664792))
                .withDataProviderMetadata(new DiagnosticDataProviderMetadata().withProviderName("dugneiknp")
                    .withPropertyBag(Arrays.asList(new DiagnosticDataProviderMetadataPropertyBagItem(),
                        new DiagnosticDataProviderMetadataPropertyBagItem()))))));
        model = BinaryData.fromObject(model).toObject(DiagnosticsCollectionInner.class);
        Assertions.assertEquals("xtmkzjvkviir", model.value().get(0).properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("bydpizqaclnapxb", model.value().get(0).properties().status().message());
        Assertions.assertEquals(504122160, model.value().get(0).properties().status().statusId());
        Assertions.assertEquals("gjkn", model.value().get(0).properties().dataProviderMetadata().providerName());
    }
}
