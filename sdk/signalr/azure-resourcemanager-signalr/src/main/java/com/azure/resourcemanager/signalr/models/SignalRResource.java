// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.fluent.models.SignalRResourceInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of SignalRResource.
 */
public interface SignalRResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: The billing information of the resource.
     * 
     * @return the sku value.
     */
    ResourceSku sku();

    /**
     * Gets the kind property: The kind of the service, it can be SignalR or RawWebSockets.
     * 
     * @return the kind value.
     */
    ServiceKind kind();

    /**
     * Gets the identity property: A class represent managed identities used for request and response.
     * 
     * @return the identity value.
     */
    ManagedIdentity identity();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the externalIp property: The publicly accessible IP of the resource.
     * 
     * @return the externalIp value.
     */
    String externalIp();

    /**
     * Gets the hostname property: FQDN of the service instance.
     * 
     * @return the hostname value.
     */
    String hostname();

    /**
     * Gets the publicPort property: The publicly accessible port of the resource which is designed for browser/client
     * side usage.
     * 
     * @return the publicPort value.
     */
    Integer publicPort();

    /**
     * Gets the serverPort property: The publicly accessible port of the resource which is designed for customer server
     * side usage.
     * 
     * @return the serverPort value.
     */
    Integer serverPort();

    /**
     * Gets the version property: Version of the resource. Probably you need the same or higher version of client SDKs.
     * 
     * @return the version value.
     */
    String version();

    /**
     * Gets the privateEndpointConnections property: Private endpoint connections to the resource.
     * 
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the sharedPrivateLinkResources property: The list of shared private link resources.
     * 
     * @return the sharedPrivateLinkResources value.
     */
    List<SharedPrivateLinkResource> sharedPrivateLinkResources();

    /**
     * Gets the tls property: TLS settings for the resource.
     * 
     * @return the tls value.
     */
    SignalRTlsSettings tls();

    /**
     * Gets the hostnamePrefix property: Deprecated.
     * 
     * @return the hostnamePrefix value.
     */
    String hostnamePrefix();

    /**
     * Gets the features property: List of the featureFlags.
     * 
     * FeatureFlags that are not included in the parameters for the update operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, its globally default value will be used
     * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
     * 
     * @return the features value.
     */
    List<SignalRFeature> features();

    /**
     * Gets the liveTraceConfiguration property: Live trace configuration of a Microsoft.SignalRService resource.
     * 
     * @return the liveTraceConfiguration value.
     */
    LiveTraceConfiguration liveTraceConfiguration();

    /**
     * Gets the resourceLogConfiguration property: Resource log configuration of a Microsoft.SignalRService resource.
     * 
     * @return the resourceLogConfiguration value.
     */
    ResourceLogConfiguration resourceLogConfiguration();

    /**
     * Gets the cors property: Cross-Origin Resource Sharing (CORS) settings.
     * 
     * @return the cors value.
     */
    SignalRCorsSettings cors();

    /**
     * Gets the serverless property: Serverless settings.
     * 
     * @return the serverless value.
     */
    ServerlessSettings serverless();

    /**
     * Gets the upstream property: The settings for the Upstream when the service is in server-less mode.
     * 
     * @return the upstream value.
     */
    ServerlessUpstreamSettings upstream();

    /**
     * Gets the networkACLs property: Network ACLs for the resource.
     * 
     * @return the networkACLs value.
     */
    SignalRNetworkACLs networkACLs();

    /**
     * Gets the publicNetworkAccess property: Enable or disable public network access. Default to "Enabled".
     * When it's Enabled, network ACLs still apply.
     * When it's Disabled, public network access is always disabled no matter what you set in network ACLs.
     * 
     * @return the publicNetworkAccess value.
     */
    String publicNetworkAccess();

    /**
     * Gets the disableLocalAuth property: DisableLocalAuth
     * Enable or disable local auth with AccessKey
     * When set as true, connection with AccessKey=xxx won't work.
     * 
     * @return the disableLocalAuth value.
     */
    Boolean disableLocalAuth();

    /**
     * Gets the disableAadAuth property: DisableLocalAuth
     * Enable or disable aad auth
     * When set as true, connection with AuthType=aad won't work.
     * 
     * @return the disableAadAuth value.
     */
    Boolean disableAadAuth();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.signalr.fluent.models.SignalRResourceInner object.
     * 
     * @return the inner object.
     */
    SignalRResourceInner innerModel();

    /**
     * The entirety of the SignalRResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The SignalRResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the SignalRResource definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the SignalRResource definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             * value from the Azure Resource Manager API or the portal.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the SignalRResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithSku, DefinitionStages.WithKind,
            DefinitionStages.WithIdentity, DefinitionStages.WithTls, DefinitionStages.WithFeatures,
            DefinitionStages.WithLiveTraceConfiguration, DefinitionStages.WithResourceLogConfiguration,
            DefinitionStages.WithCors, DefinitionStages.WithServerless, DefinitionStages.WithUpstream,
            DefinitionStages.WithNetworkACLs, DefinitionStages.WithPublicNetworkAccess,
            DefinitionStages.WithDisableLocalAuth, DefinitionStages.WithDisableAadAuth {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            SignalRResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SignalRResource create(Context context);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: The billing information of the resource..
             * 
             * @param sku The billing information of the resource.
             * @return the next definition stage.
             */
            WithCreate withSku(ResourceSku sku);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of the service, it can be SignalR or RawWebSockets.
             * 
             * @param kind The kind of the service, it can be SignalR or RawWebSockets.
             * @return the next definition stage.
             */
            WithCreate withKind(ServiceKind kind);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: A class represent managed identities used for request and response.
             * 
             * @param identity A class represent managed identities used for request and response.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedIdentity identity);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify tls.
         */
        interface WithTls {
            /**
             * Specifies the tls property: TLS settings for the resource.
             * 
             * @param tls TLS settings for the resource.
             * @return the next definition stage.
             */
            WithCreate withTls(SignalRTlsSettings tls);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify features.
         */
        interface WithFeatures {
            /**
             * Specifies the features property: List of the featureFlags.
             * 
             * FeatureFlags that are not included in the parameters for the update operation will not be modified.
             * And the response will only include featureFlags that are explicitly set.
             * When a featureFlag is not explicitly set, its globally default value will be used
             * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags..
             * 
             * @param features List of the featureFlags.
             * 
             * FeatureFlags that are not included in the parameters for the update operation will not be modified.
             * And the response will only include featureFlags that are explicitly set.
             * When a featureFlag is not explicitly set, its globally default value will be used
             * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
             * @return the next definition stage.
             */
            WithCreate withFeatures(List<SignalRFeature> features);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify liveTraceConfiguration.
         */
        interface WithLiveTraceConfiguration {
            /**
             * Specifies the liveTraceConfiguration property: Live trace configuration of a Microsoft.SignalRService
             * resource..
             * 
             * @param liveTraceConfiguration Live trace configuration of a Microsoft.SignalRService resource.
             * @return the next definition stage.
             */
            WithCreate withLiveTraceConfiguration(LiveTraceConfiguration liveTraceConfiguration);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify resourceLogConfiguration.
         */
        interface WithResourceLogConfiguration {
            /**
             * Specifies the resourceLogConfiguration property: Resource log configuration of a Microsoft.SignalRService
             * resource..
             * 
             * @param resourceLogConfiguration Resource log configuration of a Microsoft.SignalRService resource.
             * @return the next definition stage.
             */
            WithCreate withResourceLogConfiguration(ResourceLogConfiguration resourceLogConfiguration);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify cors.
         */
        interface WithCors {
            /**
             * Specifies the cors property: Cross-Origin Resource Sharing (CORS) settings..
             * 
             * @param cors Cross-Origin Resource Sharing (CORS) settings.
             * @return the next definition stage.
             */
            WithCreate withCors(SignalRCorsSettings cors);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify serverless.
         */
        interface WithServerless {
            /**
             * Specifies the serverless property: Serverless settings..
             * 
             * @param serverless Serverless settings.
             * @return the next definition stage.
             */
            WithCreate withServerless(ServerlessSettings serverless);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify upstream.
         */
        interface WithUpstream {
            /**
             * Specifies the upstream property: The settings for the Upstream when the service is in server-less mode..
             * 
             * @param upstream The settings for the Upstream when the service is in server-less mode.
             * @return the next definition stage.
             */
            WithCreate withUpstream(ServerlessUpstreamSettings upstream);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify networkACLs.
         */
        interface WithNetworkACLs {
            /**
             * Specifies the networkACLs property: Network ACLs for the resource.
             * 
             * @param networkACLs Network ACLs for the resource.
             * @return the next definition stage.
             */
            WithCreate withNetworkACLs(SignalRNetworkACLs networkACLs);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify publicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Enable or disable public network access. Default to
             * "Enabled".
             * When it's Enabled, network ACLs still apply.
             * When it's Disabled, public network access is always disabled no matter what you set in network ACLs..
             * 
             * @param publicNetworkAccess Enable or disable public network access. Default to "Enabled".
             * When it's Enabled, network ACLs still apply.
             * When it's Disabled, public network access is always disabled no matter what you set in network ACLs.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(String publicNetworkAccess);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify disableLocalAuth.
         */
        interface WithDisableLocalAuth {
            /**
             * Specifies the disableLocalAuth property: DisableLocalAuth
             * Enable or disable local auth with AccessKey
             * When set as true, connection with AccessKey=xxx won't work..
             * 
             * @param disableLocalAuth DisableLocalAuth
             * Enable or disable local auth with AccessKey
             * When set as true, connection with AccessKey=xxx won't work.
             * @return the next definition stage.
             */
            WithCreate withDisableLocalAuth(Boolean disableLocalAuth);
        }

        /**
         * The stage of the SignalRResource definition allowing to specify disableAadAuth.
         */
        interface WithDisableAadAuth {
            /**
             * Specifies the disableAadAuth property: DisableLocalAuth
             * Enable or disable aad auth
             * When set as true, connection with AuthType=aad won't work..
             * 
             * @param disableAadAuth DisableLocalAuth
             * Enable or disable aad auth
             * When set as true, connection with AuthType=aad won't work.
             * @return the next definition stage.
             */
            WithCreate withDisableAadAuth(Boolean disableAadAuth);
        }
    }

    /**
     * Begins update for the SignalRResource resource.
     * 
     * @return the stage of resource update.
     */
    SignalRResource.Update update();

    /**
     * The template for SignalRResource update.
     */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithSku, UpdateStages.WithIdentity, UpdateStages.WithTls,
        UpdateStages.WithFeatures, UpdateStages.WithLiveTraceConfiguration, UpdateStages.WithResourceLogConfiguration,
        UpdateStages.WithCors, UpdateStages.WithServerless, UpdateStages.WithUpstream, UpdateStages.WithNetworkACLs,
        UpdateStages.WithPublicNetworkAccess, UpdateStages.WithDisableLocalAuth, UpdateStages.WithDisableAadAuth {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        SignalRResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SignalRResource apply(Context context);
    }

    /**
     * The SignalRResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the SignalRResource update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the SignalRResource update allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: The billing information of the resource..
             * 
             * @param sku The billing information of the resource.
             * @return the next definition stage.
             */
            Update withSku(ResourceSku sku);
        }

        /**
         * The stage of the SignalRResource update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: A class represent managed identities used for request and response.
             * 
             * @param identity A class represent managed identities used for request and response.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedIdentity identity);
        }

        /**
         * The stage of the SignalRResource update allowing to specify tls.
         */
        interface WithTls {
            /**
             * Specifies the tls property: TLS settings for the resource.
             * 
             * @param tls TLS settings for the resource.
             * @return the next definition stage.
             */
            Update withTls(SignalRTlsSettings tls);
        }

        /**
         * The stage of the SignalRResource update allowing to specify features.
         */
        interface WithFeatures {
            /**
             * Specifies the features property: List of the featureFlags.
             * 
             * FeatureFlags that are not included in the parameters for the update operation will not be modified.
             * And the response will only include featureFlags that are explicitly set.
             * When a featureFlag is not explicitly set, its globally default value will be used
             * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags..
             * 
             * @param features List of the featureFlags.
             * 
             * FeatureFlags that are not included in the parameters for the update operation will not be modified.
             * And the response will only include featureFlags that are explicitly set.
             * When a featureFlag is not explicitly set, its globally default value will be used
             * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
             * @return the next definition stage.
             */
            Update withFeatures(List<SignalRFeature> features);
        }

        /**
         * The stage of the SignalRResource update allowing to specify liveTraceConfiguration.
         */
        interface WithLiveTraceConfiguration {
            /**
             * Specifies the liveTraceConfiguration property: Live trace configuration of a Microsoft.SignalRService
             * resource..
             * 
             * @param liveTraceConfiguration Live trace configuration of a Microsoft.SignalRService resource.
             * @return the next definition stage.
             */
            Update withLiveTraceConfiguration(LiveTraceConfiguration liveTraceConfiguration);
        }

        /**
         * The stage of the SignalRResource update allowing to specify resourceLogConfiguration.
         */
        interface WithResourceLogConfiguration {
            /**
             * Specifies the resourceLogConfiguration property: Resource log configuration of a Microsoft.SignalRService
             * resource..
             * 
             * @param resourceLogConfiguration Resource log configuration of a Microsoft.SignalRService resource.
             * @return the next definition stage.
             */
            Update withResourceLogConfiguration(ResourceLogConfiguration resourceLogConfiguration);
        }

        /**
         * The stage of the SignalRResource update allowing to specify cors.
         */
        interface WithCors {
            /**
             * Specifies the cors property: Cross-Origin Resource Sharing (CORS) settings..
             * 
             * @param cors Cross-Origin Resource Sharing (CORS) settings.
             * @return the next definition stage.
             */
            Update withCors(SignalRCorsSettings cors);
        }

        /**
         * The stage of the SignalRResource update allowing to specify serverless.
         */
        interface WithServerless {
            /**
             * Specifies the serverless property: Serverless settings..
             * 
             * @param serverless Serverless settings.
             * @return the next definition stage.
             */
            Update withServerless(ServerlessSettings serverless);
        }

        /**
         * The stage of the SignalRResource update allowing to specify upstream.
         */
        interface WithUpstream {
            /**
             * Specifies the upstream property: The settings for the Upstream when the service is in server-less mode..
             * 
             * @param upstream The settings for the Upstream when the service is in server-less mode.
             * @return the next definition stage.
             */
            Update withUpstream(ServerlessUpstreamSettings upstream);
        }

        /**
         * The stage of the SignalRResource update allowing to specify networkACLs.
         */
        interface WithNetworkACLs {
            /**
             * Specifies the networkACLs property: Network ACLs for the resource.
             * 
             * @param networkACLs Network ACLs for the resource.
             * @return the next definition stage.
             */
            Update withNetworkACLs(SignalRNetworkACLs networkACLs);
        }

        /**
         * The stage of the SignalRResource update allowing to specify publicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Enable or disable public network access. Default to
             * "Enabled".
             * When it's Enabled, network ACLs still apply.
             * When it's Disabled, public network access is always disabled no matter what you set in network ACLs..
             * 
             * @param publicNetworkAccess Enable or disable public network access. Default to "Enabled".
             * When it's Enabled, network ACLs still apply.
             * When it's Disabled, public network access is always disabled no matter what you set in network ACLs.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(String publicNetworkAccess);
        }

        /**
         * The stage of the SignalRResource update allowing to specify disableLocalAuth.
         */
        interface WithDisableLocalAuth {
            /**
             * Specifies the disableLocalAuth property: DisableLocalAuth
             * Enable or disable local auth with AccessKey
             * When set as true, connection with AccessKey=xxx won't work..
             * 
             * @param disableLocalAuth DisableLocalAuth
             * Enable or disable local auth with AccessKey
             * When set as true, connection with AccessKey=xxx won't work.
             * @return the next definition stage.
             */
            Update withDisableLocalAuth(Boolean disableLocalAuth);
        }

        /**
         * The stage of the SignalRResource update allowing to specify disableAadAuth.
         */
        interface WithDisableAadAuth {
            /**
             * Specifies the disableAadAuth property: DisableLocalAuth
             * Enable or disable aad auth
             * When set as true, connection with AuthType=aad won't work..
             * 
             * @param disableAadAuth DisableLocalAuth
             * Enable or disable aad auth
             * When set as true, connection with AuthType=aad won't work.
             * @return the next definition stage.
             */
            Update withDisableAadAuth(Boolean disableAadAuth);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    SignalRResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SignalRResource refresh(Context context);

    /**
     * Get the access keys of the resource.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys of the resource along with {@link Response}.
     */
    Response<SignalRKeys> listKeysWithResponse(Context context);

    /**
     * Get the access keys of the resource.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys of the resource.
     */
    SignalRKeys listKeys();

    /**
     * Regenerate the access key for the resource. PrimaryKey and SecondaryKey cannot be regenerated at the same time.
     * 
     * @param parameters Parameter that describes the Regenerate Key Operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represents the access keys of the resource.
     */
    SignalRKeys regenerateKey(RegenerateKeyParameters parameters);

    /**
     * Regenerate the access key for the resource. PrimaryKey and SecondaryKey cannot be regenerated at the same time.
     * 
     * @param parameters Parameter that describes the Regenerate Key Operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represents the access keys of the resource.
     */
    SignalRKeys regenerateKey(RegenerateKeyParameters parameters, Context context);

    /**
     * Operation to restart a resource.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart();

    /**
     * Operation to restart a resource.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(Context context);
}
