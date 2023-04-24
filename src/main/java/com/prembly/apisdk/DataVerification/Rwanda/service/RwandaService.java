package com.prembly.apisdk.DataVerification.Rwanda.service;

import com.prembly.apisdk.DataVerification.Rwanda.apiModels.NIDRequest;
import com.prembly.apisdk.DataVerification.Rwanda.apiModels.NIDResponse;
import com.prembly.apisdk.DataVerification.Rwanda.apiModels.PassportRequest;
import com.prembly.apisdk.DataVerification.Rwanda.apiModels.PassportResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RwandaService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public RwandaService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public NIDResponse nid(NIDRequest request){
        return restClient.post(premblyApiUrls.getNIDApiUrl(), request, NIDResponse.class);
    }
    public PassportResponse passport(PassportRequest request){
        return restClient.post(premblyApiUrls.getRwandaPassportApiUrl(), request, PassportResponse.class);
    }
}
