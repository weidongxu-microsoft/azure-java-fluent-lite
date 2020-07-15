// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.fluentcore.profile;

import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.Configuration;

import java.util.Objects;

/**
 * Azure profile for client.
 */
public class AzureProfile {

    private final String subscriptionId;
    private final AzureEnvironment environment;

    /**
     * Creates AzureProfile instance with Azure environment. The global environment is {@link AzureEnvironment#AZURE}.
     * The subscription ID can be set via environment variables. The environment variables are expected
     * as below:
     * <ul>
     *     <li>{@link Configuration#PROPERTY_AZURE_SUBSCRIPTION_ID AZURE_SUBSCRIPTION_ID}</li>
     * </ul>
     *
     * @param environment the Azure environment
     */
    public AzureProfile(AzureEnvironment environment) {
        Objects.requireNonNull(environment);
        this.environment = environment;
        Configuration configuration = Configuration.getGlobalConfiguration();
        this.subscriptionId = configuration.get(Configuration.PROPERTY_AZURE_SUBSCRIPTION_ID);
    }

    /**
     * Creates AzureProfile instance with subscription ID and Azure environment.
     * The global environment is {@link AzureEnvironment#AZURE}.
     *
     * @param subscriptionId the subscription ID required for resource management
     * @param environment the Azure environment
     */
    public AzureProfile(String subscriptionId, AzureEnvironment environment) {
        Objects.requireNonNull(subscriptionId);
        Objects.requireNonNull(environment);
        this.subscriptionId = subscriptionId;
        this.environment = environment;
    }

    /**
     * Gets subscription ID.
     *
     * @return the subscription ID
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Gets Azure environment.
     *
     * @return the Azure environment
     */
    public AzureEnvironment environment() {
        return environment;
    }
}
