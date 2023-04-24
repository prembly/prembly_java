package com.prembly.apisdk.DataVerification.Nigeria.VotersCard.service;

import com.prembly.apisdk.DataVerification.Nigeria.VotersCard.apiModels.LookupVinIdImageRequest;
import com.prembly.apisdk.DataVerification.Nigeria.VotersCard.apiModels.LookupVinIdImageResponse;
import com.prembly.apisdk.DataVerification.Nigeria.VotersCard.apiModels.LookupVinRequest;
import com.prembly.apisdk.DataVerification.Nigeria.VotersCard.apiModels.LookupVinResponse;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VotersCardService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public VotersCardService(@Value("${identitypass.api.baseUrl:}") String baseApiUrl,
                                        PremblySdkRestClient restClient ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public LookupVinIdImageResponse lookupVinIdImage(LookupVinIdImageRequest request) {
        return restClient.post(premblyApiUrls.getLookupVinIdImageApiUrl(), request, LookupVinIdImageResponse.class);
    }

    public LookupVinResponse lookupVin(LookupVinRequest request) {
        return restClient.post(premblyApiUrls.getLookupVinApiUrl(), request, LookupVinResponse.class);
    }
}
