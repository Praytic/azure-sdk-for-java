// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.AuthorizationServerSecretsContractInner;

/** An immutable client-side representation of AuthorizationServerSecretsContract. */
public interface AuthorizationServerSecretsContract {
    /**
     * Gets the clientSecret property: oAuth Authorization Server Secrets.
     *
     * @return the clientSecret value.
     */
    String clientSecret();

    /**
     * Gets the resourceOwnerUsername property: Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner username.
     *
     * @return the resourceOwnerUsername value.
     */
    String resourceOwnerUsername();

    /**
     * Gets the resourceOwnerPassword property: Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner password.
     *
     * @return the resourceOwnerPassword value.
     */
    String resourceOwnerPassword();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.AuthorizationServerSecretsContractInner
     * object.
     *
     * @return the inner object.
     */
    AuthorizationServerSecretsContractInner innerModel();
}