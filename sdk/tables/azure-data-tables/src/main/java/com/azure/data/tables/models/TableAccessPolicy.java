// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * An Access policy.
 */
@Fluent
public final class TableAccessPolicy implements XmlSerializable<TableAccessPolicy> {
    /*
     * The start datetime from which the policy is active.
     */
    private OffsetDateTime startsOn;

    /*
     * The datetime that the policy expires.
     */
    private OffsetDateTime expiresOn;

    /*
     * The permissions for the acl policy.
     */
    private String permissions;

    /**
     * Creates an instance of TableAccessPolicy class.
     */
    public TableAccessPolicy() {
    }

    /**
     * Get the startsOn property: The start datetime from which the policy is active.
     * 
     * @return the startsOn value.
     */
    public OffsetDateTime getStartsOn() {
        return this.startsOn;
    }

    /**
     * Set the startsOn property: The start datetime from which the policy is active.
     * 
     * @param startsOn the startsOn value to set.
     * @return the TableAccessPolicy object itself.
     */
    public TableAccessPolicy setStartsOn(OffsetDateTime startsOn) {
        this.startsOn = startsOn;
        return this;
    }

    /**
     * Get the expiresOn property: The datetime that the policy expires.
     * 
     * @return the expiresOn value.
     */
    public OffsetDateTime getExpiresOn() {
        return this.expiresOn;
    }

    /**
     * Set the expiresOn property: The datetime that the policy expires.
     * 
     * @param expiresOn the expiresOn value to set.
     * @return the TableAccessPolicy object itself.
     */
    public TableAccessPolicy setExpiresOn(OffsetDateTime expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Get the permissions property: The permissions for the acl policy.
     * 
     * @return the permissions value.
     */
    public String getPermissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The permissions for the acl policy.
     * 
     * @param permissions the permissions value to set.
     * @return the TableAccessPolicy object itself.
     */
    public TableAccessPolicy setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "AccessPolicy" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("Start",
            this.startsOn == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startsOn));
        xmlWriter.writeStringElement("Expiry",
            this.expiresOn == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expiresOn));
        xmlWriter.writeStringElement("Permission", this.permissions);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of TableAccessPolicy from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of TableAccessPolicy if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the TableAccessPolicy.
     */
    public static TableAccessPolicy fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of TableAccessPolicy from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of TableAccessPolicy if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the TableAccessPolicy.
     */
    public static TableAccessPolicy fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "AccessPolicy" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            TableAccessPolicy deserializedTableAccessPolicy = new TableAccessPolicy();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("Start".equals(elementName.getLocalPart())) {
                    deserializedTableAccessPolicy.startsOn
                        = reader.getNullableElement(dateString -> CoreUtils.parseBestOffsetDateTime(dateString));
                } else if ("Expiry".equals(elementName.getLocalPart())) {
                    deserializedTableAccessPolicy.expiresOn
                        = reader.getNullableElement(dateString -> CoreUtils.parseBestOffsetDateTime(dateString));
                } else if ("Permission".equals(elementName.getLocalPart())) {
                    deserializedTableAccessPolicy.permissions = reader.getStringElement();
                } else {
                    reader.skipElement();
                }
            }

            return deserializedTableAccessPolicy;
        });
    }
}
