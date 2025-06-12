package com.bmcho.featureflagadapter.openfeatureflag;

import com.bmcho.featureflagusecase.port.GetStringValuePort;
import dev.openfeature.sdk.Client;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class FlagAdapter implements GetStringValuePort {

    private final Client flagdClient;

    @Override
    public String getStringValue(GetStringValuePortRequest request) throws Exception {
        String result = flagdClient.getStringValue(request.getKey(), "null");
        if (result.equals("null")) {
            log.warn("Flagd returned null for key: {}", request.getKey());
            throw new Exception("Flagd returned null for key: {}");
        }
        return result;
    }

    @Override
    public String getStringValueWithDefaultValue(GetStringValuePortRequest request, String defaultValue) {
        return flagdClient.getStringValue(request.getKey(), defaultValue);
    }
}
