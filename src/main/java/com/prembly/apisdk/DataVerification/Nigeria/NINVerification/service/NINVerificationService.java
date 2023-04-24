package com.prembly.apisdk.DataVerification.Nigeria.NINVerification.service;

import com.prembly.apisdk.DataVerification.Nigeria.NINVerification.apiModels.*;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NINVerificationService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public NINVerificationService(@Value("${identitypass.api.baseUrl:}") String baseApiUrl,
                                        PremblySdkRestClient restClient ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }
    public LookUpNINSlipImageResponse lookUpNINSlipImage(LookUpNINSlipImageRequest lookUpNINSlipImageRequest){
        return restClient.post(premblyApiUrls.getLookUpNINSlipImageApiUrl(),lookUpNINSlipImageRequest, LookUpNINSlipImageResponse.class);
    }
    public LookUpVirtualNINResponse lookUpVirtualNIN(LookUpVirtualNINRequest lookUpVirtualNINRequest){
        return restClient.post(premblyApiUrls.getLookUpVirtualNINApiUrl(),lookUpVirtualNINRequest, LookUpVirtualNINResponse.class);
    }
    public LookUpNINWithFaceResponse lookUpNINWithFace(LookUpNINWithFaceRequest lookUpNINWithFaceRequest){
        return restClient.post(premblyApiUrls.getLookUpNINWithFaceApiUrl(),lookUpNINWithFaceRequest, LookUpNINWithFaceResponse.class);
    }
}
