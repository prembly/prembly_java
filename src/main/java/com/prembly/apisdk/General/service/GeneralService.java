package com.prembly.apisdk.General.service;

import com.prembly.apisdk.General.apiModels.*;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GeneralService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public GeneralService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public EmailVerificationResponse emailVerification(EmailVerificationRequest request){
        return restClient.post(premblyApiUrls.getEmailVerificationApiUrl(), request, EmailVerificationResponse.class);
    }
    public CardBinResponse cardBin(CardBinRequest request){
        return restClient.post(premblyApiUrls.getCardBinApiUrl(), request, CardBinResponse.class);
    }
    public InterpolBanListResponse interpolBanList(InterpolBanListRequest request){
        return restClient.post(premblyApiUrls.getInterpolBanListApiUrl(), request, InterpolBanListResponse.class);
    }
    public VinCarChassisResponse vinCarChassis(VinCarChassisRequest request){
        return restClient.post(premblyApiUrls.getVinCarChassisApiUrl(), request, VinCarChassisResponse.class);
    }
    public GetWalletBalanceResponse getWalletBalance(){
        return restClient.get(premblyApiUrls.getWalletBalanceApiUrl(), GetWalletBalanceResponse.class);
    }
    public GetVerificationStatusResponse getVerificationStatus(GetVerificationStatusRequest request){
        return restClient.post(premblyApiUrls.getVerificationStatusApiUrl(), request, GetVerificationStatusResponse.class);
    }
    public GetAllVerificationEndpointsResponse getAllVerificationEndpoints(){
        return restClient.get(premblyApiUrls.getGetAllVerificationEndpointsApiUrl(), GetAllVerificationEndpointsResponse.class);
    }
}
