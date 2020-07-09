// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.generated.storage.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The UpdateHistoryProperty model. */
@Immutable
public final class UpdateHistoryProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateHistoryProperty.class);

    /*
     * The ImmutabilityPolicy update type of a blob container, possible values
     * include: put, lock and extend.
     */
    @JsonProperty(value = "update", access = JsonProperty.Access.WRITE_ONLY)
    private ImmutabilityPolicyUpdateType update;

    /*
     * The immutability period for the blobs in the container since the policy
     * creation, in days.
     */
    @JsonProperty(value = "immutabilityPeriodSinceCreationInDays", access = JsonProperty.Access.WRITE_ONLY)
    private Integer immutabilityPeriodSinceCreationInDays;

    /*
     * Returns the date and time the ImmutabilityPolicy was updated.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /*
     * Returns the Object ID of the user who updated the ImmutabilityPolicy.
     */
    @JsonProperty(value = "objectIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String objectIdentifier;

    /*
     * Returns the Tenant ID that issued the token for the user who updated the
     * ImmutabilityPolicy.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * Returns the User Principal Name of the user who updated the
     * ImmutabilityPolicy.
     */
    @JsonProperty(value = "upn", access = JsonProperty.Access.WRITE_ONLY)
    private String upn;

    /**
     * Get the update property: The ImmutabilityPolicy update type of a blob container, possible values include: put,
     * lock and extend.
     *
     * @return the update value.
     */
    public ImmutabilityPolicyUpdateType update() {
        return this.update;
    }

    /**
     * Get the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     *
     * @return the immutabilityPeriodSinceCreationInDays value.
     */
    public Integer immutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    /**
     * Get the timestamp property: Returns the date and time the ImmutabilityPolicy was updated.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the objectIdentifier property: Returns the Object ID of the user who updated the ImmutabilityPolicy.
     *
     * @return the objectIdentifier value.
     */
    public String objectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * Get the tenantId property: Returns the Tenant ID that issued the token for the user who updated the
     * ImmutabilityPolicy.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the upn property: Returns the User Principal Name of the user who updated the ImmutabilityPolicy.
     *
     * @return the upn value.
     */
    public String upn() {
        return this.upn;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
