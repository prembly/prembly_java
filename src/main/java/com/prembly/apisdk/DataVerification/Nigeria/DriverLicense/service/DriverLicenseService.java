package com.prembly.apisdk.DataVerification.Nigeria.DriverLicense.service;

import com.prembly.apisdk.DataVerification.Nigeria.DriverLicense.apiModels.*;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DriverLicenseService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public DriverLicenseService(@Value("${identitypass.api.baseUrl:}") String baseApiUrl, PremblySdkRestClient restClient ){
       this.restClient = restClient;
       this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public DriversLicenseBasicResponse driversLicenseBasic(DriversLicenseBasicRequest request) {
        return restClient.post(premblyApiUrls.getDriversLicenseBasicApiUrl(), request, DriversLicenseBasicResponse.class);
    }

    public AdvanceDriversLicenseResponse advanceDriversLicense(AdvanceDriversLicenseRequest request) {
        return restClient.post(premblyApiUrls.getAdvanceDriversLicenseApiUrl(), request, AdvanceDriversLicenseResponse.class);
    }

    public DriversLicenseImageResponse driversLicenseImage(DriversLicenseImageRequest request) {
        return restClient.post(premblyApiUrls.getDriversLicenseImageApiUrl(), request, DriversLicenseImageResponse.class);
    }

    public LookupDriversLicenseResponse lookupDriversLicense(LookupDriversLicenseRequest request) {
        return restClient.post(premblyApiUrls.getLookupDriversLicenseApiUrl(), request, LookupDriversLicenseResponse.class);
    }

    public DriversLicenseFaceValidationResponse driversLicenseFaceValidation(DriversLicenseFaceValidationRequest request) {
        return restClient.post(premblyApiUrls.getDriversLicenseFaceValidationApiUrl(), request, DriversLicenseFaceValidationResponse.class);
    }
}
