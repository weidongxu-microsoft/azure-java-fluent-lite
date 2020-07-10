package com.azure.resourcemanager.generated.storage;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.identity.EnvironmentCredentialBuilder;
import com.azure.resourcemanager.fluentcore.profile.AzureProfile;
import com.azure.resourcemanager.generated.storage.models.StorageAccount;
import org.junit.jupiter.api.Test;

public class StorageTest {

    @Test
    public void testStorageAccount() {
        StorageManager manager = StorageManager.authenticate(
                new EnvironmentCredentialBuilder().build(),
                new AzureProfile(AzureEnvironment.AZURE)
        );

        PagedIterable<StorageAccount> storageAccounts = manager.storageAccounts().list();
        long count = storageAccounts.stream().count();
        storageAccounts.forEach(a -> {
            int i = 1;
        });

        int i = 1;
    }
}
