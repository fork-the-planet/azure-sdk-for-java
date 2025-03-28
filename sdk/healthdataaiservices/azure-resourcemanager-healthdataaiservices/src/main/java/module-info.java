// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

module com.azure.resourcemanager.healthdataaiservices {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.healthdataaiservices;
    exports com.azure.resourcemanager.healthdataaiservices.fluent;
    exports com.azure.resourcemanager.healthdataaiservices.fluent.models;
    exports com.azure.resourcemanager.healthdataaiservices.models;

    opens com.azure.resourcemanager.healthdataaiservices.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.healthdataaiservices.models to com.azure.core;
    opens com.azure.resourcemanager.healthdataaiservices.implementation.models to com.azure.core;
}
