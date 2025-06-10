package com.bmcho.featureflagusecase;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
    basePackages =  {
        "com.bmcho.featureflagusecase",
    }
)
public class FeatureflagUsecaseConfig {
}