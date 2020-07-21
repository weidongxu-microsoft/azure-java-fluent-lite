// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.generated.storage.models.inner;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListQueueResource model. */
@Immutable
public final class ListQueueResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListQueueResourceInner.class);

    /*
     * List of queues returned.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ListQueueInner> value;

    /*
     * Request URL that can be used to list next page of queues
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of queues returned.
     *
     * @return the value value.
     */
    public List<ListQueueInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to list next page of queues.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}