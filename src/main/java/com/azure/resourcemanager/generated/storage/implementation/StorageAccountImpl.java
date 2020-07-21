package com.azure.resourcemanager.generated.storage.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.fluentcore.models.Region;
import com.azure.resourcemanager.fluentcore.utils.ResourceUtils;
import com.azure.resourcemanager.generated.storage.models.AccessTier;
import com.azure.resourcemanager.generated.storage.models.AccountStatus;
import com.azure.resourcemanager.generated.storage.models.AzureFilesIdentityBasedAuthentication;
import com.azure.resourcemanager.generated.storage.models.CustomDomain;
import com.azure.resourcemanager.generated.storage.models.Encryption;
import com.azure.resourcemanager.generated.storage.models.Endpoints;
import com.azure.resourcemanager.generated.storage.models.GeoReplicationStats;
import com.azure.resourcemanager.generated.storage.models.Identity;
import com.azure.resourcemanager.generated.storage.models.Kind;
import com.azure.resourcemanager.generated.storage.models.LargeFileSharesState;
import com.azure.resourcemanager.generated.storage.models.MinimumTlsVersion;
import com.azure.resourcemanager.generated.storage.models.NetworkRuleSet;
import com.azure.resourcemanager.generated.storage.models.ProvisioningState;
import com.azure.resourcemanager.generated.storage.models.RoutingPreference;
import com.azure.resourcemanager.generated.storage.models.Sku;
import com.azure.resourcemanager.generated.storage.models.StorageAccount;
import com.azure.resourcemanager.generated.storage.StorageAccountsClient;
import com.azure.resourcemanager.generated.storage.models.inner.StorageAccountInner;
import com.azure.resourcemanager.generated.storage.models.StorageAccountCreateParameters;
import com.azure.resourcemanager.generated.storage.models.StorageAccountUpdateParameters;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StorageAccountImpl implements
        StorageAccount,
        StorageAccount.Definition,
        StorageAccount.Update {

    private StorageAccountInner inner;
    private final StorageAccountsClient client;
    private StorageAccountCreateParameters createParameter;
    private StorageAccountUpdateParameters updateParameter;
    private final String name;
    private String groupName;

    StorageAccountImpl(String name, StorageAccountInner inner, StorageAccountsClient client) {
        this.name = name;
        this.inner = inner;
        this.client = client;
        resetCreateUpdateParameters();
    }

    @Override
    public StorageAccountInner inner() {
        return inner;
    }

    private boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new StorageAccountCreateParameters();
        this.updateParameter = new StorageAccountUpdateParameters();
    }

    private StorageAccountImpl setInner(StorageAccountInner inner) {
        resetCreateUpdateParameters();
        this.inner = inner;
        return this;
    }

    @Override
    public String regionName() {
        return this.inner().location();
    }

    @Override
    public Region region() {
        return Region.fromName(this.regionName());
    }

    @Override
    public Map<String, String> tags() {
        Map<String, String> tags = this.inner().tags();
        if (tags == null) {
            tags = new TreeMap<>();
        }
        return Collections.unmodifiableMap(tags);
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String name() {
        if (this.inner().name() == null) {
            return this.name;
        } else {
            return this.inner().name();
        }
    }

    @Override
    public AccessTier accessTier() {
        return this.inner().accessTier();
    }

    @Override
    public Boolean allowBlobPublicAccess() {
        return this.inner().allowBlobPublicAccess();
    }

    @Override
    public AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication() {
        return this.inner().azureFilesIdentityBasedAuthentication();
    }

    @Override
    public OffsetDateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public CustomDomain customDomain() {
        return this.inner().customDomain();
    }

    @Override
    public Boolean enableHttpsTrafficOnly() {
        return this.inner().enableHttpsTrafficOnly();
    }

    @Override
    public Encryption encryption() {
        return this.inner().encryption();
    }

    @Override
    public Boolean failoverInProgress() {
        return this.inner().failoverInProgress();
    }

    @Override
    public GeoReplicationStats geoReplicationStats() {
        return this.inner().geoReplicationStats();
    }

    @Override
    public Identity identity() {
        return this.inner().identity();
    }

    @Override
    public Boolean isHnsEnabled() {
        return this.inner().isHnsEnabled();
    }

    @Override
    public Kind kind() {
        return this.inner().kind();
    }

    @Override
    public LargeFileSharesState largeFileSharesState() {
        return this.inner().largeFileSharesState();
    }

    @Override
    public OffsetDateTime lastGeoFailoverTime() {
        return this.inner().lastGeoFailoverTime();
    }

    @Override
    public MinimumTlsVersion minimumTlsVersion() {
        return this.inner().minimumTlsVersion();
    }

    @Override
    public NetworkRuleSet networkRuleSet() {
        return this.inner().networkRuleSet();
    }

    @Override
    public Endpoints primaryEndpoints() {
        return this.inner().primaryEndpoints();
    }

    @Override
    public String primaryLocation() {
        return this.inner().primaryLocation();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public RoutingPreference routingPreference() {
        return this.inner().routingPreference();
    }

    @Override
    public Endpoints secondaryEndpoints() {
        return this.inner().secondaryEndpoints();
    }

    @Override
    public String secondaryLocation() {
        return this.inner().secondaryLocation();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public AccountStatus statusOfPrimary() {
        return this.inner().statusOfPrimary();
    }

    @Override
    public AccountStatus statusOfSecondary() {
        return this.inner().statusOfSecondary();
    }

    @Override
    public String resourceGroupName() {
        if (this.groupName == null) {
            return ResourceUtils.groupFromResourceId(this.id());
        } else {
            return this.groupName;
        }
    }

    @Override
    public final StorageAccountImpl withTags(Map<String, String> tags) {
        this.inner().withTags(new HashMap<>(tags));
        return this;
    }

    @Override
    public final StorageAccountImpl withTag(String key, String value) {
        if (this.inner().tags() == null) {
            this.inner().withTags(new HashMap<>());
        }
        this.inner().tags().put(key, value);
        return this;
    }

    @Override
    public final StorageAccountImpl withoutTag(String key) {
        if (this.inner().tags() != null) {
            this.inner().tags().remove(key);
        }
        return this;
    }

    @Override
    public final StorageAccountImpl withRegion(String regionName) {
        this.inner().withLocation(regionName);
        return this;
    }

    @Override
    public final StorageAccountImpl withRegion(Region region) {
        return this.withRegion(region.toString());
    }

    @Override
    public final StorageAccountImpl withExistingResourceGroup(String groupName) {
        this.groupName = groupName;
        return this;
    }

    @Override
    public StorageAccountImpl withKind(Kind kind) {
        if (isInCreateMode()) {
            this.createParameter.withKind(kind);
        } else {
            this.updateParameter.withKind(kind);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.createParameter.withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withAccessTier(AccessTier accessTier) {
        if (isInCreateMode()) {
            this.createParameter.withAccessTier(accessTier);
        } else {
            this.updateParameter.withAccessTier(accessTier);
        }
        return this;
    }

    @Override
    public StorageAccount apply() {
        return apply(Context.NONE);
    }

    @Override
    public StorageAccount apply(Context context) {
        this.updateParameter.withTags(inner().tags());
        StorageAccountInner inner = client.update(this.resourceGroupName(), this.name(), this.updateParameter, context);
        return this.setInner(inner);
    }

    @Override
    public StorageAccount create() {
        return create(Context.NONE);
    }

    @Override
    public StorageAccount create(Context context) {
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().tags());
        StorageAccountInner inner = client.create(this.resourceGroupName(), this.name(), this.createParameter, context);
        return this.setInner(inner);
    }

    @Override
    public StorageAccount refresh() {
        return refresh(Context.NONE);
    }

    @Override
    public StorageAccount refresh(Context context) {
        StorageAccountInner inner = client.getByResourceGroup(this.resourceGroupName(), this.name(), null, context);
        return this.setInner(inner);
    }

    @Override
    public Update update() {
        return this;
    }
}
