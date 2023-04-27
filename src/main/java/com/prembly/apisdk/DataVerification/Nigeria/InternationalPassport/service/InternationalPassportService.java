package com.prembly.apisdk.DataVerification.Nigeria.InternationalPassport.service;

import com.prembly.apisdk.DataVerification.Nigeria.InternationalPassport.apiModels.*;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InternationalPassportService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public InternationalPassportService(@Value("${identitypass.api.baseUrl:}") String baseApiUrl,
                                  PremblySdkRestClient restClient ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public InternationalPassportSyncResponse internationalPassportSync(InternationalPassportSyncRequest request) {
        return restClient.post(premblyApiUrls.getInternationalPassportSyncApiUrl(), request, InternationalPassportSyncResponse.class);
    }

    public InternationalPassportImageResponse internationalPassportImage(InternationalPassportImageRequest request) {
        return restClient.post(premblyApiUrls.getInternationalPassportImageApiUrl(), request, InternationalPassportImageResponse.class);
    }

    public InternationalPassportFaceValidationResponse internationalPassportFaceValidation
            (InternationalPassportFaceValidationRequest request) {
        return restClient.post(premblyApiUrls.getInternationalPassportFaceValidationApiUrl(), request, InternationalPassportFaceValidationResponse.class);
    }

    public InternationalPassportAsyncResponse internationalPassportAsync(InternationalPassportAsyncRequest request) {
        return restClient.post(premblyApiUrls.getInternationalPassportAsyncApiUrl(), request, InternationalPassportAsyncResponse.class);
    }
}
