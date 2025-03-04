// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.serialization.xml;

import io.clientcore.core.serialization.xml.contract.XmlWriterContractTests;
import org.junit.jupiter.api.BeforeEach;

import javax.xml.stream.XMLStreamException;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * Tests {@link XmlWriter} against the contract required by {@link XmlWriter}.
 */
public final class DefaultXmlWriterContractTests extends XmlWriterContractTests {
    private ByteArrayOutputStream outputStream;
    private XmlWriter writer;

    @BeforeEach
    public void beforeEach() throws XMLStreamException {
        this.outputStream = new ByteArrayOutputStream();
        this.writer = XmlWriter.toStream(outputStream);
    }

    @Override
    public XmlWriter getXmlWriter() {
        return writer;
    }

    @Override
    public String getXmlWriterContents() {
        try {
            return outputStream.toString(StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
