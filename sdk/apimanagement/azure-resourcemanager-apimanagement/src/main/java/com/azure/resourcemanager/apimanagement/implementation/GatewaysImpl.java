// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.GatewaysClient;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayKeysContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayTokenContractInner;
import com.azure.resourcemanager.apimanagement.models.GatewayContract;
import com.azure.resourcemanager.apimanagement.models.GatewayKeyRegenerationRequestContract;
import com.azure.resourcemanager.apimanagement.models.GatewayKeysContract;
import com.azure.resourcemanager.apimanagement.models.GatewayTokenContract;
import com.azure.resourcemanager.apimanagement.models.GatewayTokenRequestContract;
import com.azure.resourcemanager.apimanagement.models.Gateways;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GatewaysImpl implements Gateways {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GatewaysImpl.class);

    private final GatewaysClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public GatewaysImpl(
        GatewaysClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GatewayContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<GatewayContractInner> inner = this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new GatewayContractImpl(inner1, this.manager()));
    }

    public PagedIterable<GatewayContract> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context) {
        PagedIterable<GatewayContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new GatewayContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String gatewayId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, gatewayId);
    }

    public Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, gatewayId, context);
    }

    public GatewayContract get(String resourceGroupName, String serviceName, String gatewayId) {
        GatewayContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, gatewayId);
        if (inner != null) {
            return new GatewayContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GatewayContract> getWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, Context context) {
        Response<GatewayContractInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, gatewayId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GatewayContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String gatewayId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, gatewayId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, gatewayId, ifMatch, context);
    }

    public GatewayKeysContract listKeys(String resourceGroupName, String serviceName, String gatewayId) {
        GatewayKeysContractInner inner = this.serviceClient().listKeys(resourceGroupName, serviceName, gatewayId);
        if (inner != null) {
            return new GatewayKeysContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GatewayKeysContract> listKeysWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, Context context) {
        Response<GatewayKeysContractInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, serviceName, gatewayId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GatewayKeysContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void regenerateKey(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        GatewayKeyRegenerationRequestContract parameters) {
        this.serviceClient().regenerateKey(resourceGroupName, serviceName, gatewayId, parameters);
    }

    public Response<Void> regenerateKeyWithResponse(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        GatewayKeyRegenerationRequestContract parameters,
        Context context) {
        return this
            .serviceClient()
            .regenerateKeyWithResponse(resourceGroupName, serviceName, gatewayId, parameters, context);
    }

    public GatewayTokenContract generateToken(
        String resourceGroupName, String serviceName, String gatewayId, GatewayTokenRequestContract parameters) {
        GatewayTokenContractInner inner =
            this.serviceClient().generateToken(resourceGroupName, serviceName, gatewayId, parameters);
        if (inner != null) {
            return new GatewayTokenContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GatewayTokenContract> generateTokenWithResponse(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        GatewayTokenRequestContract parameters,
        Context context) {
        Response<GatewayTokenContractInner> inner =
            this
                .serviceClient()
                .generateTokenWithResponse(resourceGroupName, serviceName, gatewayId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GatewayTokenContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GatewayContract getById(String id) {
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
        return this.getWithResponse(resourceGroupName, serviceName, gatewayId, Context.NONE).getValue();
    }

    public Response<GatewayContract> getByIdWithResponse(String id, Context context) {
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
        return this.getWithResponse(resourceGroupName, serviceName, gatewayId, context);
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
        String localIfMatch = null;
        this.deleteWithResponse(resourceGroupName, serviceName, gatewayId, localIfMatch, Context.NONE).getValue();
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
        return this.deleteWithResponse(resourceGroupName, serviceName, gatewayId, ifMatch, context);
    }

    private GatewaysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public GatewayContractImpl define(String name) {
        return new GatewayContractImpl(name, this.manager());
    }
}