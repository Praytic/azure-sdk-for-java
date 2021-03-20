// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An ARM resource with its own location (not a global or an inherited location). */
@Fluent
public class LocationResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocationResource.class);

    /*
     * The Azure location where the CommunicationService is running.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the location property: The Azure location where the CommunicationService is running.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The Azure location where the CommunicationService is running.
     *
     * @param location the location value to set.
     * @return the LocationResource object itself.
     */
    public LocationResource withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}