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
import com.azure.resourcemanager.generated.storage.implementation.EncryptionScopesClientImpl;
import com.azure.resourcemanager.generated.storage.models.inner.EncryptionScopeInner;

/** Initializes a new instance of the synchronous StorageManagementClient type. */
@ServiceClient(builder = StorageManagementClientBuilder.class)
public final class EncryptionScopesClient {
    private EncryptionScopesClientImpl serviceClient;

    /** Initializes an instance of EncryptionScopes client. */
    EncryptionScopesClient(EncryptionScopesClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Synchronously creates or updates an encryption scope under the specified storage account. If an encryption scope
     * is already created and a subsequent request is issued with different properties, the encryption scope properties
     * will be updated per the specified request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionScopeInner put(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope) {
        return this.serviceClient.put(resourceGroupName, accountName, encryptionScopeName, encryptionScope);
    }

    /**
     * Synchronously creates or updates an encryption scope under the specified storage account. If an encryption scope
     * is already created and a subsequent request is issued with different properties, the encryption scope properties
     * will be updated per the specified request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionScopeInner put(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope,
        Context context) {
        return this.serviceClient.put(resourceGroupName, accountName, encryptionScopeName, encryptionScope, context);
    }

    /**
     * Update encryption scope properties as specified in the request body. Update fails if the specified encryption
     * scope does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionScopeInner patch(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope) {
        return this.serviceClient.patch(resourceGroupName, accountName, encryptionScopeName, encryptionScope);
    }

    /**
     * Update encryption scope properties as specified in the request body. Update fails if the specified encryption
     * scope does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionScopeInner patch(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope,
        Context context) {
        return this.serviceClient.patch(resourceGroupName, accountName, encryptionScopeName, encryptionScope, context);
    }

    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionScopeInner get(String resourceGroupName, String accountName, String encryptionScopeName) {
        return this.serviceClient.get(resourceGroupName, accountName, encryptionScopeName);
    }

    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionScopeInner get(
        String resourceGroupName, String accountName, String encryptionScopeName, Context context) {
        return this.serviceClient.get(resourceGroupName, accountName, encryptionScopeName, context);
    }

    /**
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EncryptionScopeInner> list(String resourceGroupName, String accountName) {
        return this.serviceClient.list(resourceGroupName, accountName);
    }

    /**
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EncryptionScopeInner> list(String resourceGroupName, String accountName, Context context) {
        return this.serviceClient.list(resourceGroupName, accountName, context);
    }
}
