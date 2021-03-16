// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Gateway key regeneration request contract properties. */
@Fluent
public final class GatewayKeyRegenerationRequestContract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GatewayKeyRegenerationRequestContract.class);

    /*
     * The Key being regenerated.
     */
    @JsonProperty(value = "keyType", required = true)
    private KeyType keyType;

    /**
     * Get the keyType property: The Key being regenerated.
     *
     * @return the keyType value.
     */
    public KeyType keyType() {
        return this.keyType;
    }

    /**
     * Set the keyType property: The Key being regenerated.
     *
     * @param keyType the keyType value to set.
     * @return the GatewayKeyRegenerationRequestContract object itself.
     */
    public GatewayKeyRegenerationRequestContract withKeyType(KeyType keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyType in model GatewayKeyRegenerationRequestContract"));
        }
    }
}