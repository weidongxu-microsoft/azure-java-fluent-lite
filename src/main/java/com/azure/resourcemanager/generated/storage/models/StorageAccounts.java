package com.azure.resourcemanager.generated.storage.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.fluentcore.collection.SupportsCreating;
import com.azure.resourcemanager.fluentcore.collection.SupportsDeletingByResourceGroup;
import com.azure.resourcemanager.fluentcore.collection.SupportsGettingByResourceGroup;
import com.azure.resourcemanager.fluentcore.collection.SupportsListing;
import com.azure.resourcemanager.fluentcore.collection.SupportsListingByResourceGroup;
import com.azure.resourcemanager.fluentcore.models.HasInner;
import com.azure.resourcemanager.generated.storage.StorageAccountsClient;
import com.azure.resourcemanager.generated.storage.fluent.inner.StorageAccountListKeysResultInner;

public interface StorageAccounts extends
        HasInner<StorageAccountsClient>,
        SupportsCreating<StorageAccount.DefinitionStages.Blank>,
        SupportsDeletingByResourceGroup,
        SupportsGettingByResourceGroup<StorageAccount>,
        SupportsListingByResourceGroup<StorageAccount>,
        SupportsListing<StorageAccount> {
    /**
     * Lists the access keys or Kerberos keys (if active directory enabled) for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand Specifies type of the key to be listed. Possible value is kerb.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the response from the ListKeys operation.
     */
    StorageAccountListKeysResultInner listKeys(String resourceGroupName, String accountName, ListKeyExpand expand);

    /**
     * Lists the access keys or Kerberos keys (if active directory enabled) for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand Specifies type of the key to be listed. Possible value is kerb.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the response from the ListKeys operation.
     */
    StorageAccountListKeysResultInner listKeys(String resourceGroupName, String accountName, ListKeyExpand expand, Context context);
}
