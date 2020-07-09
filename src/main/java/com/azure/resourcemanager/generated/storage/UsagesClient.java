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
import com.azure.resourcemanager.generated.storage.fluent.UsagesClientImpl;
import com.azure.resourcemanager.generated.storage.fluent.inner.UsageInner;

/** Initializes a new instance of the synchronous StorageManagementClient type. */
@ServiceClient(builder = StorageManagementClientBuilder.class)
public final class UsagesClient {
    private UsagesClientImpl serviceClient;

    /** Initializes an instance of Usages client. */
    UsagesClient(UsagesClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     *
     * @param location The location of the Azure Storage resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage count and the limit for the resources of the location under the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> listByLocation(String location) {
        return this.serviceClient.listByLocation(location);
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     *
     * @param location The location of the Azure Storage resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage count and the limit for the resources of the location under the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> listByLocation(String location, Context context) {
        return this.serviceClient.listByLocation(location, context);
    }
}
