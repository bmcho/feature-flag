package com.bmcho.featureflagapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(FeatureFlagAppApplicationConfig.class)
@SpringBootApplication
public class FeatureFlagAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeatureFlagAppApplication.class, args);
    }

}
