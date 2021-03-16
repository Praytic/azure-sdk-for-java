// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PortalRevisionStatus. */
public final class PortalRevisionStatus extends ExpandableStringEnum<PortalRevisionStatus> {
    /** Static value pending for PortalRevisionStatus. */
    public static final PortalRevisionStatus PENDING = fromString("pending");

    /** Static value publishing for PortalRevisionStatus. */
    public static final PortalRevisionStatus PUBLISHING = fromString("publishing");

    /** Static value completed for PortalRevisionStatus. */
    public static final PortalRevisionStatus COMPLETED = fromString("completed");

    /** Static value failed for PortalRevisionStatus. */
    public static final PortalRevisionStatus FAILED = fromString("failed");

    /**
     * Creates or finds a PortalRevisionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PortalRevisionStatus.
     */
    @JsonCreator
    public static PortalRevisionStatus fromString(String name) {
        return fromString(name, PortalRevisionStatus.class);
    }

    /** @return known PortalRevisionStatus values. */
    public static Collection<PortalRevisionStatus> values() {
        return values(PortalRevisionStatus.class);
    }
}