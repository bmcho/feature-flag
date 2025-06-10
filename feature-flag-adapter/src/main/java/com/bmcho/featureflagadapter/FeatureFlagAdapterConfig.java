package com.bmcho.featureflagadapter;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.bmcho.featureflagadapter"})
@RequiredArgsConstructor
public class FeatureFlagAdapterConfig {
}
