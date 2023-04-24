package com.prembly.apisdk.DataVerification.Nigeria.CACVerification.service;

import com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels.AdvanceCacRequest;
import com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels.AdvanceCacResponse;
import com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels.BasicCacRequest;
import com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels.BasicCacResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CACVerificationService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public CACVerificationService(@Value("${identitypass.api.baseUrl:}") String baseApiUrl,
                                  PremblySdkRestClient restClient ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public BasicCacResponse basicCac(BasicCacRequest request){
        return restClient.post(premblyApiUrls.getBasicCacApiUrl(),request, BasicCacResponse.class);
    }

    public BasicCacResponse basicCacUsingName(BasicCacRequest request){
        return restClient.post(premblyApiUrls.getBasicCacUsingNameApiUrl(),request, BasicCacResponse.class);
    }

    public AdvanceCacResponse advanceCac(AdvanceCacRequest request){
        return restClient.post(premblyApiUrls.getAdvanceCacApiUrl(),request, AdvanceCacResponse.class);
    }
}
