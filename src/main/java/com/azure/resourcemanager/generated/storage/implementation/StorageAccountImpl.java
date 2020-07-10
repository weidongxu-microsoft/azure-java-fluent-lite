package com.azure.resourcemanager.generated.storage.implementation;

import com.azure.resourcemanager.generated.storage.StorageAccount;
import com.azure.resourcemanager.generated.storage.StorageAccountsClient;
import com.azure.resourcemanager.generated.storage.fluent.inner.StorageAccountInner;

public class StorageAccountImpl implements StorageAccount {

    private final StorageAccountInner inner;

    StorageAccountImpl(String name, StorageAccountInner inner, StorageAccountsClient client) {
        this.inner = inner;
    }
}
