package com.prembly.apisdk.DataVerification.Uganda.service;

import com.prembly.apisdk.DataVerification.Uganda.apiModels.BusinessVerificationRequest;
import com.prembly.apisdk.DataVerification.Uganda.apiModels.BusinessVerificationResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UgandaService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public UgandaService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public BusinessVerificationResponse businessVerification(BusinessVerificationRequest request){
        return restClient.post(premblyApiUrls.getUgandaBusinessVerificationApiUrl(),
                request, BusinessVerificationResponse.class);
    }
}
