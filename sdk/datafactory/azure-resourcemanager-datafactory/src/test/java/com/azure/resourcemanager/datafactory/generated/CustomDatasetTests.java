// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CustomDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CustomDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomDataset model = BinaryData.fromString(
            "{\"type\":\"CustomDataset\",\"typeProperties\":\"dataqmiwxzfvvzucqfg\",\"description\":\"jnbxwbmwdukin\",\"structure\":\"dataxhgdeke\",\"schema\":\"dataouyvew\",\"linkedServiceName\":{\"referenceName\":\"pzrdwc\",\"parameters\":{\"fhhhtestdq\":\"dataohgcand\",\"vfkdxccyijji\":\"datadnnckkpljdsh\",\"duydwnwgru\":\"datahijzrqnjxmvv\",\"dym\":\"datahqld\"}},\"parameters\":{\"jrxgunnq\":{\"type\":\"Float\",\"defaultValue\":\"dataexqwqnghxnimvy\"},\"mg\":{\"type\":\"Array\",\"defaultValue\":\"datauqtnylquevqmvy\"}},\"annotations\":[\"dataebsnz\",\"datawgsqufmjxcyoseqc\",\"datazisvbrqgcyjpgaw\",\"datapkwonrzpghlr\"],\"folder\":{\"name\":\"gblxbu\"},\"\":{\"hvfj\":\"datavjztaflvsmfj\",\"ewfeq\":\"dataqrttjfuqmmf\"}}")
            .toObject(CustomDataset.class);
        Assertions.assertEquals("jnbxwbmwdukin", model.description());
        Assertions.assertEquals("pzrdwc", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("jrxgunnq").type());
        Assertions.assertEquals("gblxbu", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomDataset model = new CustomDataset().withDescription("jnbxwbmwdukin")
            .withStructure("dataxhgdeke")
            .withSchema("dataouyvew")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("pzrdwc")
                .withParameters(mapOf("fhhhtestdq", "dataohgcand", "vfkdxccyijji", "datadnnckkpljdsh", "duydwnwgru",
                    "datahijzrqnjxmvv", "dym", "datahqld")))
            .withParameters(mapOf("jrxgunnq",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("dataexqwqnghxnimvy"), "mg",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datauqtnylquevqmvy")))
            .withAnnotations(
                Arrays.asList("dataebsnz", "datawgsqufmjxcyoseqc", "datazisvbrqgcyjpgaw", "datapkwonrzpghlr"))
            .withFolder(new DatasetFolder().withName("gblxbu"))
            .withTypeProperties("dataqmiwxzfvvzucqfg");
        model = BinaryData.fromObject(model).toObject(CustomDataset.class);
        Assertions.assertEquals("jnbxwbmwdukin", model.description());
        Assertions.assertEquals("pzrdwc", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("jrxgunnq").type());
        Assertions.assertEquals("gblxbu", model.folder().name());
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
