// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.migration.assessment.fluent.AvsAssessmentsOperationsClient;
import com.azure.resourcemanager.migration.assessment.fluent.models.AvsAssessmentInner;
import com.azure.resourcemanager.migration.assessment.fluent.models.DownloadUrlInner;
import com.azure.resourcemanager.migration.assessment.models.AvsAssessment;
import com.azure.resourcemanager.migration.assessment.models.AvsAssessmentsOperations;
import com.azure.resourcemanager.migration.assessment.models.DownloadUrl;

public final class AvsAssessmentsOperationsImpl implements AvsAssessmentsOperations {
    private static final ClientLogger LOGGER = new ClientLogger(AvsAssessmentsOperationsImpl.class);

    private final AvsAssessmentsOperationsClient innerClient;

    private final com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager;

    public AvsAssessmentsOperationsImpl(AvsAssessmentsOperationsClient innerClient,
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AvsAssessment> listByGroup(String resourceGroupName, String projectName, String groupName) {
        PagedIterable<AvsAssessmentInner> inner
            = this.serviceClient().listByGroup(resourceGroupName, projectName, groupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AvsAssessmentImpl(inner1, this.manager()));
    }

    public PagedIterable<AvsAssessment> listByGroup(String resourceGroupName, String projectName, String groupName,
        Context context) {
        PagedIterable<AvsAssessmentInner> inner
            = this.serviceClient().listByGroup(resourceGroupName, projectName, groupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AvsAssessmentImpl(inner1, this.manager()));
    }

    public Response<AvsAssessment> getWithResponse(String resourceGroupName, String projectName, String groupName,
        String assessmentName, Context context) {
        Response<AvsAssessmentInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, projectName, groupName, assessmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AvsAssessmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AvsAssessment get(String resourceGroupName, String projectName, String groupName, String assessmentName) {
        AvsAssessmentInner inner = this.serviceClient().get(resourceGroupName, projectName, groupName, assessmentName);
        if (inner != null) {
            return new AvsAssessmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String projectName, String groupName,
        String assessmentName, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, projectName, groupName, assessmentName, context);
    }

    public void delete(String resourceGroupName, String projectName, String groupName, String assessmentName) {
        this.serviceClient().delete(resourceGroupName, projectName, groupName, assessmentName);
    }

    public DownloadUrl downloadUrl(String resourceGroupName, String projectName, String groupName,
        String assessmentName, Object body) {
        DownloadUrlInner inner
            = this.serviceClient().downloadUrl(resourceGroupName, projectName, groupName, assessmentName, body);
        if (inner != null) {
            return new DownloadUrlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DownloadUrl downloadUrl(String resourceGroupName, String projectName, String groupName,
        String assessmentName, Object body, Context context) {
        DownloadUrlInner inner = this.serviceClient()
            .downloadUrl(resourceGroupName, projectName, groupName, assessmentName, body, context);
        if (inner != null) {
            return new DownloadUrlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AvsAssessment getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = ResourceManagerUtils.getValueFromIdByName(id, "assessmentProjects");
        if (projectName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'assessmentProjects'.", id)));
        }
        String groupName = ResourceManagerUtils.getValueFromIdByName(id, "groups");
        if (groupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'groups'.", id)));
        }
        String assessmentName = ResourceManagerUtils.getValueFromIdByName(id, "avsAssessments");
        if (assessmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'avsAssessments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, projectName, groupName, assessmentName, Context.NONE).getValue();
    }

    public Response<AvsAssessment> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = ResourceManagerUtils.getValueFromIdByName(id, "assessmentProjects");
        if (projectName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'assessmentProjects'.", id)));
        }
        String groupName = ResourceManagerUtils.getValueFromIdByName(id, "groups");
        if (groupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'groups'.", id)));
        }
        String assessmentName = ResourceManagerUtils.getValueFromIdByName(id, "avsAssessments");
        if (assessmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'avsAssessments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, projectName, groupName, assessmentName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = ResourceManagerUtils.getValueFromIdByName(id, "assessmentProjects");
        if (projectName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'assessmentProjects'.", id)));
        }
        String groupName = ResourceManagerUtils.getValueFromIdByName(id, "groups");
        if (groupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'groups'.", id)));
        }
        String assessmentName = ResourceManagerUtils.getValueFromIdByName(id, "avsAssessments");
        if (assessmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'avsAssessments'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, projectName, groupName, assessmentName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = ResourceManagerUtils.getValueFromIdByName(id, "assessmentProjects");
        if (projectName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'assessmentProjects'.", id)));
        }
        String groupName = ResourceManagerUtils.getValueFromIdByName(id, "groups");
        if (groupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'groups'.", id)));
        }
        String assessmentName = ResourceManagerUtils.getValueFromIdByName(id, "avsAssessments");
        if (assessmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'avsAssessments'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, projectName, groupName, assessmentName, context);
    }

    private AvsAssessmentsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager() {
        return this.serviceManager;
    }

    public AvsAssessmentImpl define(String name) {
        return new AvsAssessmentImpl(name, this.manager());
    }
}
