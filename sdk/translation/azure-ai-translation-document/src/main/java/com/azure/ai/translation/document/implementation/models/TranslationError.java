// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.document.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * This contains an outer error with error code, message, details, target and an
 * inner error with more descriptive details.
 */
@Immutable
public final class TranslationError implements JsonSerializable<TranslationError> {

    /*
     * Enums containing high level error codes.
     */
    @Generated
    private final TranslationErrorCode code;

    /*
     * Gets high level error message.
     */
    @Generated
    private final String message;

    /*
     * Gets the source of the error.
     * For example it would be "documents" or
     * "document id" in case of invalid document.
     */
    @Generated
    private String target;

    /*
     * New Inner Error format which conforms to Cognitive Services API Guidelines
     * which is available at
     * https://microsoft.sharepoint.com/%3Aw%3A/t/CognitiveServicesPMO/EUoytcrjuJdKpeOKIK_QRC8BPtUYQpKBi8JsWyeDMRsWlQ?e=
     * CPq8ow.
     * This
     * contains required properties ErrorCode, message and optional properties target,
     * details(key value pair), inner error(this can be nested).
     */
    @Generated
    private InnerTranslationError innerError;

    /**
     * Creates an instance of TranslationError class.
     *
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @Generated
    private TranslationError(TranslationErrorCode code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: Enums containing high level error codes.
     *
     * @return the code value.
     */
    @Generated
    public TranslationErrorCode getCode() {
        return this.code;
    }

    /**
     * Get the message property: Gets high level error message.
     *
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: Gets the source of the error.
     * For example it would be "documents" or
     * "document id" in case of invalid document.
     *
     * @return the target value.
     */
    @Generated
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the innerError property: New Inner Error format which conforms to Cognitive Services API Guidelines
     * which is available at
     * https://microsoft.sharepoint.com/%3Aw%3A/t/CognitiveServicesPMO/EUoytcrjuJdKpeOKIK_QRC8BPtUYQpKBi8JsWyeDMRsWlQ?e=CPq8ow.
     * This
     * contains required properties ErrorCode, message and optional properties target,
     * details(key value pair), inner error(this can be nested).
     *
     * @return the innerError value.
     */
    @Generated
    public InnerTranslationError getInnerError() {
        return this.innerError;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code == null ? null : this.code.toString());
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeJsonField("innerError", this.innerError);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TranslationError from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TranslationError if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TranslationError.
     */
    @Generated
    public static TranslationError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TranslationErrorCode code = null;
            String message = null;
            String target = null;
            InnerTranslationError innerError = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("code".equals(fieldName)) {
                    code = TranslationErrorCode.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    message = reader.getString();
                } else if ("target".equals(fieldName)) {
                    target = reader.getString();
                } else if ("innerError".equals(fieldName)) {
                    innerError = InnerTranslationError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            TranslationError deserializedTranslationError = new TranslationError(code, message);
            deserializedTranslationError.target = target;
            deserializedTranslationError.innerError = innerError;
            return deserializedTranslationError;
        });
    }
}
