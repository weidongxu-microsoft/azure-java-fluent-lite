module com.azure.java.resourcemanager.generated.storage {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.generated.storage;
    exports com.azure.resourcemanager.generated.storage.models;
    exports com.azure.resourcemanager.generated.storage.fluent.inner;

    opens com.azure.resourcemanager.generated.storage.models to
            com.fasterxml.jackson.databind,
            com.azure.core;
    opens com.azure.resourcemanager.generated.storage.fluent.inner to
            com.fasterxml.jackson.databind,
            com.azure.core;

    uses com.azure.core.http.HttpClientProvider;

    // TODO: move to a separate package
    exports com.azure.resourcemanager.fluentcore;
    exports com.azure.resourcemanager.fluentcore.models;
    exports com.azure.resourcemanager.fluentcore.collection;
    exports com.azure.resourcemanager.fluentcore.utils;
}
