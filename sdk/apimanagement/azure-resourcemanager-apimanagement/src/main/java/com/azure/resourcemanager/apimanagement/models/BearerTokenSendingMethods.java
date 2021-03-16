// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BearerTokenSendingMethods. */
public final class BearerTokenSendingMethods extends ExpandableStringEnum<BearerTokenSendingMethods> {
    /** Static value authorizationHeader for BearerTokenSendingMethods. */
    public static final BearerTokenSendingMethods AUTHORIZATION_HEADER = fromString("authorizationHeader");

    /** Static value query for BearerTokenSendingMethods. */
    public static final BearerTokenSendingMethods QUERY = fromString("query");

    /**
     * Creates or finds a BearerTokenSendingMethods from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BearerTokenSendingMethods.
     */
    @JsonCreator
    public static BearerTokenSendingMethods fromString(String name) {
        return fromString(name, BearerTokenSendingMethods.class);
    }

    /** @return known BearerTokenSendingMethods values. */
    public static Collection<BearerTokenSendingMethods> values() {
        return values(BearerTokenSendingMethods.class);
    }
}