package com.azure.resourcemanager.generated.storage;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
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
        Objects.requireNonNull(subscriptionId, "'subscriptionId' cannot be null.");
        return configure().authenticate(credential, environment, subscriptionId);
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

    public static Configurable configure() {
        return new ConfigurableImpl();
    }

    public interface Configurable {
        Configurable withHttpClient(HttpClient httpClient);

        Configurable withLogOptions(HttpLogOptions logOptions);

        Configurable withPolicy(HttpPipelinePolicy policy);

        Configurable withConfiguration(Configuration configuration);

        StorageManager authenticate(TokenCredential credential, AzureEnvironment environment, String subscriptionId);
    }

    private static final class ConfigurableImpl implements Configurable {
        private HttpClient httpClient;
        private HttpLogOptions logOptions = new HttpLogOptions();
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private Configuration configuration = Configuration.getGlobalConfiguration();

        @Override
        public ConfigurableImpl withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");;
            return this;
        }

        @Override
        public Configurable withLogOptions(HttpLogOptions logOptions) {
            this.logOptions = Objects.requireNonNull(logOptions, "'logOptions' cannot be null.");;
            return this;
        }

        @Override
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        @Override
        public Configurable withConfiguration(Configuration configuration) {
            this.configuration = Objects.requireNonNull(configuration, "'configuration' cannot be null.");
            return this;
        }

        @Override
        public StorageManager authenticate(TokenCredential credential,
                                           AzureEnvironment environment, String subscriptionId) {
            if (httpClient == null) {
                httpClient = HttpClient.createDefault();
            }
            HttpPipeline httpPipeline = buildHttpPipeline(credential, environment, httpClient, logOptions,
                    policies, configuration);
            return StorageManager.authenticate(httpPipeline, environment, subscriptionId);
        }
    }

    private static HttpPipeline buildHttpPipeline(TokenCredential credential, AzureEnvironment environment,
                                                  HttpClient httpClient, HttpLogOptions logOptions,
                                                  List<HttpPipelinePolicy> additionalPolicies,
                                                  Configuration configuration) {
        Map<String, String> properties =
                CoreUtils.getProperties("azure-resourcemanager-generated-storage.properties");
        String sdkName = properties.getOrDefault("name", "UnknownName");
        String sdkVersion = properties.getOrDefault("version", "UnknownVersion");

        List<HttpPipelinePolicy> policies = new ArrayList<>();

        policies.add(new UserAgentPolicy(null, sdkName, sdkVersion, configuration));

        policies.add(new RequestIdPolicy());

        HttpPolicyProviders.addBeforeRetryPolicies(policies);

        policies.add(new RetryPolicy());

        policies.add(new AddDatePolicy());

        policies.add(new BearerTokenAuthenticationPolicy(credential,
                environment.getManagementEndpoint() + "/.default"));

        policies.addAll(additionalPolicies);

        HttpPolicyProviders.addAfterRetryPolicies(policies);

        policies.add(new HttpLoggingPolicy(logOptions));

        return new HttpPipelineBuilder()
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .httpClient(httpClient)
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
