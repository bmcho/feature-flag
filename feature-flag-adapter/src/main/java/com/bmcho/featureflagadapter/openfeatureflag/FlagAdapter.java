package com.bmcho.featureflagadapter.openfeatureflag;

import com.bmcho.featureflagusecase.port.GetStringValuePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FlagAdapter implements GetStringValuePort {

    @Override
    public String getStringValue(GetStringValuePortRequest request) throws Exception {
        return request.getKey();
    }

    @Override
    public String getStringValueWithDefaultValue(GetStringValuePortRequest request, String defaultValue) {
        return null;
    }
}
