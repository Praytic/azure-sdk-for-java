// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.GatewayHostnameConfigurationsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayHostnameConfigurationContractInner;
import com.azure.resourcemanager.apimanagement.models.GatewayHostnameConfigurationContract;
import com.azure.resourcemanager.apimanagement.models.GatewayHostnameConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GatewayHostnameConfigurationsImpl implements GatewayHostnameConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GatewayHostnameConfigurationsImpl.class);

    private final GatewayHostnameConfigurationsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public GatewayHostnameConfigurationsImpl(
        GatewayHostnameConfigurationsClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GatewayHostnameConfigurationContract> listByService(
        String resourceGroupName, String serviceName, String gatewayId) {
        PagedIterable<GatewayHostnameConfigurationContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, gatewayId);
        return Utils.mapPage(inner, inner1 -> new GatewayHostnameConfigurationContractImpl(inner1, this.manager()));
    }

    public PagedIterable<GatewayHostnameConfigurationContract> listByService(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<GatewayHostnameConfigurationContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, gatewayId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new GatewayHostnameConfigurationContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String gatewayId, String hcId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, gatewayId, hcId);
    }

    public Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String hcId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, gatewayId, hcId, context);
    }

    public GatewayHostnameConfigurationContract get(
        String resourceGroupName, String serviceName, String gatewayId, String hcId) {
        GatewayHostnameConfigurationContractInner inner =
            this.serviceClient().get(resourceGroupName, serviceName, gatewayId, hcId);
        if (inner != null) {
            return new GatewayHostnameConfigurationContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GatewayHostnameConfigurationContract> getWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String hcId, Context context) {
        Response<GatewayHostnameConfigurationContractInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, gatewayId, hcId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GatewayHostnameConfigurationContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String gatewayId, String hcId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, gatewayId, hcId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String hcId, String ifMatch, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, serviceName, gatewayId, hcId, ifMatch, context);
    }

    public GatewayHostnameConfigurationContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String gatewayId = Utils.getValueFromIdByName(id, "gateways");
        if (gatewayId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'gateways'.", id)));
        }
        String hcId = Utils.getValueFromIdByName(id, "hostnameConfigurations");
        if (hcId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hostnameConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, gatewayId, hcId, Context.NONE).getValue();
    }

    public Response<GatewayHostnameConfigurationContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String gatewayId = Utils.getValueFromIdByName(id, "gateways");
        if (gatewayId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'gateways'.", id)));
        }
        String hcId = Utils.getValueFromIdByName(id, "hostnameConfigurations");
        if (hcId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hostnameConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, gatewayId, hcId, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String gatewayId = Utils.getValueFromIdByName(id, "gateways");
        if (gatewayId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'gateways'.", id)));
        }
        String hcId = Utils.getValueFromIdByName(id, "hostnameConfigurations");
        if (hcId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hostnameConfigurations'.",
                                id)));
        }
        String localIfMatch = null;
        this.deleteWithResponse(resourceGroupName, serviceName, gatewayId, hcId, localIfMatch, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String gatewayId = Utils.getValueFromIdByName(id, "gateways");
        if (gatewayId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'gateways'.", id)));
        }
        String hcId = Utils.getValueFromIdByName(id, "hostnameConfigurations");
        if (hcId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hostnameConfigurations'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, gatewayId, hcId, ifMatch, context);
    }

    private GatewayHostnameConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public GatewayHostnameConfigurationContractImpl define(String name) {
        return new GatewayHostnameConfigurationContractImpl(name, this.manager());
    }
}