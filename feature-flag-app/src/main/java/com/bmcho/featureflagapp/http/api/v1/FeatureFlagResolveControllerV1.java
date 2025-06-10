package com.bmcho.featureflagapp.http.api.v1;

import com.bmcho.featureflagusecase.service.FeatureFlagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/resolve")
public class FeatureFlagResolveControllerV1 {

    private final FeatureFlagService featureFlagService;

    @GetMapping("/string/{key}")
    public String getStringFlagValue(@PathVariable String key) {
        String targetKey = key.isEmpty() ? "myStringFlag" : key;
        try {
            return featureFlagService.getStringFlag(targetKey);
        } catch (Exception e) {
            return "";
        }
    }
}