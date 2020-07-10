// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.fluentcore.models;

/**
 * Base interface for resources in resource groups.
 */
public interface GroupableResource extends
        Resource,
        HasResourceGroup {

    /**
     * Grouping of all the definition stages.
     */
    interface DefinitionStages {
        /**
         * A resource definition allowing a resource group to be selected.
         * <p>
         * Region of the groupable resource will be used for new resource group
         *
         * @param <T> the next stage of the definition
         */
        interface WithGroup<T> extends
                WithExistingResourceGroup<T> {
        }

        /**
         * A resource definition allowing an existing resource group to be selected.
         *
         * @param <T> the next stage of the definition
         */
        interface WithExistingResourceGroup<T> {
            /**
             * Associates the resource with an existing resource group.
             * @param groupName the name of an existing resource group to put this resource in.
             * @return the next stage of the definition
             */
            T withExistingResourceGroup(String groupName);
        }
    }
}
