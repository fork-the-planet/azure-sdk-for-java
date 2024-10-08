// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The dryrun parameters for creation or update a linker.
 */
@Fluent
public final class CreateOrUpdateDryrunParameters extends DryrunParameters {
    /*
     * The name of action for you dryrun job.
     */
    private DryrunActionName actionName = DryrunActionName.CREATE_OR_UPDATE;

    /*
     * The target service properties
     */
    private TargetServiceBase targetService;

    /*
     * The authentication type.
     */
    private AuthInfoBase authInfo;

    /*
     * The application client type
     */
    private ClientType clientType;

    /*
     * The provisioning state.
     */
    private String provisioningState;

    /*
     * The VNet solution.
     */
    private VNetSolution vNetSolution;

    /*
     * An option to store secret value in secure place
     */
    private SecretStore secretStore;

    /*
     * connection scope in source service.
     */
    private String scope;

    /*
     * The network solution.
     */
    private PublicNetworkSolution publicNetworkSolution;

    /*
     * The connection information consumed by applications, including secrets, connection strings.
     */
    private ConfigurationInfo configurationInfo;

    /**
     * Creates an instance of CreateOrUpdateDryrunParameters class.
     */
    public CreateOrUpdateDryrunParameters() {
    }

    /**
     * Get the actionName property: The name of action for you dryrun job.
     * 
     * @return the actionName value.
     */
    @Override
    public DryrunActionName actionName() {
        return this.actionName;
    }

    /**
     * Get the targetService property: The target service properties.
     * 
     * @return the targetService value.
     */
    public TargetServiceBase targetService() {
        return this.targetService;
    }

    /**
     * Set the targetService property: The target service properties.
     * 
     * @param targetService the targetService value to set.
     * @return the CreateOrUpdateDryrunParameters object itself.
     */
    public CreateOrUpdateDryrunParameters withTargetService(TargetServiceBase targetService) {
        this.targetService = targetService;
        return this;
    }

    /**
     * Get the authInfo property: The authentication type.
     * 
     * @return the authInfo value.
     */
    public AuthInfoBase authInfo() {
        return this.authInfo;
    }

