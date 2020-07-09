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
import com.azure.resourcemanager.fluentcore.profile.AzureProfile;

import java.util.ArrayList;
import java.util.List;

public class StorageManager {

    public static StorageManager authenticate(TokenCredential credential, AzureProfile profile) {
        return authenticate(buildHttpPipeline(credential, profile), profile);
    }

    public static StorageManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        return authenticate(httpPipeline, profile);
    }

    private static HttpPipeline buildHttpPipeline(TokenCredential credential, AzureProfile profile) {
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        policies.add(new UserAgentPolicy());
        policies.add(new RequestIdPolicy());
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(new RetryPolicy());
        policies.add(new AddDatePolicy());
        policies.add(new BearerTokenAuthenticationPolicy(credential,
                profile.environment().getManagementEndpoint() + "/.default"));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(new HttpLogOptions()));
        return new HttpPipelineBuilder()
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .build();
    }

//    public StorageAccounts storageAccounts() {
//        if (this.storageAccounts == null) {
//            this.storageAccounts = new StorageAccountsImpl(this);
//        }
//        return this.storageAccounts;
//    }
}
