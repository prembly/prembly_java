package com.prembly.apisdk.DataVerification.Kenya.service;

import com.prembly.apisdk.DataVerification.Kenya.apiModels.IdentityRequest;
import com.prembly.apisdk.DataVerification.Kenya.apiModels.IdentityResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class KenyaService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public KenyaService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public IdentityResponse nationalIdentityNumber(IdentityRequest request){
        return restClient.post(premblyApiUrls.getKenyaNationalIdentityNumberApiUrl(), request, IdentityResponse.class);
    }
    public IdentityResponse internationalPassport(IdentityRequest request){
        return restClient.post(premblyApiUrls.getKenyaInternationalPassportApiUrl(), request, IdentityResponse.class);
    }
    public IdentityResponse driversLicense(IdentityRequest request){
        return restClient.post(premblyApiUrls.getKenyaDriversLicenseApiUrl(), request, IdentityResponse.class);
    }
    public IdentityResponse alienId(IdentityRequest request){
        return restClient.post(premblyApiUrls.getKenyaAlienIdApiUrl(), request, IdentityResponse.class);
    }
    public IdentityResponse serialNumber(IdentityRequest request){
        return restClient.post(premblyApiUrls.getKenyaSerialNumberApiUrl(), request, IdentityResponse.class);
    }
}
