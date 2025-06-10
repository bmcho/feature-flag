package com.bmcho.featureflagapp;

import com.bmcho.featureflagadapter.FeatureFlagAdapterConfig;
import com.bmcho.featureflagusecase.FeatureFlagUsecaseConfig;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

@Import({FeatureFlagAdapterConfig.class, FeatureFlagUsecaseConfig.class})
@ServletComponentScan
public class FeatureFlagAppApplicationConfig {
}
