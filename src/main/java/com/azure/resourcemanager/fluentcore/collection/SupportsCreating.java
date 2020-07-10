// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.fluentcore.collection;

/**
 * Providing access to creating Azure top level resources.
 * <p>
 * (Note: this interface is not intended to be implemented by user code)
 *
 * @param <T> the initial blank definition interface
 */
public interface SupportsCreating<T> {
    /**
     * Begins a definition for a new resource.
     *
     * @param name the name of the new resource
     * @return the first stage of the new resource definition
     */
    T define(String name);
}
