// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.generated.storage.fluent.inner;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The StorageSkuListResult model. */
@Immutable
public final class StorageSkuListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageSkuListResultInner.class);

    /*
     * Get the list result of storage SKUs and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuInformationInner> value;

    /**
     * Get the value property: Get the list result of storage SKUs and their properties.
     *
     * @return the value value.
     */
    public List<SkuInformationInner> value() {
        return this.value;
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
