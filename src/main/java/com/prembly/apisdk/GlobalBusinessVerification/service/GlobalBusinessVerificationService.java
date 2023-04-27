package com.prembly.apisdk.GlobalBusinessVerification.service;

import com.prembly.apisdk.GlobalBusinessVerification.apiModels.*;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GlobalBusinessVerificationService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public GlobalBusinessVerificationService (
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public CompanySearchWithEmailResponse companySearchWithEmail(CompanySearchWithEmailRequest request){
        return restClient.post(premblyApiUrls.getCompanySearchWithEmailApiUrl(), request,
                CompanySearchWithEmailResponse.class);
    }
    public CompanySearchWithStringsResponse companySearchWithStrings(CompanySearchWithStringsRequest request){
        return restClient.post(premblyApiUrls.getCompanySearchWithStringsApiUrl(), request,
                CompanySearchWithStringsResponse.class);
    }
    public CompanySearchWithNameResponse companySearchWithName(CompanySearchWithNameRequest request){
        return restClient.post(premblyApiUrls.getCompanySearchWithNameApiUrl(), request,
                CompanySearchWithNameResponse.class);
    }
    public String companySearchWithRegistrationNumber(CompanySearchWithRnRequest request){
        return restClient.post(premblyApiUrls.getCompanySearchWithRegistrationNumberApiUrl(), request,
                String.class);
    }
}