    /**
     * Set the authInfo property: The authentication type.
     * 
     * @param authInfo the authInfo value to set.
     * @return the CreateOrUpdateDryrunParameters object itself.
     */
    public CreateOrUpdateDryrunParameters withAuthInfo(AuthInfoBase authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    /**
     * Get the clientType property: The application client type.
     * 
     * @return the clientType value.
     */
    public ClientType clientType() {
        return this.clientType;
    }

    /**
     * Set the clientType property: The application client type.
     * 
     * @param clientType the clientType value to set.
     * @return the CreateOrUpdateDryrunParameters object itself.
     */
    public CreateOrUpdateDryrunParameters withClientType(ClientType clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vNetSolution property: The VNet solution.
     * 
     * @return the vNetSolution value.
     */
    public VNetSolution vNetSolution() {
        return this.vNetSolution;
    }

    /**
     * Set the vNetSolution property: The VNet solution.
     * 
     * @param vNetSolution the vNetSolution value to set.
     * @return the CreateOrUpdateDryrunParameters object itself.
     */
    public CreateOrUpdateDryrunParameters withVNetSolution(VNetSolution vNetSolution) {
        this.vNetSolution = vNetSolution;
        return this;
    }

    /**
     * Get the secretStore property: An option to store secret value in secure place.
     * 
     * @return the secretStore value.
     */
    public SecretStore secretStore() {
        return this.secretStore;
    }

    /**
     * Set the secretStore property: An option to store secret value in secure place.
     * 
     * @param secretStore the secretStore value to set.
     * @return the CreateOrUpdateDryrunParameters object itself.
     */
    public CreateOrUpdateDryrunParameters withSecretStore(SecretStore secretStore) {
        this.secretStore = secretStore;
        return this;
    }

    /**
     * Get the scope property: connection scope in source service.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: connection scope in source service.
     * 
     * @param scope the scope value to set.
     * @return the CreateOrUpdateDryrunParameters object itself.
     */
    public CreateOrUpdateDryrunParameters withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the publicNetworkSolution property: The network solution.
     * 
     * @return the publicNetworkSolution value.
     */
    public PublicNetworkSolution publicNetworkSolution() {
        return this.publicNetworkSolution;
    }

    /**
     * Set the publicNetworkSolution property: The network solution.
     * 
     * @param publicNetworkSolution the publicNetworkSolution value to set.
     * @return the CreateOrUpdateDryrunParameters object itself.
     */
    public CreateOrUpdateDryrunParameters withPublicNetworkSolution(PublicNetworkSolution publicNetworkSolution) {
        this.publicNetworkSolution = publicNetworkSolution;
        return this;
    }

    /**
     * Get the configurationInfo property: The connection information consumed by applications, including secrets,
     * connection strings.
     * 
     * @return the configurationInfo value.
     */
    public ConfigurationInfo configurationInfo() {
        return this.configurationInfo;
    }

    /**
     * Set the configurationInfo property: The connection information consumed by applications, including secrets,
     * connection strings.
     * 
     * @param configurationInfo the configurationInfo value to set.
     * @return the CreateOrUpdateDryrunParameters object itself.
     */
    public CreateOrUpdateDryrunParameters withConfigurationInfo(ConfigurationInfo configurationInfo) {
        this.configurationInfo = configurationInfo;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (targetService() != null) {
            targetService().validate();
        }
        if (authInfo() != null) {
            authInfo().validate();
        }
        if (vNetSolution() != null) {
            vNetSolution().validate();
        }
        if (secretStore() != null) {
            secretStore().validate();
        }
        if (publicNetworkSolution() != null) {
            publicNetworkSolution().validate();
        }
        if (configurationInfo() != null) {
            configurationInfo().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("actionName", this.actionName == null ? null : this.actionName.toString());
        jsonWriter.writeJsonField("targetService", this.targetService);
        jsonWriter.writeJsonField("authInfo", this.authInfo);
        jsonWriter.writeStringField("clientType", this.clientType == null ? null : this.clientType.toString());
        jsonWriter.writeJsonField("vNetSolution", this.vNetSolution);
        jsonWriter.writeJsonField("secretStore", this.secretStore);
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeJsonField("publicNetworkSolution", this.publicNetworkSolution);
        jsonWriter.writeJsonField("configurationInfo", this.configurationInfo);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateOrUpdateDryrunParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateOrUpdateDryrunParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CreateOrUpdateDryrunParameters.
     */
    public static CreateOrUpdateDryrunParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateOrUpdateDryrunParameters deserializedCreateOrUpdateDryrunParameters
                = new CreateOrUpdateDryrunParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("actionName".equals(fieldName)) {
                    deserializedCreateOrUpdateDryrunParameters.actionName
                        = DryrunActionName.fromString(reader.getString());
                } else if ("targetService".equals(fieldName)) {
                    deserializedCreateOrUpdateDryrunParameters.targetService = TargetServiceBase.fromJson(reader);
                } else if ("authInfo".equals(fieldName)) {
                    deserializedCreateOrUpdateDryrunParameters.authInfo = AuthInfoBase.fromJson(reader);
                } else if ("clientType".equals(fieldName)) {
                    deserializedCreateOrUpdateDryrunParameters.clientType = ClientType.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedCreateOrUpdateDryrunParameters.provisioningState = reader.getString();
                } else if ("vNetSolution".equals(fieldName)) {
                    deserializedCreateOrUpdateDryrunParameters.vNetSolution = VNetSolution.fromJson(reader);
                } else if ("secretStore".equals(fieldName)) {
                    deserializedCreateOrUpdateDryrunParameters.secretStore = SecretStore.fromJson(reader);
                } else if ("scope".equals(fieldName)) {
                    deserializedCreateOrUpdateDryrunParameters.scope = reader.getString();
                } else if ("publicNetworkSolution".equals(fieldName)) {
                    deserializedCreateOrUpdateDryrunParameters.publicNetworkSolution
                        = PublicNetworkSolution.fromJson(reader);
                } else if ("configurationInfo".equals(fieldName)) {
                    deserializedCreateOrUpdateDryrunParameters.configurationInfo = ConfigurationInfo.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCreateOrUpdateDryrunParameters;
        });
    }
}
