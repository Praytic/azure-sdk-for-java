// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ApiIssueAttachments. */
public interface ApiIssueAttachments {
    /**
     * Lists all attachments for the Issue associated with the specified API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Issue Attachment list representation.
     */
    PagedIterable<IssueAttachmentContract> listByService(
        String resourceGroupName, String serviceName, String apiId, String issueId);

    /**
     * Lists all attachments for the Issue associated with the specified API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| userId | filter | ge, le, eq, ne, gt,
     *     lt | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Issue Attachment list representation.
     */
    PagedIterable<IssueAttachmentContract> listByService(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        String filter,
        Integer top,
        Integer skip,
        Context context);

    /**
     * Gets the entity state (Etag) version of the issue Attachment for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param attachmentId Attachment identifier within an Issue. Must be unique in the current Issue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEntityTag(String resourceGroupName, String serviceName, String apiId, String issueId, String attachmentId);

    /**
     * Gets the entity state (Etag) version of the issue Attachment for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param attachmentId Attachment identifier within an Issue. Must be unique in the current Issue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the issue Attachment for an API specified by its identifier.
     */
    Response<Void> getEntityTagWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        String attachmentId,
        Context context);

    /**
     * Gets the details of the issue Attachment for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param attachmentId Attachment identifier within an Issue. Must be unique in the current Issue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the issue Attachment for an API specified by its identifier.
     */
    IssueAttachmentContract get(
        String resourceGroupName, String serviceName, String apiId, String issueId, String attachmentId);

    /**
     * Gets the details of the issue Attachment for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param attachmentId Attachment identifier within an Issue. Must be unique in the current Issue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the issue Attachment for an API specified by its identifier.
     */
    Response<IssueAttachmentContract> getWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        String attachmentId,
        Context context);

    /**
     * Deletes the specified comment from an Issue.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param attachmentId Attachment identifier within an Issue. Must be unique in the current Issue.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        String attachmentId,
        String ifMatch);

    /**
     * Deletes the specified comment from an Issue.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param attachmentId Attachment identifier within an Issue. Must be unique in the current Issue.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        String attachmentId,
        String ifMatch,
        Context context);

    /**
     * Gets the details of the issue Attachment for an API specified by its identifier.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the issue Attachment for an API specified by its identifier.
     */
    IssueAttachmentContract getById(String id);

    /**
     * Gets the details of the issue Attachment for an API specified by its identifier.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the issue Attachment for an API specified by its identifier.
     */
    Response<IssueAttachmentContract> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified comment from an Issue.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified comment from an Issue.
     *
     * @param id the resource ID.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context);

    /**
     * Begins definition for a new IssueAttachmentContract resource.
     *
     * @param name resource name.
     * @return the first stage of the new IssueAttachmentContract definition.
     */
    IssueAttachmentContract.DefinitionStages.Blank define(String name);
}