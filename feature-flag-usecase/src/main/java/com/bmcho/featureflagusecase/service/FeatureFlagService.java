package com.bmcho.featureflagusecase.service;

import com.bmcho.featureflagusecase.port.GetStringValuePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeatureFlagService {

    private final GetStringValuePort getStringValuePort;

    public String getStringFlag(String key) throws Exception {
        return getStringValuePort.getStringValue(new GetStringValuePort.GetStringValuePortRequest(key));
    }
    public String getStringFlagWithDefaultValue(String key, String defaultValue) {
        return getStringValuePort.getStringValueWithDefaultValue(new GetStringValuePort.GetStringValuePortRequest(key), defaultValue);
    }
}