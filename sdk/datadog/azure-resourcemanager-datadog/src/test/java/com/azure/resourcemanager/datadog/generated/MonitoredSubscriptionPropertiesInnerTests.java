// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datadog.fluent.models.MonitoredSubscriptionPropertiesInner;
import com.azure.resourcemanager.datadog.models.FilteringTag;
import com.azure.resourcemanager.datadog.models.LogRules;
import com.azure.resourcemanager.datadog.models.MetricRules;
import com.azure.resourcemanager.datadog.models.MonitoredSubscription;
import com.azure.resourcemanager.datadog.models.MonitoringTagRulesProperties;
import com.azure.resourcemanager.datadog.models.Operation;
import com.azure.resourcemanager.datadog.models.Status;
import com.azure.resourcemanager.datadog.models.SubscriptionList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonitoredSubscriptionPropertiesInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonitoredSubscriptionPropertiesInner model = BinaryData.fromString(
            "{\"name\":\"ou\",\"id\":\"vudwtiukbldng\",\"type\":\"ocipazyxoeg\",\"properties\":{\"operation\":\"AddComplete\",\"monitoredSubscriptionList\":[{\"subscriptionId\":\"ucgygevqz\",\"status\":\"InProgress\",\"error\":\"mrbpizcdrqj\",\"tagRules\":{\"provisioningState\":\"Failed\",\"logRules\":{\"sendAadLogs\":false,\"sendSubscriptionLogs\":false,\"sendResourceLogs\":false,\"filteringTags\":[{},{}]},\"metricRules\":{\"filteringTags\":[{}]},\"automuting\":false}}]}}")
            .toObject(MonitoredSubscriptionPropertiesInner.class);
        Assertions.assertEquals(Operation.ADD_COMPLETE, model.properties().operation());
        Assertions.assertEquals("ucgygevqz", model.properties().monitoredSubscriptionList().get(0).subscriptionId());
        Assertions.assertEquals(Status.IN_PROGRESS, model.properties().monitoredSubscriptionList().get(0).status());
        Assertions.assertEquals("mrbpizcdrqj", model.properties().monitoredSubscriptionList().get(0).error());
        Assertions.assertEquals(false,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendAadLogs());
        Assertions.assertEquals(false,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(false,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendResourceLogs());
        Assertions.assertEquals(false, model.properties().monitoredSubscriptionList().get(0).tagRules().automuting());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonitoredSubscriptionPropertiesInner model = new MonitoredSubscriptionPropertiesInner()
            .withProperties(new SubscriptionList().withOperation(Operation.ADD_COMPLETE)
                .withMonitoredSubscriptionList(Arrays.asList(new MonitoredSubscription().withSubscriptionId("ucgygevqz")
                    .withStatus(Status.IN_PROGRESS)
                    .withError("mrbpizcdrqj")
                    .withTagRules(new MonitoringTagRulesProperties()
                        .withLogRules(new LogRules().withSendAadLogs(false)
                            .withSendSubscriptionLogs(false)
                            .withSendResourceLogs(false)
                            .withFilteringTags(Arrays.asList(new FilteringTag(), new FilteringTag())))
                        .withMetricRules(new MetricRules().withFilteringTags(Arrays.asList(new FilteringTag())))
                        .withAutomuting(false)))));
        model = BinaryData.fromObject(model).toObject(MonitoredSubscriptionPropertiesInner.class);
        Assertions.assertEquals(Operation.ADD_COMPLETE, model.properties().operation());
        Assertions.assertEquals("ucgygevqz", model.properties().monitoredSubscriptionList().get(0).subscriptionId());
        Assertions.assertEquals(Status.IN_PROGRESS, model.properties().monitoredSubscriptionList().get(0).status());
        Assertions.assertEquals("mrbpizcdrqj", model.properties().monitoredSubscriptionList().get(0).error());
        Assertions.assertEquals(false,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendAadLogs());
        Assertions.assertEquals(false,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(false,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendResourceLogs());
        Assertions.assertEquals(false, model.properties().monitoredSubscriptionList().get(0).tagRules().automuting());
    }
}
