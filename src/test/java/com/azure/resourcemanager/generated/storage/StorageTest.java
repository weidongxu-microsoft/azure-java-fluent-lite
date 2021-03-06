package com.azure.resourcemanager.generated.storage;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.Configuration;
import com.azure.identity.EnvironmentCredentialBuilder;
import com.azure.resourcemanager.fluentcore.models.Region;
import com.azure.resourcemanager.generated.storage.models.AccessTier;
import com.azure.resourcemanager.generated.storage.models.Kind;
import com.azure.resourcemanager.generated.storage.models.Sku;
import com.azure.resourcemanager.generated.storage.models.SkuName;
import com.azure.resourcemanager.generated.storage.models.StorageAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StorageTest {

    @Test
    public void testStorageAccount() {
        StorageManager manager = StorageManager
                .configure()
                .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .authenticate(
                        new EnvironmentCredentialBuilder().build(),
                        AzureEnvironment.AZURE,
                        Configuration.getGlobalConfiguration().get("AZURE_SUBSCRIPTION_ID")
                );

        PagedIterable<StorageAccount> storageAccounts = manager.storageAccounts().list();
        long count = storageAccounts.stream().count();

        String groupName = "rg-weidxu";
        String storageAccountName = "saweidxutest";
        try {
            manager.storageAccounts().define(storageAccountName)
                    .withRegion(Region.US_EAST)
                    .withExistingResourceGroup(groupName)
                    .withKind(Kind.BLOB_STORAGE)
                    .withSku(new Sku().withName(SkuName.STANDARD_LRS))
                    .withAccessTier(AccessTier.HOT)
                    .withTag("k1", "v1")
                    .create();

            storageAccounts = manager.storageAccounts().list();
            long count2 = storageAccounts.stream().count();
            Assertions.assertEquals(count + 1, count2);
        } finally {
            manager.storageAccounts().deleteByResourceGroup(groupName, storageAccountName);
        }
    }
}
