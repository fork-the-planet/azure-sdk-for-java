// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.NotificationChannelInner;
import com.azure.resourcemanager.devtestlabs.models.Event;
import com.azure.resourcemanager.devtestlabs.models.NotificationChannel;
import com.azure.resourcemanager.devtestlabs.models.NotificationChannelFragment;
import com.azure.resourcemanager.devtestlabs.models.NotifyParameters;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NotificationChannelImpl
    implements NotificationChannel, NotificationChannel.Definition, NotificationChannel.Update {
    private NotificationChannelInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String webhookUrl() {
        return this.innerModel().webhookUrl();
    }

    public String emailRecipient() {
        return this.innerModel().emailRecipient();
    }

    public String notificationLocale() {
        return this.innerModel().notificationLocale();
    }

    public String description() {
        return this.innerModel().description();
    }

    public List<Event> events() {
        List<Event> inner = this.innerModel().events();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public NotificationChannelInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labName;

    private String name;

    private NotificationChannelFragment updateNotificationChannel;

    public NotificationChannelImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    public NotificationChannel create() {
        this.innerObject = serviceManager.serviceClient()
            .getNotificationChannels()
            .createOrUpdateWithResponse(resourceGroupName, labName, name, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public NotificationChannel create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNotificationChannels()
            .createOrUpdateWithResponse(resourceGroupName, labName, name, this.innerModel(), context)
            .getValue();
        return this;
    }

    NotificationChannelImpl(String name, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = new NotificationChannelInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public NotificationChannelImpl update() {
        this.updateNotificationChannel = new NotificationChannelFragment();
        return this;
    }

    public NotificationChannel apply() {
        this.innerObject = serviceManager.serviceClient()
            .getNotificationChannels()
            .updateWithResponse(resourceGroupName, labName, name, updateNotificationChannel, Context.NONE)
            .getValue();
        return this;
    }

    public NotificationChannel apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNotificationChannels()
            .updateWithResponse(resourceGroupName, labName, name, updateNotificationChannel, context)
            .getValue();
        return this;
    }

    NotificationChannelImpl(NotificationChannelInner innerObject,
        com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "labs");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "notificationchannels");
    }

    public NotificationChannel refresh() {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getNotificationChannels()
            .getWithResponse(resourceGroupName, labName, name, localExpand, Context.NONE)
            .getValue();
        return this;
    }

    public NotificationChannel refresh(Context context) {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getNotificationChannels()
            .getWithResponse(resourceGroupName, labName, name, localExpand, context)
            .getValue();
        return this;
    }

    public Response<Void> notifyWithResponse(NotifyParameters notifyParameters, Context context) {
        return serviceManager.notificationChannels()
            .notifyWithResponse(resourceGroupName, labName, name, notifyParameters, context);
    }

    public void notify(NotifyParameters notifyParameters) {
        serviceManager.notificationChannels().notify(resourceGroupName, labName, name, notifyParameters);
    }

    public NotificationChannelImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NotificationChannelImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NotificationChannelImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateNotificationChannel.withTags(tags);
            return this;
        }
    }

    public NotificationChannelImpl withWebhookUrl(String webhookUrl) {
        this.innerModel().withWebhookUrl(webhookUrl);
        return this;
    }

    public NotificationChannelImpl withEmailRecipient(String emailRecipient) {
        this.innerModel().withEmailRecipient(emailRecipient);
        return this;
    }

    public NotificationChannelImpl withNotificationLocale(String notificationLocale) {
        this.innerModel().withNotificationLocale(notificationLocale);
        return this;
    }

    public NotificationChannelImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public NotificationChannelImpl withEvents(List<Event> events) {
        this.innerModel().withEvents(events);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
