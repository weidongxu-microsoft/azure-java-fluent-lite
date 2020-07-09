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
import com.azure.resourcemanager.generated.storage.fluent.FileSharesImpl;
import com.azure.resourcemanager.generated.storage.fluent.inner.FileShareInner;
import com.azure.resourcemanager.generated.storage.fluent.inner.FileShareItemInner;
import com.azure.resourcemanager.generated.storage.models.DeletedShare;
import com.azure.resourcemanager.generated.storage.models.GetShareExpand;
import com.azure.resourcemanager.generated.storage.models.ListSharesExpand;

/** Initializes a new instance of the synchronous StorageManagementClient type. */
@ServiceClient(builder = StorageManagementClientBuilder.class)
public final class FileSharesClient {
    private FileSharesImpl serviceClient;

    /** Initializes an instance of FileShares client. */
    FileSharesClient(FileSharesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of shares that can be included in the list.
     * @param filter Optional. When specified, only share names starting with the filter will be listed.
     * @param expand Optional, used to expand the properties within share's properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FileShareItemInner> list(
        String resourceGroupName, String accountName, String maxpagesize, String filter, ListSharesExpand expand) {
        return this.serviceClient.list(resourceGroupName, accountName, maxpagesize, filter, expand);
    }

    /**
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of shares that can be included in the list.
     * @param filter Optional. When specified, only share names starting with the filter will be listed.
     * @param expand Optional, used to expand the properties within share's properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FileShareItemInner> list(
        String resourceGroupName,
        String accountName,
        String maxpagesize,
        String filter,
        ListSharesExpand expand,
        Context context) {
        return this.serviceClient.list(resourceGroupName, accountName, maxpagesize, filter, expand, context);
    }

    /**
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FileShareItemInner> list(String resourceGroupName, String accountName) {
        return this.serviceClient.list(resourceGroupName, accountName);
    }

    /**
     * Creates a new share under the specified account as described by request body. The share resource includes
     * metadata and properties for that share. It does not include a list of the files contained by the share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileShareInner create(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare) {
        return this.serviceClient.create(resourceGroupName, accountName, shareName, fileShare);
    }

    /**
     * Creates a new share under the specified account as described by request body. The share resource includes
     * metadata and properties for that share. It does not include a list of the files contained by the share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileShareInner create(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare, Context context) {
        return this.serviceClient.create(resourceGroupName, accountName, shareName, fileShare, context);
    }

    /**
     * Updates share properties as specified in request body. Properties not mentioned in the request will not be
     * changed. Update fails if the specified share does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileShareInner update(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare) {
        return this.serviceClient.update(resourceGroupName, accountName, shareName, fileShare);
    }

    /**
     * Updates share properties as specified in request body. Properties not mentioned in the request will not be
     * changed. Update fails if the specified share does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileShareInner update(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare, Context context) {
        return this.serviceClient.update(resourceGroupName, accountName, shareName, fileShare, context);
    }

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param expand Optional, used to expand the properties within share's properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileShareInner get(String resourceGroupName, String accountName, String shareName, GetShareExpand expand) {
        return this.serviceClient.get(resourceGroupName, accountName, shareName, expand);
    }

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param expand Optional, used to expand the properties within share's properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileShareInner get(
        String resourceGroupName, String accountName, String shareName, GetShareExpand expand, Context context) {
        return this.serviceClient.get(resourceGroupName, accountName, shareName, expand, context);
    }

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileShareInner get(String resourceGroupName, String accountName, String shareName) {
        return this.serviceClient.get(resourceGroupName, accountName, shareName);
    }

    /**
     * Deletes specified share under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String shareName) {
        this.serviceClient.delete(resourceGroupName, accountName, shareName);
    }

    /**
     * Deletes specified share under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String shareName, Context context) {
        this.serviceClient.delete(resourceGroupName, accountName, shareName, context);
    }

    /**
     * Restore a file share within a valid retention days if share soft delete is enabled.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param deletedShare The deleted share to be restored.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void restore(String resourceGroupName, String accountName, String shareName, DeletedShare deletedShare) {
        this.serviceClient.restore(resourceGroupName, accountName, shareName, deletedShare);
    }

    /**
     * Restore a file share within a valid retention days if share soft delete is enabled.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param deletedShare The deleted share to be restored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void restore(
        String resourceGroupName, String accountName, String shareName, DeletedShare deletedShare, Context context) {
        this.serviceClient.restore(resourceGroupName, accountName, shareName, deletedShare, context);
    }
}
