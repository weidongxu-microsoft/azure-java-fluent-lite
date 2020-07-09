// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.generated.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StorageAccountCheckNameAvailabilityParameters model. */
@Fluent
public final class StorageAccountCheckNameAvailabilityParameters {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(StorageAccountCheckNameAvailabilityParameters.class);

    /*
     * The storage account name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of resource, Microsoft.Storage/storageAccounts
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /** Creates an instance of StorageAccountCheckNameAvailabilityParameters class. */
    public StorageAccountCheckNameAvailabilityParameters() {
        type = "Microsoft.Storage/storageAccounts";
    }

    /**
     * Get the name property: The storage account name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The storage account name.
     *
     * @param name the name value to set.
     * @return the StorageAccountCheckNameAvailabilityParameters object itself.
     */
    public StorageAccountCheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource, Microsoft.Storage/storageAccounts.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource, Microsoft.Storage/storageAccounts.
     *
     * @param type the type value to set.
     * @return the StorageAccountCheckNameAvailabilityParameters object itself.
     */
    public StorageAccountCheckNameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model StorageAccountCheckNameAvailabilityParameters"));
        }
    }
}
