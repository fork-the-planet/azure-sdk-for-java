// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.marketplaceordering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Terms properties for provided Publisher/Offer/Plan tuple.
 */
@Fluent
public final class AgreementTermsInner extends ProxyResource {
    /*
     * Represents the properties of the resource.
     */
    private AgreementProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of AgreementTermsInner class.
     */
    public AgreementTermsInner() {
    }

    /**
     * Get the innerProperties property: Represents the properties of the resource.
     * 
     * @return the innerProperties value.
     */
    private AgreementProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the publisher property: Publisher identifier string of image being deployed.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.innerProperties() == null ? null : this.innerProperties().publisher();
    }

    /**
     * Set the publisher property: Publisher identifier string of image being deployed.
     * 
     * @param publisher the publisher value to set.
     * @return the AgreementTermsInner object itself.
     */
    public AgreementTermsInner withPublisher(String publisher) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgreementProperties();
        }
        this.innerProperties().withPublisher(publisher);
        return this;
    }

    /**
     * Get the product property: Offer identifier string of image being deployed.
     * 
     * @return the product value.
     */
    public String product() {
        return this.innerProperties() == null ? null : this.innerProperties().product();
    }

    /**
     * Set the product property: Offer identifier string of image being deployed.
     * 
     * @param product the product value to set.
     * @return the AgreementTermsInner object itself.
     */
    public AgreementTermsInner withProduct(String product) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgreementProperties();
        }
        this.innerProperties().withProduct(product);
        return this;
    }

    /**
     * Get the plan property: Plan identifier string of image being deployed.
     * 
     * @return the plan value.
     */
    public String plan() {
        return this.innerProperties() == null ? null : this.innerProperties().plan();
    }

    /**
     * Set the plan property: Plan identifier string of image being deployed.
     * 
     * @param plan the plan value to set.
     * @return the AgreementTermsInner object itself.
     */
    public AgreementTermsInner withPlan(String plan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgreementProperties();
        }
        this.innerProperties().withPlan(plan);
        return this;
    }

    /**
     * Get the licenseTextLink property: Link to HTML with Microsoft and Publisher terms.
     * 
     * @return the licenseTextLink value.
     */
    public String licenseTextLink() {
        return this.innerProperties() == null ? null : this.innerProperties().licenseTextLink();
    }

    /**
     * Set the licenseTextLink property: Link to HTML with Microsoft and Publisher terms.
     * 
     * @param licenseTextLink the licenseTextLink value to set.
     * @return the AgreementTermsInner object itself.
     */
    public AgreementTermsInner withLicenseTextLink(String licenseTextLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgreementProperties();
        }
        this.innerProperties().withLicenseTextLink(licenseTextLink);
        return this;
    }

    /**
     * Get the privacyPolicyLink property: Link to the privacy policy of the publisher.
     * 
     * @return the privacyPolicyLink value.
     */
    public String privacyPolicyLink() {
        return this.innerProperties() == null ? null : this.innerProperties().privacyPolicyLink();
    }

    /**
     * Set the privacyPolicyLink property: Link to the privacy policy of the publisher.
     * 
     * @param privacyPolicyLink the privacyPolicyLink value to set.
     * @return the AgreementTermsInner object itself.
     */
    public AgreementTermsInner withPrivacyPolicyLink(String privacyPolicyLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgreementProperties();
        }
        this.innerProperties().withPrivacyPolicyLink(privacyPolicyLink);
        return this;
    }

    /**
     * Get the marketplaceTermsLink property: Link to HTML with Azure Marketplace terms.
     * 
     * @return the marketplaceTermsLink value.
     */
    public String marketplaceTermsLink() {
        return this.innerProperties() == null ? null : this.innerProperties().marketplaceTermsLink();
    }

    /**
     * Set the marketplaceTermsLink property: Link to HTML with Azure Marketplace terms.
     * 
     * @param marketplaceTermsLink the marketplaceTermsLink value to set.
     * @return the AgreementTermsInner object itself.
     */
    public AgreementTermsInner withMarketplaceTermsLink(String marketplaceTermsLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgreementProperties();
        }
        this.innerProperties().withMarketplaceTermsLink(marketplaceTermsLink);
        return this;
    }

    /**
     * Get the retrieveDatetime property: Date and time in UTC of when the terms were accepted. This is empty if
     * Accepted is false.
     * 
     * @return the retrieveDatetime value.
     */
    public OffsetDateTime retrieveDatetime() {
        return this.innerProperties() == null ? null : this.innerProperties().retrieveDatetime();
    }

    /**
     * Set the retrieveDatetime property: Date and time in UTC of when the terms were accepted. This is empty if
     * Accepted is false.
     * 
     * @param retrieveDatetime the retrieveDatetime value to set.
     * @return the AgreementTermsInner object itself.
     */
    public AgreementTermsInner withRetrieveDatetime(OffsetDateTime retrieveDatetime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgreementProperties();
        }
        this.innerProperties().withRetrieveDatetime(retrieveDatetime);
        return this;
    }

    /**
     * Get the signature property: Terms signature.
     * 
     * @return the signature value.
     */
    public String signature() {
        return this.innerProperties() == null ? null : this.innerProperties().signature();
    }

    /**
     * Set the signature property: Terms signature.
     * 
     * @param signature the signature value to set.
     * @return the AgreementTermsInner object itself.
     */
    public AgreementTermsInner withSignature(String signature) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgreementProperties();
        }
        this.innerProperties().withSignature(signature);
        return this;
    }

    /**
     * Get the accepted property: If any version of the terms have been accepted, otherwise false.
     * 
     * @return the accepted value.
     */
    public Boolean accepted() {
        return this.innerProperties() == null ? null : this.innerProperties().accepted();
    }

    /**
     * Set the accepted property: If any version of the terms have been accepted, otherwise false.
     * 
     * @param accepted the accepted value to set.
     * @return the AgreementTermsInner object itself.
     */
    public AgreementTermsInner withAccepted(Boolean accepted) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgreementProperties();
        }
        this.innerProperties().withAccepted(accepted);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AgreementTermsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AgreementTermsInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AgreementTermsInner.
     */
    public static AgreementTermsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AgreementTermsInner deserializedAgreementTermsInner = new AgreementTermsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAgreementTermsInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAgreementTermsInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAgreementTermsInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedAgreementTermsInner.innerProperties = AgreementProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedAgreementTermsInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAgreementTermsInner;
        });
    }
}
