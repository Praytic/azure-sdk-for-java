// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperatorType. */
public final class OperatorType extends ExpandableStringEnum<OperatorType> {
    /** Static value Flux for OperatorType. */
    public static final OperatorType FLUX = fromString("Flux");

    /**
     * Creates or finds a OperatorType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperatorType.
     */
    @JsonCreator
    public static OperatorType fromString(String name) {
        return fromString(name, OperatorType.class);
    }

    /** @return known OperatorType values. */
    public static Collection<OperatorType> values() {
        return values(OperatorType.class);
    }
}