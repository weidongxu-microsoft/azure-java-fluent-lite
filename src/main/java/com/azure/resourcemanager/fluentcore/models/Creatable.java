// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.fluentcore.models;

import com.azure.core.util.Context;

/**
 * The final stage of the resource definition, at which it can be created using create().
 *
 * @param <T> the fluent type of the resource to be created
 */
public interface Creatable<T> {

    /**
     * Execute the create request.
     *
     * @return the create resource
     */
    T create();

    /**
     * Execute the create request.
     *
     * @param context The context to associate with this operation.
     * @return the create resource
     */
    T create(Context context);
}
