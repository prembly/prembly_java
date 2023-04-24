package com.prembly.apisdk.DataVerification.Ghana.service;

import com.prembly.apisdk.DataVerification.Ghana.apiModels.*;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GhanaService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public GhanaService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public SSNITResponse ssnit(SSNITRequest request){
        return restClient.post(premblyApiUrls.getSSNITApiUrl(), request, SSNITResponse.class);
    }
    public SSNITResponse ssnitWithFace(SSNITRequest request){
        return restClient.post(premblyApiUrls.getSNNITWithFaceApiUrlApiUrl(), request, SSNITResponse.class);
    }
    public InternationalPassportResponse internationalPassport(InternationalPassportRequest request){
        return restClient.post(premblyApiUrls.getGhanaInternationalPassportApiUrl(), request,
                InternationalPassportResponse.class);
    }
    public DriversLicenseResponse driversLicense(DriversLicenseRequest request){
        return restClient.post(premblyApiUrls.getGhanaDriversLicenseApiUrl(), request,
                DriversLicenseResponse.class);
    }
    public VotersCardResponse votersCard(VotersCardRequest request){
        return restClient.post(premblyApiUrls.getGhanaVotersCardApiUrl(), request,
                VotersCardResponse.class);
    }
}
