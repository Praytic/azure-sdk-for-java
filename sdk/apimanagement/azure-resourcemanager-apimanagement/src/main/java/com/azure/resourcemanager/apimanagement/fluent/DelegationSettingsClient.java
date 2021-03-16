// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalDelegationSettingsInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalSettingValidationKeyContractInner;

/** An instance of this class provides access to all the operations defined in DelegationSettingsClient. */
public interface DelegationSettingsClient {
    /**
     * Gets the entity state (Etag) version of the DelegationSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName);

    /**
     * Gets the entity state (Etag) version of the DelegationSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the DelegationSettings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> getEntityTagWithResponse(String resourceGroupName, String serviceName, Context context);

    /**
     * Get Delegation Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return delegation Settings for the Portal.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalDelegationSettingsInner get(String resourceGroupName, String serviceName);

    /**
     * Get Delegation Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return delegation Settings for the Portal.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PortalDelegationSettingsInner> getWithResponse(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Update Delegation settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update Delegation settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void update(String resourceGroupName, String serviceName, String ifMatch, PortalDelegationSettingsInner parameters);

    /**
     * Update Delegation settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update Delegation settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String ifMatch,
        PortalDelegationSettingsInner parameters,
        Context context);

    /**
     * Create or Update Delegation settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Create or update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return delegation settings for a developer portal.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalDelegationSettingsInner createOrUpdate(
        String resourceGroupName, String serviceName, PortalDelegationSettingsInner parameters);

    /**
     * Create or Update Delegation settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Create or update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return delegation settings for a developer portal.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PortalDelegationSettingsInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        PortalDelegationSettingsInner parameters,
        String ifMatch,
        Context context);

    /**
     * Gets the secret validation key of the DelegationSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the secret validation key of the DelegationSettings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PortalSettingValidationKeyContractInner listSecrets(String resourceGroupName, String serviceName);

    /**
     * Gets the secret validation key of the DelegationSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the secret validation key of the DelegationSettings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PortalSettingValidationKeyContractInner> listSecretsWithResponse(
        String resourceGroupName, String serviceName, Context context);
}