// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.fluentcore.models;

import com.azure.core.util.Context;

/**
 * The base interface for all template interfaces that support update operations.
 *
 * @param <T> the type of the resource returned from the update.
 */
public interface Appliable<T> {
    /**
     * Execute the update request.
     *
     * @return the updated resource
     */
    T apply();

    /**
     * Execute the update request.
     *
     * @param context The context to associate with this operation.
     * @return the updated resource
     */
    T apply(Context context);
}
