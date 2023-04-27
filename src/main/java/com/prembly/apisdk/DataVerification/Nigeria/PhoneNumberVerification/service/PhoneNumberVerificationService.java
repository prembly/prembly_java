package com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification.service;


import com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification.apiModels.AdvancePhoneNumberResponse;
import com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification.apiModels.BasicPhoneNumberResponse;
import com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification.apiModels.PhoneNumberVerificationRequest;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PhoneNumberVerificationService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public PhoneNumberVerificationService(@Value("${identitypass.api.baseUrl:}") String baseApiUrl,
                                        PremblySdkRestClient restClient ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public BasicPhoneNumberResponse basicPhoneNumber(PhoneNumberVerificationRequest request){
        return restClient.post(premblyApiUrls.getBasicPhoneNumberApiUrl(),request, BasicPhoneNumberResponse.class);
    }

    public AdvancePhoneNumberResponse advancePhoneNumber(PhoneNumberVerificationRequest request){
        return restClient.post(premblyApiUrls.getAdvancePhoneNumberApiUrl(),request, AdvancePhoneNumberResponse.class);
    }
}
