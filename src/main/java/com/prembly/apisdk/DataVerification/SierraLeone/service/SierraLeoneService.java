package com.prembly.apisdk.DataVerification.SierraLeone.service;

import com.prembly.apisdk.DataVerification.SierraLeone.apiModels.DriversLicenseRequest;
import com.prembly.apisdk.DataVerification.SierraLeone.apiModels.DriversLicenseResponse;
import com.prembly.apisdk.DataVerification.SierraLeone.apiModels.VotersCardRequest;
import com.prembly.apisdk.DataVerification.SierraLeone.apiModels.VotersCardResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SierraLeoneService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public SierraLeoneService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public VotersCardResponse votersCard(VotersCardRequest request){
        return restClient.post(premblyApiUrls.getSierraLeoneVotersCardApiUrl(), request, VotersCardResponse.class);
    }
    public DriversLicenseResponse driversLicense(DriversLicenseRequest request){
        return restClient.post(premblyApiUrls.getSierraLeoneDriversLicenseApiUrl(), request, DriversLicenseResponse.class);
    }
}
