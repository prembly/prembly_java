package com.prembly.apisdk.DataVerification.SouthAfrica.service;

import com.prembly.apisdk.DataVerification.SouthAfrica.apiModels.BusinessVerificationRequest;
import com.prembly.apisdk.DataVerification.SouthAfrica.apiModels.BusinessVerificationResponse;
import com.prembly.apisdk.DataVerification.SouthAfrica.apiModels.NationalIdentityRequest;
import com.prembly.apisdk.DataVerification.SouthAfrica.apiModels.NationalIdentityResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SouthAfricaService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public SouthAfricaService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public NationalIdentityResponse nationalIdentity(NationalIdentityRequest request){
        return restClient.post(premblyApiUrls.getSouthAfricaNationalIdentityApiUrl(), request, NationalIdentityResponse.class);
    }
    public BusinessVerificationResponse businessVerification(BusinessVerificationRequest request){
        return restClient.post(premblyApiUrls.getSouthAfricaBusinessVerificationApiUrl(), request,
                BusinessVerificationResponse.class);
    }
}
