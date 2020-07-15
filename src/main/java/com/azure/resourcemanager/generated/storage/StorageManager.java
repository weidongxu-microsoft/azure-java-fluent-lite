package com.azure.resourcemanager.generated.storage;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.resourcemanager.generated.storage.implementation.StorageAccountsImpl;
import com.azure.resourcemanager.generated.storage.models.StorageAccounts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class StorageManager {

    private final StorageManagementClientBuilder clientBuilder;

    public static StorageManager authenticate(TokenCredential credential,
                                              AzureEnvironment environment, String subscriptionId) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(environment, "'environment' cannot be null.");
        return authenticate(buildHttpPipeline(credential, environment), environment, subscriptionId);
    }

    public static StorageManager authenticate(HttpPipeline httpPipeline,
                                              AzureEnvironment environment, String subscriptionId) {
        return new StorageManager(httpPipeline, environment, subscriptionId);
    }

    private StorageManager(HttpPipeline httpPipeline,
                           AzureEnvironment environment, String subscriptionId) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(environment, "'environment' cannot be null.");
        Objects.requireNonNull(subscriptionId, "'subscriptionId' cannot be null.");
        this.clientBuilder = new StorageManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(environment.getResourceManagerEndpoint())
                .subscriptionId(subscriptionId);
    }

    private static HttpPipeline buildHttpPipeline(TokenCredential credential, AzureEnvironment environment) {
        Map<String, String> properties =
                CoreUtils.getProperties("azure-resourcemanager-generated-storage.properties");

        List<HttpPipelinePolicy> policies = new ArrayList<>();
        policies.add(new UserAgentPolicy(
                null,
                properties.getOrDefault("name", "UnknownName"),
                properties.getOrDefault("version", "UnknownVersion"),
                Configuration.getGlobalConfiguration()));
        policies.add(new RequestIdPolicy());
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(new RetryPolicy());
        policies.add(new AddDatePolicy());
        policies.add(new BearerTokenAuthenticationPolicy(credential,
                environment.getManagementEndpoint() + "/.default"));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(new HttpLogOptions()));
        return new HttpPipelineBuilder()
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .build();
    }

    private StorageAccounts storageAccounts;

    public StorageAccounts storageAccounts() {
        if (this.storageAccounts == null) {
            this.storageAccounts = new StorageAccountsImpl(clientBuilder.buildStorageAccountsClient());
        }
        return this.storageAccounts;
    }
}
