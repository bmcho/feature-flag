package com.bmcho.featureflagapp;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.bmcho.featureflagadapter"})
@ServletComponentScan
public class FeatureFlagAppApplicationConfig {
}
