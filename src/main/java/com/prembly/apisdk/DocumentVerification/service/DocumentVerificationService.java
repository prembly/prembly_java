package com.prembly.apisdk.DocumentVerification.service;

import com.prembly.apisdk.DocumentVerification.apiModels.DocumentVerificationRequest;
import com.prembly.apisdk.DocumentVerification.apiModels.DocumentVerificationResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DocumentVerificationService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public DocumentVerificationService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public DocumentVerificationResponse documentVerification(DocumentVerificationRequest request){
        return restClient.post(premblyApiUrls.getDocumentVerificationApiUrl(), request, DocumentVerificationResponse.class);
    }
}
