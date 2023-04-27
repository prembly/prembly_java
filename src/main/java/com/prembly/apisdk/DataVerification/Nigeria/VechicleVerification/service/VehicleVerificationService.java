package com.prembly.apisdk.DataVerification.Nigeria.VechicleVerification.service;

import com.prembly.apisdk.DataVerification.Nigeria.VechicleVerification.apiModels.VehicleVerificationRequest;
import com.prembly.apisdk.DataVerification.Nigeria.VechicleVerification.apiModels.VehicleVerificationResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VehicleVerificationService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public VehicleVerificationService(@Value("${identitypass.api.baseUrl:}") String baseApiUrl,
                                        PremblySdkRestClient restClient ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public VehicleVerificationResponse plateNumberVerification(VehicleVerificationRequest request) {
        return restClient.post(premblyApiUrls.getPlateNumberVerificationApiUrl(), request, VehicleVerificationResponse.class);
    }
}
