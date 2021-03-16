// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.SubscriptionContractInner;
import com.azure.resourcemanager.apimanagement.models.SubscriptionContract;
import com.azure.resourcemanager.apimanagement.models.SubscriptionState;
import java.time.OffsetDateTime;

public final class SubscriptionContractImpl implements SubscriptionContract {
    private SubscriptionContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    SubscriptionContractImpl(
        SubscriptionContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String ownerId() {
        return this.innerModel().ownerId();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public SubscriptionState state() {
        return this.innerModel().state();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public OffsetDateTime startDate() {
        return this.innerModel().startDate();
    }

    public OffsetDateTime expirationDate() {
        return this.innerModel().expirationDate();
    }

    public OffsetDateTime endDate() {
        return this.innerModel().endDate();
    }

    public OffsetDateTime notificationDate() {
        return this.innerModel().notificationDate();
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public String stateComment() {
        return this.innerModel().stateComment();
    }

    public Boolean allowTracing() {
        return this.innerModel().allowTracing();
    }

    public SubscriptionContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}