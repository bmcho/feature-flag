package dev.openfeature.contrib.providers.flagd.resolver.process.storage;

import dev.openfeature.contrib.providers.flagd.resolver.process.model.FeatureFlag;
import java.util.Map;
import lombok.Getter;

/**
 * To be returned by the storage when a flag is queried. Contains the flag (iff a flag associated with the given key
 * exists, null otherwise) and flag set metadata
 */
@Getter
public class StorageQueryResult {
    private final FeatureFlag featureFlag;
    private final Map<String, Object> flagSetMetadata;

    public StorageQueryResult(FeatureFlag featureFlag, Map<String, Object> flagSetMetadata) {
        this.featureFlag = featureFlag;
        this.flagSetMetadata = flagSetMetadata;
    }
}
