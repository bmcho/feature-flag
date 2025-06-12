package com.bmcho.featureflagadapter.metric;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

public class FeatureFlagCounter {
    private final Counter cacheHitCounter;
    private final Counter cacheMissCounter;
    private final Counter cacheEvictionCounter;

    private FeatureFlagCounter(Counter cacheHitCounter, Counter cacheMissCounter, Counter cacheEvictionCounter) {
        this.cacheHitCounter = cacheHitCounter;
        this.cacheMissCounter = cacheMissCounter;
        this.cacheEvictionCounter = cacheEvictionCounter;
    }

    public static FeatureFlagCounter standard(MeterRegistry registry) {
        registry.config().commonTags("app", "feature-flag");

        return new FeatureFlagCounter(
            buildCacheHitCounter(registry),
            buildCacheMissCounter(registry),
            buildCacheEvictionCounter(registry)
        );
    }

    private static Counter buildCacheHitCounter(MeterRegistry registry) {
        String counterName = "cache_counter.hit";
        return registry.counter(counterName);
    }

    private static Counter buildCacheMissCounter(MeterRegistry registry) {
        String counterName = "cache_counter.miss";
        return registry.counter(counterName);
    }

    private static Counter buildCacheEvictionCounter(MeterRegistry registry) {
        String counterName = "cache_counter.eviction";
        return registry.counter(counterName);
    }

    public void incrementCacheHit() {
        cacheHitCounter.increment();
    }

    public void incrementCacheMiss() {
        cacheMissCounter.increment();
    }
    public void incrementEvictionCount() {
        cacheEvictionCounter.increment();
    }
}