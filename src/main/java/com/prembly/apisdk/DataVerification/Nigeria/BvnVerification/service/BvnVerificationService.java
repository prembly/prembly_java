package com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.service;

import com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels.BvnVerificationRequest;
import com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels.BvnVerificationResponse;
import com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels.IgreeRequest;
import com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels.IgreeResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BvnVerificationService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public BvnVerificationService(@Value("${identitypass.api.baseUrl:}") String baseApiUrl, PremblySdkRestClient restClient ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }
    public BvnVerificationResponse bvnOnePointZero(BvnVerificationRequest request) {
        return restClient.post(premblyApiUrls.getBvnOnePointZeroApiUrl(), request, BvnVerificationResponse.class);
    }
    public BvnVerificationResponse bvnTwoPointZero(BvnVerificationRequest request) {
        return restClient.post(premblyApiUrls.getBvnTwoPointZeroApiUrl(), request, BvnVerificationResponse.class);
    }
    public BvnVerificationResponse bvnTwoPointZeroPlusFaceValidation(BvnVerificationRequest request) {
        return restClient.post(premblyApiUrls.getBvnTwoPointZeroPlusFaceValidationApiUrl(), request, BvnVerificationResponse.class);
    }
    public IgreeResponse igree(IgreeRequest request) {
        return restClient.post(premblyApiUrls.getIgreeApiUrl(), request, IgreeResponse.class);
    }
}
