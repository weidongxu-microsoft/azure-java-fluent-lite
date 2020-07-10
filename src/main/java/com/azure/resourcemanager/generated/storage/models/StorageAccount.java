package com.azure.resourcemanager.generated.storage.models;

import com.azure.resourcemanager.fluentcore.models.Appliable;
import com.azure.resourcemanager.fluentcore.models.Creatable;
import com.azure.resourcemanager.fluentcore.models.GroupableResource;
import com.azure.resourcemanager.fluentcore.models.Refreshable;
import com.azure.resourcemanager.fluentcore.models.Resource;
import com.azure.resourcemanager.fluentcore.models.Updatable;

import java.time.OffsetDateTime;

public interface StorageAccount extends GroupableResource,
        Refreshable<StorageAccount>,
        Updatable<StorageAccount.Update> {
    /**
     * @return the accessTier value.
     */
    AccessTier accessTier();

    /**
     * @return the allowBlobPublicAccess value.
     */
    Boolean allowBlobPublicAccess();

    /**
     * @return the azureFilesIdentityBasedAuthentication value.
     */
    AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication();

    /**
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * @return the customDomain value.
     */
    CustomDomain customDomain();

    /**
     * @return the enableHttpsTrafficOnly value.
     */
    Boolean enableHttpsTrafficOnly();

    /**
     * @return the encryption value.
     */
    Encryption encryption();

    /**
     * @return the failoverInProgress value.
     */
    Boolean failoverInProgress();

    /**
     * @return the geoReplicationStats value.
     */
    GeoReplicationStats geoReplicationStats();

    /**
     * @return the identity value.
     */
    Identity identity();

    /**
     * @return the isHnsEnabled value.
     */
    Boolean isHnsEnabled();

    /**
     * @return the kind value.
     */
    Kind kind();

    /**
     * @return the largeFileSharesState value.
     */
    LargeFileSharesState largeFileSharesState();

    /**
     * @return the lastGeoFailoverTime value.
     */
    OffsetDateTime lastGeoFailoverTime();

    /**
     * @return the minimumTlsVersion value.
     */
    MinimumTlsVersion minimumTlsVersion();

    /**
     * @return the networkRuleSet value.
     */
    NetworkRuleSet networkRuleSet();

    /**
     * @return the primaryEndpoints value.
     */
    Endpoints primaryEndpoints();

    /**
     * @return the primaryLocation value.
     */
    String primaryLocation();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the routingPreference value.
     */
    RoutingPreference routingPreference();

    /**
     * @return the secondaryEndpoints value.
     */
    Endpoints secondaryEndpoints();

    /**
     * @return the secondaryLocation value.
     */
    String secondaryLocation();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the statusOfPrimary value.
     */
    AccountStatus statusOfPrimary();

    /**
     * @return the statusOfSecondary value.
     */
    AccountStatus statusOfSecondary();

    /**
     * The entirety of the StorageAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithKind, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StorageAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StorageAccount definition.
         */
        interface Blank extends GroupableResource.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the StorageAccount definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResource.DefinitionStages.WithGroup<WithKind> {
        }

        /**
         * The stage of the storageaccount definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             *
             * @param kind Required. Indicates the type of storage account. Possible values include: 'Storage', 'StorageV2', 'BlobStorage', 'FileStorage', 'BlockBlobStorage'
             * @return the next definition stage
             */
            WithSku withKind(Kind kind);
        }

        /**
         * The stage of the storageaccount definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             *
             * @param sku Required. Gets or sets the SKU name
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the storageaccount definition allowing to specify AccessTier.
         */
        interface WithAccessTier {
            /**
             * Specifies accessTier.
             * @param accessTier Required for storage accounts where kind = BlobStorage. The access tier used for billing. Possible values include: 'Hot', 'Cool'
             * @return the next definition stage
             */
            WithCreate withAccessTier(AccessTier accessTier);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StorageAccount>, Resource.DefinitionWithTags<WithCreate>, WithAccessTier {
        }
    }

    /**
     * The template for a StorageAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StorageAccount>, Resource.UpdateWithTags<Update>, UpdateStages.WithSku {
    }

    /**
     * Grouping of StorageAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the storageaccount update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Gets or sets the SKU name. Note that the SKU name cannot be updated to Standard_ZRS, Premium_LRS or Premium_ZRS, nor can accounts of those SKU names be updated to any other value
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }
    }
}
