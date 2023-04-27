package com.prembly.apisdk.biometric.FaceRecognition.service;

import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import com.prembly.apisdk.biometric.FaceRecognition.apiModels.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FaceRecognitionService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public FaceRecognitionService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public AgeAndGenderResponse ageAndGender(AgeAndGenderRequest request){
        return restClient.post(premblyApiUrls.getAgeAndGenderApiUrl(), request, AgeAndGenderResponse.class);
    }
    public FaceComparisonResponse faceComparison(FaceComparisonRequest request){
        return restClient.post(premblyApiUrls.getFaceComparisonApiUrl(), request, FaceComparisonResponse.class);
    }
    public FaceEnrollmentResponse faceEnrollment(FaceEnrollmentRequest request){
        return restClient.post(premblyApiUrls.getFaceEnrollmentApiUrl(), request, FaceEnrollmentResponse.class);
    }
    public FaceLivelinessCheckResponse faceLivelinessCheck(FaceLivelinessCheckRequest request){
        return restClient.post(premblyApiUrls.getFaceLivelinessCheckApiUrl(), request, FaceLivelinessCheckResponse.class);
    }
    public FaceAuthenticationResponse faceAuthentication(FaceAuthenticationRequest request){
        return restClient.post(premblyApiUrls.getFaceAuthenticationApiUrl(), request, FaceAuthenticationResponse.class);
    }
    public IdFaceMatchingResponse idFaceMatching(IdFaceMatchingRequest request){
        return restClient.post(premblyApiUrls.getIdFaceMatchingApiUrl(), request, IdFaceMatchingResponse.class);
    }
}
