package com.prembly.apisdk.DataVerification.Nigeria.StampDuty.service;

import com.prembly.apisdk.DataVerification.Nigeria.StampDuty.apiModels.StampDutyVerificationRequest;
import com.prembly.apisdk.DataVerification.Nigeria.StampDuty.apiModels.StampDutyVerificationResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StampDutyVerificationService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public StampDutyVerificationService(@Value("${identitypass.api.baseUrl:}") String baseApiUrl,
                                        PremblySdkRestClient restClient ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }
    public StampDutyVerificationResponse verifyStampDuty(StampDutyVerificationRequest request) {
        return restClient.post(premblyApiUrls.getVerifyStampDutyApiUrl(), request, StampDutyVerificationResponse.class);
    }
}

