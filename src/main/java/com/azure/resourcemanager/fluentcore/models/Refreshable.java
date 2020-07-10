// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.fluentcore.models;

import com.azure.core.util.Context;

/**
 * Base class for resources that can be refreshed to get the latest state.
 *
 * @param <T> the fluent type of the resource
 */
public interface Refreshable<T> {
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource
     */
    T refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource
     */
    T refresh(Context context);
}
