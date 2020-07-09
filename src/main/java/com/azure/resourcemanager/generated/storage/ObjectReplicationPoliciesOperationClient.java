// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.generated.storage;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.resourcemanager.generated.storage.fluent.ObjectReplicationPoliciesOperationsImpl;
import com.azure.resourcemanager.generated.storage.fluent.inner.ObjectReplicationPolicyInner;

/** Initializes a new instance of the synchronous StorageManagementClient type. */
@ServiceClient(builder = StorageManagementClientBuilder.class)
public final class ObjectReplicationPoliciesOperationClient {
    private ObjectReplicationPoliciesOperationsImpl serviceClient;

    /** Initializes an instance of ObjectReplicationPoliciesOperations client. */
    ObjectReplicationPoliciesOperationClient(ObjectReplicationPoliciesOperationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List the object replication policies associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list storage account object replication policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ObjectReplicationPolicyInner> list(String resourceGroupName, String accountName) {
        return this.serviceClient.list(resourceGroupName, accountName);
    }

    /**
     * List the object replication policies associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list storage account object replication policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ObjectReplicationPolicyInner> list(
        String resourceGroupName, String accountName, Context context) {
        return this.serviceClient.list(resourceGroupName, accountName, context);
    }

    /**
     * Get the object replication policy of the storage account by policy ID.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object replication policy of the storage account by policy ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ObjectReplicationPolicyInner get(
        String resourceGroupName, String accountName, String objectReplicationPolicyId) {
        return this.serviceClient.get(resourceGroupName, accountName, objectReplicationPolicyId);
    }

    /**
     * Get the object replication policy of the storage account by policy ID.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object replication policy of the storage account by policy ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ObjectReplicationPolicyInner get(
        String resourceGroupName, String accountName, String objectReplicationPolicyId, Context context) {
        return this.serviceClient.get(resourceGroupName, accountName, objectReplicationPolicyId, context);
    }

    /**
     * Create or update the object replication policy of the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @param properties The replication policy between two storage accounts. Multiple rules can be defined in one
     *     policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the replication policy between two storage accounts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ObjectReplicationPolicyInner createOrUpdate(
        String resourceGroupName,
        String accountName,
        String objectReplicationPolicyId,
        ObjectReplicationPolicyInner properties) {
        return this.serviceClient.createOrUpdate(resourceGroupName, accountName, objectReplicationPolicyId, properties);
    }

    /**
     * Create or update the object replication policy of the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @param properties The replication policy between two storage accounts. Multiple rules can be defined in one
     *     policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the replication policy between two storage accounts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ObjectReplicationPolicyInner createOrUpdate(
        String resourceGroupName,
        String accountName,
        String objectReplicationPolicyId,
        ObjectReplicationPolicyInner properties,
        Context context) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, accountName, objectReplicationPolicyId, properties, context);
    }

    /**
     * Deletes the object replication policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String objectReplicationPolicyId) {
        this.serviceClient.delete(resourceGroupName, accountName, objectReplicationPolicyId);
    }

    /**
     * Deletes the object replication policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(
        String resourceGroupName, String accountName, String objectReplicationPolicyId, Context context) {
        this.serviceClient.delete(resourceGroupName, accountName, objectReplicationPolicyId, context);
    }
}
