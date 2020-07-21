// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.generated.storage.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.generated.storage.models.inner.ImmutabilityPolicyInner;

/** Contains all response data for the extendImmutabilityPolicy operation. */
public final class BlobContainersExtendImmutabilityPolicyResponse
    extends ResponseBase<BlobContainersExtendImmutabilityPolicyHeaders, ImmutabilityPolicyInner> {
    /**
     * Creates an instance of BlobContainersExtendImmutabilityPolicyResponse.
     *
     * @param request the request which resulted in this BlobContainersExtendImmutabilityPolicyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobContainersExtendImmutabilityPolicyResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        ImmutabilityPolicyInner value,
        BlobContainersExtendImmutabilityPolicyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public ImmutabilityPolicyInner getValue() {
        return super.getValue();
    }
}
