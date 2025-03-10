// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.RouteProperties;
import com.azure.resourcemanager.iothub.models.RoutingMessage;
import com.azure.resourcemanager.iothub.models.RoutingSource;
import com.azure.resourcemanager.iothub.models.RoutingTwin;
import com.azure.resourcemanager.iothub.models.RoutingTwinProperties;
import com.azure.resourcemanager.iothub.models.TestRouteInput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TestRouteInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TestRouteInput model = BinaryData.fromString(
            "{\"message\":{\"body\":\"xe\",\"appProperties\":{\"glkfg\":\"zbtbhj\",\"dyhtozfikdowwquu\":\"hdneuelfph\"},\"systemProperties\":{\"hqzonosggbhcoh\":\"xclvit\"}},\"route\":{\"name\":\"wdsjnkalju\",\"source\":\"DeviceConnectionStateEvents\",\"condition\":\"swacffgdkzz\",\"endpointNames\":[\"kfvhqcrailvpn\",\"pfuflrw\",\"mh\",\"lxyjr\"],\"isEnabled\":false},\"twin\":{\"tags\":\"dataafcnih\",\"properties\":{\"desired\":\"dataapnedgfbcvkc\",\"reported\":\"datavpk\"}}}")
            .toObject(TestRouteInput.class);
        Assertions.assertEquals("xe", model.message().body());
        Assertions.assertEquals("zbtbhj", model.message().appProperties().get("glkfg"));
        Assertions.assertEquals("xclvit", model.message().systemProperties().get("hqzonosggbhcoh"));
        Assertions.assertEquals("wdsjnkalju", model.route().name());
        Assertions.assertEquals(RoutingSource.DEVICE_CONNECTION_STATE_EVENTS, model.route().source());
        Assertions.assertEquals("swacffgdkzz", model.route().condition());
        Assertions.assertEquals("kfvhqcrailvpn", model.route().endpointNames().get(0));
        Assertions.assertEquals(false, model.route().isEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TestRouteInput model = new TestRouteInput()
            .withMessage(new RoutingMessage().withBody("xe")
                .withAppProperties(mapOf("glkfg", "zbtbhj", "dyhtozfikdowwquu", "hdneuelfph"))
                .withSystemProperties(mapOf("hqzonosggbhcoh", "xclvit")))
            .withRoute(new RouteProperties().withName("wdsjnkalju")
                .withSource(RoutingSource.DEVICE_CONNECTION_STATE_EVENTS)
                .withCondition("swacffgdkzz")
                .withEndpointNames(Arrays.asList("kfvhqcrailvpn", "pfuflrw", "mh", "lxyjr"))
                .withIsEnabled(false))
            .withTwin(new RoutingTwin().withTags("dataafcnih")
                .withProperties(new RoutingTwinProperties().withDesired("dataapnedgfbcvkc").withReported("datavpk")));
        model = BinaryData.fromObject(model).toObject(TestRouteInput.class);
        Assertions.assertEquals("xe", model.message().body());
        Assertions.assertEquals("zbtbhj", model.message().appProperties().get("glkfg"));
        Assertions.assertEquals("xclvit", model.message().systemProperties().get("hqzonosggbhcoh"));
        Assertions.assertEquals("wdsjnkalju", model.route().name());
        Assertions.assertEquals(RoutingSource.DEVICE_CONNECTION_STATE_EVENTS, model.route().source());
        Assertions.assertEquals("swacffgdkzz", model.route().condition());
        Assertions.assertEquals("kfvhqcrailvpn", model.route().endpointNames().get(0));
        Assertions.assertEquals(false, model.route().isEnabled());
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
