package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.service;

import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial.CommercialAdvanceRequest;
import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial.CommercialAdvanceResponse;
import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial.CommercialBasicRequest;
import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial.CommercialBasicResponse;
import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer.ConsumerAdvanceRequest;
import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer.ConsumerAdvanceResponse;
import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer.ConsumerBasicRequest;
import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer.ConsumerBasicResponse;
import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.creditBureau.CreditBureauRequest;
import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.creditBureau.CreditBureauResponse;
import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.creditBureauMashup.CreditBureauMashupRequest;
import com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.creditBureauMashup.CreditBureauMashupResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CreditBureauService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public CreditBureauService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public ConsumerBasicResponse consumerBasic(ConsumerBasicRequest request){
        return restClient.post(premblyApiUrls.getConsumerBasicApiUrl(),request, ConsumerBasicResponse.class);
    }
    public ConsumerAdvanceResponse consumerAdvance(ConsumerAdvanceRequest request){
        return restClient.post(premblyApiUrls.getConsumerAdvanceApiUrl(),request, ConsumerAdvanceResponse.class);
    }
    public CommercialBasicResponse commercialBasic(CommercialBasicRequest request){
        return restClient.post(premblyApiUrls.getCommercialBasicApiUrl(),request, CommercialBasicResponse.class);
    }
    public CommercialAdvanceResponse commercialAdvance(CommercialAdvanceRequest request){
        return restClient.post(premblyApiUrls.getCommercialAdvanceApiUrl(),request, CommercialAdvanceResponse.class);
    }
    public CreditBureauResponse creditBureau(CreditBureauRequest request){
        return restClient.post(premblyApiUrls.getCreditBureauApiUrl(),request, CreditBureauResponse.class);
    }
    public CreditBureauMashupResponse creditBureauMashup(CreditBureauMashupRequest request){
        return restClient.post(premblyApiUrls.getCreditBureauMashupApiUrl(),request, CreditBureauMashupResponse.class);
    }
}
