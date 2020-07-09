// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.generated.storage;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.resourcemanager.generated.storage.fluent.StorageManagementClientImpl;

/** A builder for creating a new instance of the StorageManagementClientImpl type. */
@ServiceClientBuilder(
    serviceClients = {
        OperationsClient.class,
        SkusClient.class,
        StorageAccountsClient.class,
        UsagesClient.class,
        ManagementPoliciesClient.class,
        PrivateEndpointConnectionsClient.class,
        PrivateLinkResourcesClient.class,
        ObjectReplicationPoliciesOperationClient.class,
        EncryptionScopesClient.class,
        BlobServicesClient.class,
        BlobContainersClient.class,
        FileServicesClient.class,
        FileSharesClient.class,
        QueueServicesClient.class,
        QueueClient.class,
        TableServicesClient.class,
        TableClient.class
    })
public final class StorageManagementClientBuilder {
    /*
     * The ID of the target subscription.
     */
    private String subscriptionId;

    /**
     * Sets The ID of the target subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the StorageManagementClientBuilder.
     */
    public StorageManagementClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * server parameter
     */
    private String endpoint;

    /**
     * Sets server parameter.
     *
     * @param endpoint the endpoint value.
     * @return the StorageManagementClientBuilder.
     */
    public StorageManagementClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     *
     * @param environment the environment value.
     * @return the StorageManagementClientBuilder.
     */
    public StorageManagementClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the StorageManagementClientBuilder.
     */
    public StorageManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of StorageManagementClientImpl with the provided parameters.
     *
     * @return an instance of StorageManagementClientImpl.
     */
    private StorageManagementClientImpl buildInnerClient() {
        if (endpoint == null) {
            this.endpoint = "https://management.azure.com";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline =
                new HttpPipelineBuilder()
                    .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                    .build();
        }
        StorageManagementClientImpl client =
            new StorageManagementClientImpl(pipeline, environment, subscriptionId, endpoint);
        return client;
    }

    /**
     * Builds an instance of OperationsClient sync client.
     *
     * @return an instance of OperationsClient.
     */
    public OperationsClient buildOperationsClient() {
        return new OperationsClient(buildInnerClient().getOperations());
    }

    /**
     * Builds an instance of SkusClient sync client.
     *
     * @return an instance of SkusClient.
     */
    public SkusClient buildSkusClient() {
        return new SkusClient(buildInnerClient().getSkus());
    }

    /**
     * Builds an instance of StorageAccountsClient sync client.
     *
     * @return an instance of StorageAccountsClient.
     */
    public StorageAccountsClient buildStorageAccountsClient() {
        return new StorageAccountsClient(buildInnerClient().getStorageAccounts());
    }

    /**
     * Builds an instance of UsagesClient sync client.
     *
     * @return an instance of UsagesClient.
     */
    public UsagesClient buildUsagesClient() {
        return new UsagesClient(buildInnerClient().getUsages());
    }

    /**
     * Builds an instance of ManagementPoliciesClient sync client.
     *
     * @return an instance of ManagementPoliciesClient.
     */
    public ManagementPoliciesClient buildManagementPoliciesClient() {
        return new ManagementPoliciesClient(buildInnerClient().getManagementPolicies());
    }

    /**
     * Builds an instance of PrivateEndpointConnectionsClient sync client.
     *
     * @return an instance of PrivateEndpointConnectionsClient.
     */
    public PrivateEndpointConnectionsClient buildPrivateEndpointConnectionsClient() {
        return new PrivateEndpointConnectionsClient(buildInnerClient().getPrivateEndpointConnections());
    }

    /**
     * Builds an instance of PrivateLinkResourcesClient sync client.
     *
     * @return an instance of PrivateLinkResourcesClient.
     */
    public PrivateLinkResourcesClient buildPrivateLinkResourcesClient() {
        return new PrivateLinkResourcesClient(buildInnerClient().getPrivateLinkResources());
    }

    /**
     * Builds an instance of ObjectReplicationPoliciesOperationClient sync client.
     *
     * @return an instance of ObjectReplicationPoliciesOperationClient.
     */
    public ObjectReplicationPoliciesOperationClient buildObjectReplicationPoliciesOperationClient() {
        return new ObjectReplicationPoliciesOperationClient(
            buildInnerClient().getObjectReplicationPoliciesOperations());
    }

    /**
     * Builds an instance of EncryptionScopesClient sync client.
     *
     * @return an instance of EncryptionScopesClient.
     */
    public EncryptionScopesClient buildEncryptionScopesClient() {
        return new EncryptionScopesClient(buildInnerClient().getEncryptionScopes());
    }

    /**
     * Builds an instance of BlobServicesClient sync client.
     *
     * @return an instance of BlobServicesClient.
     */
    public BlobServicesClient buildBlobServicesClient() {
        return new BlobServicesClient(buildInnerClient().getBlobServices());
    }

    /**
     * Builds an instance of BlobContainersClient sync client.
     *
     * @return an instance of BlobContainersClient.
     */
    public BlobContainersClient buildBlobContainersClient() {
        return new BlobContainersClient(buildInnerClient().getBlobContainers());
    }

    /**
     * Builds an instance of FileServicesClient sync client.
     *
     * @return an instance of FileServicesClient.
     */
    public FileServicesClient buildFileServicesClient() {
        return new FileServicesClient(buildInnerClient().getFileServices());
    }

    /**
     * Builds an instance of FileSharesClient sync client.
     *
     * @return an instance of FileSharesClient.
     */
    public FileSharesClient buildFileSharesClient() {
        return new FileSharesClient(buildInnerClient().getFileShares());
    }

    /**
     * Builds an instance of QueueServicesClient sync client.
     *
     * @return an instance of QueueServicesClient.
     */
    public QueueServicesClient buildQueueServicesClient() {
        return new QueueServicesClient(buildInnerClient().getQueueServices());
    }

    /**
     * Builds an instance of QueueClient sync client.
     *
     * @return an instance of QueueClient.
     */
    public QueueClient buildQueueClient() {
        return new QueueClient(buildInnerClient().getQueues());
    }

    /**
     * Builds an instance of TableServicesClient sync client.
     *
     * @return an instance of TableServicesClient.
     */
    public TableServicesClient buildTableServicesClient() {
        return new TableServicesClient(buildInnerClient().getTableServices());
    }

    /**
     * Builds an instance of TableClient sync client.
     *
     * @return an instance of TableClient.
     */
    public TableClient buildTableClient() {
        return new TableClient(buildInnerClient().getTables());
    }
}
