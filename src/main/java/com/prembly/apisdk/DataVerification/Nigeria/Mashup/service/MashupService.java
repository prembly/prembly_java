package com.prembly.apisdk.DataVerification.Nigeria.Mashup.service;

import com.prembly.apisdk.DataVerification.Nigeria.Mashup.apiModels.*;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MashupService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public MashupService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public BvnCreditBureauResponse bvnCreditBureau(BvnCreditBureauRequest request){
        return restClient.post(premblyApiUrls.getBvnCreditBureauApiUrl(),request, BvnCreditBureauResponse.class);
    }
    public BvnOrPhoneResponse bvnOrPhone(BvnOrPhoneRequest request){
        return restClient.post(premblyApiUrls.getBvnOrPhoneApiUrl(),request, BvnOrPhoneResponse.class);
    }
    public BvnNinPhoneResponse bvnNinPhone(BvnNinPhoneRequest request){
        return restClient.post(premblyApiUrls.getBvnNinPhoneApiUrl(),request, BvnNinPhoneResponse.class);
    }
}
