package com.bmcho.featureflagadapter.cache.eventlistener;

import lombok.extern.slf4j.Slf4j;
import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EhCacheEventFactory<K,V> implements CacheEventListener<K,V> {

    @Override
    public void onEvent(CacheEvent<? extends K, ? extends V> cacheEvent) {
        log.info("Cache Event : {}, Key : {}, value: {}", cacheEvent.getType(), cacheEvent.getKey(), cacheEvent.getNewValue());
    }
}
