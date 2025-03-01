// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameters used to specify the type of function to retrieve the default definition for.
 */
@Immutable
public class FunctionRetrieveDefaultDefinitionParameters
    implements JsonSerializable<FunctionRetrieveDefaultDefinitionParameters> {
    /*
     * Indicates the function binding type.
     */
    private String bindingType = "FunctionRetrieveDefaultDefinitionParameters";

    /**
     * Creates an instance of FunctionRetrieveDefaultDefinitionParameters class.
     */
    public FunctionRetrieveDefaultDefinitionParameters() {
    }

    /**
     * Get the bindingType property: Indicates the function binding type.
     * 
     * @return the bindingType value.
     */
    public String bindingType() {
        return this.bindingType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("bindingType", this.bindingType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FunctionRetrieveDefaultDefinitionParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FunctionRetrieveDefaultDefinitionParameters if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FunctionRetrieveDefaultDefinitionParameters.
     */
    public static FunctionRetrieveDefaultDefinitionParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("bindingType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Microsoft.MachineLearning/WebService".equals(discriminatorValue)) {
                    return AzureMachineLearningWebServiceFunctionRetrieveDefaultDefinitionParameters
                        .fromJson(readerToUse.reset());
                } else if ("Microsoft.StreamAnalytics/JavascriptUdf".equals(discriminatorValue)) {
                    return JavaScriptFunctionRetrieveDefaultDefinitionParameters.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static FunctionRetrieveDefaultDefinitionParameters fromJsonKnownDiscriminator(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionRetrieveDefaultDefinitionParameters deserializedFunctionRetrieveDefaultDefinitionParameters
                = new FunctionRetrieveDefaultDefinitionParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bindingType".equals(fieldName)) {
                    deserializedFunctionRetrieveDefaultDefinitionParameters.bindingType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFunctionRetrieveDefaultDefinitionParameters;
        });
    }
}
