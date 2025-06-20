package com.bmcho.featureflagadapter;

import com.bmcho.featureflagadapter.metric.FeatureFlagCounter;
import dev.openfeature.contrib.providers.flagd.Config;
import dev.openfeature.contrib.providers.flagd.FlagdOptions;
import dev.openfeature.contrib.providers.flagd.FlagdProvider;
import dev.openfeature.sdk.Client;
import dev.openfeature.sdk.OpenFeatureAPI;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.Objects;

@Configuration
@ComponentScan(basePackages = {"com.bmcho.featureflagadapter"})
@RequiredArgsConstructor
public class FeatureFlagAdapterConfig {

    private final Environment environment;
    private final MeterRegistry registry;

    @Bean
    public Client flagdClient() {
        String flagdHost = environment.getProperty("FEATUREFLAG_ENGINE_HOST") == null ? "localhost" : environment.getProperty("FEATUREFLAG_ENGINE_HOST");
        String flagdPort = environment.getProperty("FEATUREFLAG_ENGINE_PORT") == null ? "8013" : environment.getProperty("FEATUREFLAG_ENGINE_PORT");
        String maxCacheSize = environment.getProperty("MAX_CACHE_SIZE") == null ? "100" : environment.getProperty("MAX_CACHE_SIZE");
//        String cacheType = environment.getProperty("CACHE_TYPE") == null ? "lru" : environment.getProperty("CACHE_TYPE");
        String cacheType = "custom";

        FlagdProvider flagd = new FlagdProvider(
            FlagdOptions.builder()
                .resolverType(Config.Resolver.RPC)
                .host(flagdHost)
                .port(Integer.parseInt(Objects.requireNonNull(flagdPort)))
                .tls(false)
                .maxCacheSize(Integer.parseInt(Objects.requireNonNull(maxCacheSize)))
                .retryBackoffMs(100)
                .deadline(3000)
                .cacheType(cacheType)
                .build()
            , featureflagCounter()
        );

        OpenFeatureAPI api = OpenFeatureAPI.getInstance();
        api.setProviderAndWait(flagd);
        return api.getClient();
    }

    public FeatureFlagCounter featureflagCounter() {
        return FeatureFlagCounter.standard(registry);
    }
}
