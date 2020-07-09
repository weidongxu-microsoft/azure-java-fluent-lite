// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.generated.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The StorageAccountUpdateParameters model. */
@JsonFlatten
@Fluent
public class StorageAccountUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccountUpdateParameters.class);

    /*
     * Gets or sets the SKU name. Note that the SKU name cannot be updated to
     * Standard_ZRS, Premium_LRS or Premium_ZRS, nor can accounts of those SKU
     * names be updated to any other value.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Gets or sets a list of key value pairs that describe the resource. These
     * tags can be used in viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key no greater in length than 128 characters and a value no
     * greater in length than 256 characters.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * Optional. Indicates the type of storage account. Currently only
     * StorageV2 value supported by server.
     */
    @JsonProperty(value = "kind")
    private Kind kind;

    /*
     * Custom domain assigned to the storage account by the user. Name is the
     * CNAME source. Only one custom domain is supported per storage account at
     * this time. To clear the existing custom domain, use an empty string for
     * the custom domain name property.
     */
    @JsonProperty(value = "properties.customDomain")
    private CustomDomain customDomain;

    /*
     * Provides the encryption settings on the account. The default setting is
     * unencrypted.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /*
     * Required for storage accounts where kind = BlobStorage. The access tier
     * used for billing.
     */
    @JsonProperty(value = "properties.accessTier")
    private AccessTier accessTier;

    /*
     * Provides the identity based authentication settings for Azure Files.
     */
    @JsonProperty(value = "properties.azureFilesIdentityBasedAuthentication")
    private AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication;

    /*
     * Allows https traffic only to storage service if sets to true.
     */
    @JsonProperty(value = "properties.supportsHttpsTrafficOnly")
    private Boolean enableHttpsTrafficOnly;

    /*
     * Network rule set
     */
    @JsonProperty(value = "properties.networkAcls")
    private NetworkRuleSet networkRuleSet;

    /*
     * Allow large file shares if sets to Enabled. It cannot be disabled once
     * it is enabled.
     */
    @JsonProperty(value = "properties.largeFileSharesState")
    private LargeFileSharesState largeFileSharesState;

    /*
     * Maintains information about the network routing choice opted by the user
     * for data transfer
     */
    @JsonProperty(value = "properties.routingPreference")
    private RoutingPreference routingPreference;

    /*
     * Allow or disallow public access to all blobs or containers in the
     * storage account. The default interpretation is true for this property.
     */
    @JsonProperty(value = "properties.allowBlobPublicAccess")
    private Boolean allowBlobPublicAccess;

    /*
     * Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     */
    @JsonProperty(value = "properties.minimumTlsVersion")
    private MinimumTlsVersion minimumTlsVersion;

    /**
     * Get the sku property: Gets or sets the SKU name. Note that the SKU name cannot be updated to Standard_ZRS,
     * Premium_LRS or Premium_ZRS, nor can accounts of those SKU names be updated to any other value.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Gets or sets the SKU name. Note that the SKU name cannot be updated to Standard_ZRS,
     * Premium_LRS or Premium_ZRS, nor can accounts of those SKU names be updated to any other value.
     *
     * @param sku the sku value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key no greater in length than 128 characters and a value no greater in length than
     * 256 characters.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key no greater in length than 128 characters and a value no greater in length than
     * 256 characters.
     *
     * @param tags the tags value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the kind property: Optional. Indicates the type of storage account. Currently only StorageV2 value supported
     * by server.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Optional. Indicates the type of storage account. Currently only StorageV2 value supported
     * by server.
     *
     * @param kind the kind value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the customDomain property: Custom domain assigned to the storage account by the user. Name is the CNAME
     * source. Only one custom domain is supported per storage account at this time. To clear the existing custom
     * domain, use an empty string for the custom domain name property.
     *
     * @return the customDomain value.
     */
    public CustomDomain customDomain() {
        return this.customDomain;
    }

    /**
     * Set the customDomain property: Custom domain assigned to the storage account by the user. Name is the CNAME
     * source. Only one custom domain is supported per storage account at this time. To clear the existing custom
     * domain, use an empty string for the custom domain name property.
     *
     * @param customDomain the customDomain value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withCustomDomain(CustomDomain customDomain) {
        this.customDomain = customDomain;
        return this;
    }

    /**
     * Get the encryption property: Provides the encryption settings on the account. The default setting is unencrypted.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Provides the encryption settings on the account. The default setting is unencrypted.
     *
     * @param encryption the encryption value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @return the accessTier value.
     */
    public AccessTier accessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @param accessTier the accessTier value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withAccessTier(AccessTier accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    /**
     * Get the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @return the azureFilesIdentityBasedAuthentication value.
     */
    public AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication() {
        return this.azureFilesIdentityBasedAuthentication;
    }

    /**
     * Set the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @param azureFilesIdentityBasedAuthentication the azureFilesIdentityBasedAuthentication value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withAzureFilesIdentityBasedAuthentication(
        AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true.
     *
     * @return the enableHttpsTrafficOnly value.
     */
    public Boolean enableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }

    /**
     * Set the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
        return this;
    }

    /**
     * Get the networkRuleSet property: Network rule set.
     *
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the networkRuleSet property: Network rule set.
     *
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

    /**
     * Get the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @return the largeFileSharesState value.
     */
    public LargeFileSharesState largeFileSharesState() {
        return this.largeFileSharesState;
    }

    /**
     * Set the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @param largeFileSharesState the largeFileSharesState value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        this.largeFileSharesState = largeFileSharesState;
        return this;
    }

    /**
     * Get the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @return the routingPreference value.
     */
    public RoutingPreference routingPreference() {
        return this.routingPreference;
    }

    /**
     * Set the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @param routingPreference the routingPreference value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withRoutingPreference(RoutingPreference routingPreference) {
        this.routingPreference = routingPreference;
        return this;
    }

    /**
     * Get the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @return the allowBlobPublicAccess value.
     */
    public Boolean allowBlobPublicAccess() {
        return this.allowBlobPublicAccess;
    }

    /**
     * Set the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @param allowBlobPublicAccess the allowBlobPublicAccess value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withAllowBlobPublicAccess(Boolean allowBlobPublicAccess) {
        this.allowBlobPublicAccess = allowBlobPublicAccess;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @return the minimumTlsVersion value.
     */
    public MinimumTlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (customDomain() != null) {
            customDomain().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (azureFilesIdentityBasedAuthentication() != null) {
            azureFilesIdentityBasedAuthentication().validate();
        }
        if (networkRuleSet() != null) {
            networkRuleSet().validate();
        }
        if (routingPreference() != null) {
            routingPreference().validate();
        }
    }
}
