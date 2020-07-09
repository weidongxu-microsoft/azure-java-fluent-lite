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
import com.azure.resourcemanager.generated.storage.fluent.TablesClientImpl;
import com.azure.resourcemanager.generated.storage.fluent.inner.TableInner;

/** Initializes a new instance of the synchronous StorageManagementClient type. */
@ServiceClient(builder = StorageManagementClientBuilder.class)
public final class TableClient {
    private TablesClientImpl serviceClient;

    /** Initializes an instance of Tables client. */
    TableClient(TablesClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates a new table with the specified table name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param tableName A table name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of only alphanumeric characters and it cannot begin with a numeric character.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the table, including Id, resource name, resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TableInner create(String resourceGroupName, String accountName, String tableName) {
        return this.serviceClient.create(resourceGroupName, accountName, tableName);
    }

    /**
     * Creates a new table with the specified table name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param tableName A table name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of only alphanumeric characters and it cannot begin with a numeric character.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the table, including Id, resource name, resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TableInner create(String resourceGroupName, String accountName, String tableName, Context context) {
        return this.serviceClient.create(resourceGroupName, accountName, tableName, context);
    }

    /**
     * Creates a new table with the specified table name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param tableName A table name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of only alphanumeric characters and it cannot begin with a numeric character.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the table, including Id, resource name, resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TableInner update(String resourceGroupName, String accountName, String tableName) {
        return this.serviceClient.update(resourceGroupName, accountName, tableName);
    }

    /**
     * Creates a new table with the specified table name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param tableName A table name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of only alphanumeric characters and it cannot begin with a numeric character.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the table, including Id, resource name, resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TableInner update(String resourceGroupName, String accountName, String tableName, Context context) {
        return this.serviceClient.update(resourceGroupName, accountName, tableName, context);
    }

    /**
     * Gets the table with the specified table name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param tableName A table name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of only alphanumeric characters and it cannot begin with a numeric character.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the table with the specified table name, under the specified account if it exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TableInner get(String resourceGroupName, String accountName, String tableName) {
        return this.serviceClient.get(resourceGroupName, accountName, tableName);
    }

    /**
     * Gets the table with the specified table name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param tableName A table name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of only alphanumeric characters and it cannot begin with a numeric character.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the table with the specified table name, under the specified account if it exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TableInner get(String resourceGroupName, String accountName, String tableName, Context context) {
        return this.serviceClient.get(resourceGroupName, accountName, tableName, context);
    }

    /**
     * Deletes the table with the specified table name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param tableName A table name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of only alphanumeric characters and it cannot begin with a numeric character.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String tableName) {
        this.serviceClient.delete(resourceGroupName, accountName, tableName);
    }

    /**
     * Deletes the table with the specified table name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param tableName A table name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of only alphanumeric characters and it cannot begin with a numeric character.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String tableName, Context context) {
        this.serviceClient.delete(resourceGroupName, accountName, tableName, context);
    }

    /**
     * Gets a list of all the tables under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the tables under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TableInner> list(String resourceGroupName, String accountName) {
        return this.serviceClient.list(resourceGroupName, accountName);
    }

    /**
     * Gets a list of all the tables under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the tables under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TableInner> list(String resourceGroupName, String accountName, Context context) {
        return this.serviceClient.list(resourceGroupName, accountName, context);
    }
}
