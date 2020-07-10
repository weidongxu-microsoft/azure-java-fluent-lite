// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.fluentcore.models;

/**
 * The final stage of the resource definition, at which it can be created using create().
 *
 * @param <T> the fluent type of the resource to be created
 */
public interface Creatable<T> extends
        HasName {

    /**
     * Execute the create request.
     *
     * @return the create resource
     */
    T create();
}
