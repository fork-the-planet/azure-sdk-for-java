// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Address field value.
 */
@Immutable
public final class AddressValue implements JsonSerializable<AddressValue> {

    /*
     * House or building number.
     */
    @Generated
    private String houseNumber;

    /*
     * Post office box number.
     */
    @Generated
    private String poBox;

    /*
     * Street name.
     */
    @Generated
    private String road;

    /*
     * Name of city, town, village, etc.
     */
    @Generated
    private String city;

    /*
     * First-level administrative division.
     */
    @Generated
    private String state;

    /*
     * Postal code used for mail sorting.
     */
    @Generated
    private String postalCode;

    /*
     * Country/region.
     */
    @Generated
    private String countryRegion;

    /*
     * Street-level address, excluding city, state, countryRegion, and postalCode.
     */
    @Generated
    private String streetAddress;

    /*
     * Apartment or office number
     */
    @Generated
    private String unit;

    /*
     * Districts or boroughs within a city, such as Brooklyn in New York City or City
     * of Westminster in London.
     */
    @Generated
    private String cityDistrict;

    /*
     * Second-level administrative division used in certain locales.
     */
    @Generated
    private String stateDistrict;

    /*
     * Unofficial neighborhood name, like Chinatown.
     */
    @Generated
    private String suburb;

    /*
     * Build name, such as World Trade Center.
     */
    @Generated
    private String house;

    /*
     * Floor number, such as 3F.
     */
    @Generated
    private String level;

    /**
     * Creates an instance of AddressValue class.
     */
    @Generated
    private AddressValue() {
    }

    /**
     * Get the houseNumber property: House or building number.
     *
     * @return the houseNumber value.
     */
    @Generated
    public String getHouseNumber() {
        return this.houseNumber;
    }

    /**
     * Get the poBox property: Post office box number.
     *
     * @return the poBox value.
     */
    @Generated
    public String getPoBox() {
        return this.poBox;
    }

    /**
     * Get the road property: Street name.
     *
     * @return the road value.
     */
    @Generated
    public String getRoad() {
        return this.road;
    }

    /**
     * Get the city property: Name of city, town, village, etc.
     *
     * @return the city value.
     */
    @Generated
    public String getCity() {
        return this.city;
    }

    /**
     * Get the state property: First-level administrative division.
     *
     * @return the state value.
     */
    @Generated
    public String getState() {
        return this.state;
    }

    /**
     * Get the postalCode property: Postal code used for mail sorting.
     *
     * @return the postalCode value.
     */
    @Generated
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Get the countryRegion property: Country/region.
     *
     * @return the countryRegion value.
     */
    @Generated
    public String getCountryRegion() {
        return this.countryRegion;
    }

    /**
     * Get the streetAddress property: Street-level address, excluding city, state, countryRegion, and postalCode.
     *
     * @return the streetAddress value.
     */
    @Generated
    public String getStreetAddress() {
        return this.streetAddress;
    }

    /**
     * Get the unit property: Apartment or office number.
     *
     * @return the unit value.
     */
    @Generated
    public String getUnit() {
        return this.unit;
    }

    /**
     * Get the cityDistrict property: Districts or boroughs within a city, such as Brooklyn in New York City or City
     * of Westminster in London.
     *
     * @return the cityDistrict value.
     */
    @Generated
    public String getCityDistrict() {
        return this.cityDistrict;
    }

    /**
     * Get the stateDistrict property: Second-level administrative division used in certain locales.
     *
     * @return the stateDistrict value.
     */
    @Generated
    public String getStateDistrict() {
        return this.stateDistrict;
    }

    /**
     * Get the suburb property: Unofficial neighborhood name, like Chinatown.
     *
     * @return the suburb value.
     */
    @Generated
    public String getSuburb() {
        return this.suburb;
    }

    /**
     * Get the house property: Build name, such as World Trade Center.
     *
     * @return the house value.
     */
    @Generated
    public String getHouse() {
        return this.house;
    }

    /**
     * Get the level property: Floor number, such as 3F.
     *
     * @return the level value.
     */
    @Generated
    public String getLevel() {
        return this.level;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("houseNumber", this.houseNumber);
        jsonWriter.writeStringField("poBox", this.poBox);
        jsonWriter.writeStringField("road", this.road);
        jsonWriter.writeStringField("city", this.city);
        jsonWriter.writeStringField("state", this.state);
        jsonWriter.writeStringField("postalCode", this.postalCode);
        jsonWriter.writeStringField("countryRegion", this.countryRegion);
        jsonWriter.writeStringField("streetAddress", this.streetAddress);
        jsonWriter.writeStringField("unit", this.unit);
        jsonWriter.writeStringField("cityDistrict", this.cityDistrict);
        jsonWriter.writeStringField("stateDistrict", this.stateDistrict);
        jsonWriter.writeStringField("suburb", this.suburb);
        jsonWriter.writeStringField("house", this.house);
        jsonWriter.writeStringField("level", this.level);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AddressValue from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AddressValue if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AddressValue.
     */
    @Generated
    public static AddressValue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AddressValue deserializedAddressValue = new AddressValue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("houseNumber".equals(fieldName)) {
                    deserializedAddressValue.houseNumber = reader.getString();
                } else if ("poBox".equals(fieldName)) {
                    deserializedAddressValue.poBox = reader.getString();
                } else if ("road".equals(fieldName)) {
                    deserializedAddressValue.road = reader.getString();
                } else if ("city".equals(fieldName)) {
                    deserializedAddressValue.city = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedAddressValue.state = reader.getString();
                } else if ("postalCode".equals(fieldName)) {
                    deserializedAddressValue.postalCode = reader.getString();
                } else if ("countryRegion".equals(fieldName)) {
                    deserializedAddressValue.countryRegion = reader.getString();
                } else if ("streetAddress".equals(fieldName)) {
                    deserializedAddressValue.streetAddress = reader.getString();
                } else if ("unit".equals(fieldName)) {
                    deserializedAddressValue.unit = reader.getString();
                } else if ("cityDistrict".equals(fieldName)) {
                    deserializedAddressValue.cityDistrict = reader.getString();
                } else if ("stateDistrict".equals(fieldName)) {
                    deserializedAddressValue.stateDistrict = reader.getString();
                } else if ("suburb".equals(fieldName)) {
                    deserializedAddressValue.suburb = reader.getString();
                } else if ("house".equals(fieldName)) {
                    deserializedAddressValue.house = reader.getString();
                } else if ("level".equals(fieldName)) {
                    deserializedAddressValue.level = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAddressValue;
        });
    }
}
