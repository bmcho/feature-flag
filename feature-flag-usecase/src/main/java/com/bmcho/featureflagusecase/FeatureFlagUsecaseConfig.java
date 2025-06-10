package com.bmcho.featureflagusecase;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.bmcho.featureflagusecase"})
@RequiredArgsConstructor
public class FeatureFlagUsecaseConfig {
}