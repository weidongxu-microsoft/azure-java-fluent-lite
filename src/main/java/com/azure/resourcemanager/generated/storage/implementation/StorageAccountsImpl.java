package com.azure.resourcemanager.generated.storage.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.generated.storage.models.StorageAccount;
import com.azure.resourcemanager.generated.storage.models.StorageAccounts;
import com.azure.resourcemanager.generated.storage.StorageAccountsClient;
import com.azure.resourcemanager.generated.storage.fluent.inner.StorageAccountInner;
import com.azure.resourcemanager.generated.storage.fluent.inner.StorageAccountListKeysResultInner;
import com.azure.resourcemanager.generated.storage.models.ListKeyExpand;

public class StorageAccountsImpl implements StorageAccounts {

    private final StorageAccountsClient inner;

    public StorageAccountsImpl(StorageAccountsClient inner) {
        this.inner = inner;
    }

    @Override
    public StorageAccountListKeysResultInner listKeys(String resourceGroupName, String accountName, ListKeyExpand expand) {
        return inner.listKeys(resourceGroupName, accountName, expand);
    }

    @Override
    public StorageAccountListKeysResultInner listKeys(String resourceGroupName, String accountName, ListKeyExpand expand, Context context) {
        return inner.listKeys(resourceGroupName, accountName, expand, context);
    }

    @Override
    public void deleteByResourceGroup(String resourceGroupName, String name) {
        inner.delete(resourceGroupName, name);
    }

    @Override
    public StorageAccount getByResourceGroup(String resourceGroupName, String name) {
        return wrapModel(inner.getByResourceGroup(resourceGroupName, name));
    }

    @Override
    public PagedIterable<StorageAccount> list() {
        return inner.list().mapPage(this::wrapModel);
    }

    @Override
    public PagedIterable<StorageAccount> listByResourceGroup(String resourceGroupName) {
        return inner.listByResourceGroup(resourceGroupName).mapPage(this::wrapModel);
    }

    public StorageAccountImpl define(String name) {
        return new StorageAccountImpl(name, new StorageAccountInner(), this.inner);
    }

    private StorageAccountImpl wrapModel(StorageAccountInner inner) {
        return new StorageAccountImpl(inner.name(), inner, this.inner);
    }
}
