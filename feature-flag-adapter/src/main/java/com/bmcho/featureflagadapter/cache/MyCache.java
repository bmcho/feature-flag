package com.bmcho.featureflagadapter.cache;

import com.bmcho.featureflagadapter.cache.eventlistener.EhCacheEventFactory;
import com.bmcho.featureflagadapter.metric.FeatureFlagCounter;
import dev.openfeature.sdk.ProviderEvaluation;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.map.LRUMap;
import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheEventListenerConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.event.EventType;
import org.ehcache.expiry.ExpiryPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;

import static dev.openfeature.contrib.providers.flagd.resolver.rpc.cache.CacheType.*;

@Slf4j
public class MyCache {
    private static final Logger logger = LoggerFactory.getLogger(MyCache.class);

    private Map<String, ProviderEvaluation<?>> lruCache;

    private Cache<String, ProviderEvaluation> myCache;

    @Getter
    private final Boolean enabled;

    private final String cacheType;

    private final FeatureFlagCounter counter;

    private int cacheSize;

    /**
     * Initialize the cache.
     *
     * @param forType      type of the cache.
     * @param maxCacheSize max amount of element to keep.
     */
    public MyCache(final String forType, int maxCacheSize, FeatureFlagCounter featureflagCounter) {
        counter = featureflagCounter;
        cacheSize = maxCacheSize;
        if (DISABLED.getValue().equals(forType)) {
            enabled = false;
            cacheType = null;
        } else if (LRU.getValue().equals(forType)) {
            enabled = true;
            logger.info("Using lru cache");
            this.lruCache = Collections.synchronizedMap(new LRUMap<>(maxCacheSize));
            cacheType = "LRU";
        } else if (CUSTOM.getValue().equals(forType)) {
            enabled = true;
            logger.info("Using ehcache");
            cacheType = "CUSTOM";
            CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder().build(true);
            myCache = cacheManager.createCache("myCache",
                CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, ProviderEvaluation.class,
                    ResourcePoolsBuilder.heap(maxCacheSize))
                    .withExpiry(new ExpiryPolicy<>() {
                        @Override
                        public Duration getExpiryForCreation(String s, ProviderEvaluation providerEvaluation) {
                            // default INFINITE
                            // 생성 된 것은, 삭제하지마.
                            return INFINITE;
                        }

                        @Override
                        public Duration getExpiryForAccess(String s, Supplier<? extends ProviderEvaluation> supplier) {
                            // default null
                            // 접근한 아이템에 대한 만료시간을 설정하고 싶다면, 여기서 설정하면 된다.
                            return null;
                        }

                        @Override
                        public Duration getExpiryForUpdate(String s, Supplier<? extends ProviderEvaluation> supplier, ProviderEvaluation providerEvaluation) {
                            // default null
                            //
                            return null;
                        }
                    })
                    .withEvictionAdvisor((key, providerEvaluation) -> {
                        // key, value 에 대해서 "가능하면, 최대한" 삭제하지 말라는 의미.
                        // 최대한 삭제를 피하기 위해서는 true
                        // 웬만하면 삭제하기 위해서는 false
                        if(!key.startsWith("test")) {
                            return false;
                        }
                        else return !key.startsWith("fast");
                    })
                    .withService(
                        CacheEventListenerConfigurationBuilder.newEventListenerConfiguration(
                            new EhCacheEventFactory<>(),
                            EventType.EVICTED,
                            EventType.EXPIRED,
                            EventType.REMOVED,
                            EventType.CREATED,
                            EventType.UPDATED
                        ).unordered().asynchronous()
                    )
                    .build());
        } else{
            throw new IllegalArgumentException("Unsupported cache type");
        }
    }

    public void put(String key, ProviderEvaluation<?> value) {
        if (cacheType.equals("LRU")) {
            this.lruCache.put(key, value);
        } else if (cacheType.equals("CUSTOM")){
            this.myCache.put(key, value);
        }
    }

    public ProviderEvaluation<?> get(String key) {
        ProviderEvaluation<?> result = null;
        if (cacheType.equals("LRU")) {
            result = this.lruCache.get(key);

        } else if (cacheType.equals("CUSTOM")){
            result = this.myCache.get(key);
        }

        if (result == null) {
            if (cacheType.equals("LRU")) {
                if(this.lruCache.size() == cacheSize) counter.incrementEvictionCount();
            }
            counter.incrementCacheMiss();
        } else {
            counter.incrementCacheHit();
        }
        return result;
    }

    public void remove(String key) {
        if (cacheType.equals("LRU")) {
            this.lruCache.remove(key);
        } else if (cacheType.equals("CUSTOM")){
            this.myCache.remove(key);
        }
    }

    public void clear() {
        if (cacheType.equals("LRU")) {
            this.lruCache.clear();
        } else if (cacheType.equals("CUSTOM")){
            this.myCache.clear();
        }
    }
}