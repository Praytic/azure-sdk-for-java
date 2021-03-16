// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Error Body contract. */
@Fluent
public final class ErrorResponseBody {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ErrorResponseBody.class);

    /*
     * Service-defined error code. This code serves as a sub-status for the
     * HTTP error code specified in the response.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Human-readable representation of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The list of invalid fields send in request, in case of validation error.
     */
    @JsonProperty(value = "details")
    private List<ErrorFieldContract> details;

    /**
     * Get the code property: Service-defined error code. This code serves as a sub-status for the HTTP error code
     * specified in the response.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Service-defined error code. This code serves as a sub-status for the HTTP error code
     * specified in the response.
     *
     * @param code the code value to set.
     * @return the ErrorResponseBody object itself.
     */
    public ErrorResponseBody withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Human-readable representation of the error.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Human-readable representation of the error.
     *
     * @param message the message value to set.
     * @return the ErrorResponseBody object itself.
     */
    public ErrorResponseBody withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the details property: The list of invalid fields send in request, in case of validation error.
     *
     * @return the details value.
     */
    public List<ErrorFieldContract> details() {
        return this.details;
    }

    /**
     * Set the details property: The list of invalid fields send in request, in case of validation error.
     *
     * @param details the details value to set.
     * @return the ErrorResponseBody object itself.
     */
    public ErrorResponseBody withDetails(List<ErrorFieldContract> details) {
        this.details = details;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }
}