// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.tracing.opentelemetry;

import com.azure.core.util.Context;
import com.azure.core.util.LibraryTelemetryOptions;
import com.azure.core.util.tracing.Tracer;
import com.azure.core.util.tracing.TracerProvider;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.testing.exporter.InMemorySpanExporter;
import io.opentelemetry.sdk.trace.ReadableSpan;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static com.azure.core.util.tracing.Tracer.PARENT_TRACE_CONTEXT_KEY;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateTracerTests {
    private final SdkTracerProvider tracerProvider = SdkTracerProvider.builder()
        .addSpanProcessor(SimpleSpanProcessor.create(InMemorySpanExporter.create()))
        .build();

    private final OpenTelemetry openTelemetry = OpenTelemetrySdk.builder().setTracerProvider(tracerProvider).build();

    @Test
    public void createTracerNoOptions() {
        Tracer tracer = TracerProvider.getDefaultProvider().createTracer("test", null, null, null);

        assertFalse(tracer.isEnabled());
    }

    @Test
    public void createTracerEnabled() {
        OpenTelemetryTracingOptions options = new OpenTelemetryTracingOptions().setOpenTelemetry(openTelemetry);

        Tracer tracer = TracerProvider.getDefaultProvider().createTracer("test", null, null, options);

        assertTrue(tracer.isEnabled());
    }

    @Test
    public void createTracerDisabled() {
        OpenTelemetryTracingOptions options = new OpenTelemetryTracingOptions().setOpenTelemetry(openTelemetry);

        options.setEnabled(false);

        Tracer tracer = TracerProvider.getDefaultProvider().createTracer("test", null, null, options);

        assertFalse(tracer.isEnabled());
    }

    @Test
    public void createTracerNoAzNamespace() {
        OpenTelemetryTracingOptions options = new OpenTelemetryTracingOptions().setOpenTelemetry(openTelemetry);

        Tracer tracer = TracerProvider.getDefaultProvider().createTracer("test", null, null, options);

        Context span = tracer.start("test", Context.NONE);
        SpanData data = getSpanData(span);
        assertTrue(data.getAttributes().isEmpty());
    }

    @Test
    public void createTracerWithAzNamespace() {
        OpenTelemetryTracingOptions options = new OpenTelemetryTracingOptions().setOpenTelemetry(openTelemetry);

        Tracer tracer = TracerProvider.getDefaultProvider().createTracer("test", null, "namespace", options);

        Context span = tracer.start("test", Context.NONE);
        SpanData data = getSpanData(span);
        assertEquals(1, data.getAttributes().size());
        assertEquals("namespace", data.getAttributes().get(AttributeKey.stringKey("az.namespace")));
    }

    @Test
    public void createTracerWithAzNamespaceInContext() {
        OpenTelemetryTracingOptions options = new OpenTelemetryTracingOptions().setOpenTelemetry(openTelemetry);

        Tracer tracer = TracerProvider.getDefaultProvider().createTracer("test", null, "namespace", options);

        Context span = tracer.start("test", new Context("az.namespace", "another"));
        SpanData data = getSpanData(span);
        assertEquals(1, data.getAttributes().size());
        assertEquals("namespace", data.getAttributes().get(AttributeKey.stringKey("az.namespace")));
    }

    @Test
    public void defaultSchemaVersion() {
        OpenTelemetryTracingOptions options = new OpenTelemetryTracingOptions().setOpenTelemetry(openTelemetry);

        Tracer tracer = TracerProvider.getDefaultProvider().createTracer(new LibraryTelemetryOptions("test"), options);

        Context span = tracer.start("test", Context.NONE);
        tracer.end(null, null, span);

        assertEquals("https://opentelemetry.io/schemas/1.23.1",
            getSpanData(span).getInstrumentationScopeInfo().getSchemaUrl());
    }

    @Test
    public void instrumentationScopeNameOnly() {
        OpenTelemetryTracingOptions options = new OpenTelemetryTracingOptions().setOpenTelemetry(openTelemetry);

        Tracer tracer = TracerProvider.getDefaultProvider().createTracer("test", null, null, options);

        Context span = tracer.start("test", Context.NONE);
        ReadableSpan readableSpan = getReadableSpan(span);
        assertEquals("test", readableSpan.getInstrumentationScopeInfo().getName());
        assertEquals("https://opentelemetry.io/schemas/1.23.1",
            readableSpan.getInstrumentationScopeInfo().getSchemaUrl());
        assertNull(readableSpan.getInstrumentationScopeInfo().getVersion());
    }

    @Test
    public void instrumentationScopeVersion() {
        OpenTelemetryTracingOptions options = new OpenTelemetryTracingOptions().setOpenTelemetry(openTelemetry);

        Tracer tracer = TracerProvider.getDefaultProvider().createTracer("test", "1.2.3-beta.45", null, options);

        Context span = tracer.start("test", Context.NONE);
        ReadableSpan readableSpan = getReadableSpan(span);
        assertEquals("test", readableSpan.getInstrumentationScopeInfo().getName());
        assertEquals("https://opentelemetry.io/schemas/1.23.1",
            readableSpan.getInstrumentationScopeInfo().getSchemaUrl());
        assertEquals("1.2.3-beta.45", readableSpan.getInstrumentationScopeInfo().getVersion());
    }

    @Test
    public void testSdkOptions() {
        OpenTelemetryTracingOptions options = new OpenTelemetryTracingOptions().setOpenTelemetry(openTelemetry);

        LibraryTelemetryOptions libraryOptions = new LibraryTelemetryOptions("test").setLibraryVersion("1.2.3-beta.45")
            .setResourceProviderNamespace("namespace")
            .setSchemaUrl("https://aka.ms/az/sdk/schema:1.42.0");

        Tracer tracer = TracerProvider.getDefaultProvider().createTracer(libraryOptions, options);

        Context span = tracer.start("test", Context.NONE);
        ReadableSpan readableSpan = getReadableSpan(span);
        assertEquals("test", readableSpan.getInstrumentationScopeInfo().getName());
        assertEquals("https://aka.ms/az/sdk/schema:1.42.0", readableSpan.getInstrumentationScopeInfo().getSchemaUrl());
        assertEquals("1.2.3-beta.45", readableSpan.getInstrumentationScopeInfo().getVersion());
        assertEquals("namespace", readableSpan.getAttributes().get(AttributeKey.stringKey("az.namespace")));
    }

    private static SpanData getSpanData(Context context) {
        return getReadableSpan(context).toSpanData();
    }

    private static ReadableSpan getReadableSpan(Context context) {
        Optional<Object> otelCtx = context.getData(PARENT_TRACE_CONTEXT_KEY);
        assertTrue(otelCtx.isPresent());
        assertTrue(io.opentelemetry.context.Context.class.isAssignableFrom(otelCtx.get().getClass()));
        Span span = Span.fromContext((io.opentelemetry.context.Context) otelCtx.get());
        assertTrue(span.getSpanContext().isValid());
        assertTrue(ReadableSpan.class.isAssignableFrom(span.getClass()));

        return ((ReadableSpan) span);
    }
}
