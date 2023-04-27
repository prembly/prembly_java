package com.prembly.apisdk.DataVerification.Nigeria.TINVerification.service;

import com.prembly.apisdk.DataVerification.Nigeria.TINVerification.apiModels.TINVerificationRequest;
import com.prembly.apisdk.DataVerification.Nigeria.TINVerification.apiModels.TINVerificationResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TINVerificationService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public TINVerificationService(@Value("${identitypass.api.baseUrl:}") String baseApiUrl, PremblySdkRestClient restClient ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public TINVerificationResponse verifyTIN(TINVerificationRequest request){
        return restClient.post(premblyApiUrls.getTaxIdentificationNumberVerificationApiUrl(),request, TINVerificationResponse.class);
    }
}
