// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.PolicyDescriptionCollectionInner;
import java.util.List;

/** An immutable client-side representation of PolicyDescriptionCollection. */
public interface PolicyDescriptionCollection {
    /**
     * Gets the value property: Descriptions of APIM policies.
     *
     * @return the value value.
     */
    List<PolicyDescriptionContract> value();

    /**
     * Gets the count property: Total record count number.
     *
     * @return the count value.
     */
    Long count();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.PolicyDescriptionCollectionInner object.
     *
     * @return the inner object.
     */
    PolicyDescriptionCollectionInner innerModel();
}