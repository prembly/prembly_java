package com.prembly.apisdk.Radar.service;

import com.prembly.apisdk.Radar.apiModels.*;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

@Service
public class RadarService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    private final String radarAuthorizationHeader;
    public RadarService(
            @Value("${identitypass.radar.api.baseUrl:}") String baseApiUrl,
            @Value("${identitypass.radar.authorization.header:}") String radarAuthorizationHeader,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
        this.radarAuthorizationHeader = radarAuthorizationHeader;
    }

    public PhoneIntelligenceResponse phoneIntelligence(PhoneIntelligenceRequest request){
        return restClient.post(premblyApiUrls.getRadarApiUrl(), request,
                PhoneIntelligenceResponse.class,getRadarApiHeader());
    }
    public EmailIntelligenceResponse emailIntelligence(EmailIntelligenceRequest request){
        return restClient.post(premblyApiUrls.getRadarApiUrl(), request,
                EmailIntelligenceResponse.class,getRadarApiHeader());
    }
    public IpIntelligenceResponse ipIntelligence(IpIntelligenceRequest request){
        return restClient.post(premblyApiUrls.getRadarApiUrl(), request,
                IpIntelligenceResponse.class,getRadarApiHeader());
    }
    public NameIntelligenceResponse nameIntelligence(NameIntelligenceRequest request){
        return restClient.post(premblyApiUrls.getRadarApiUrl(), request,
                NameIntelligenceResponse.class,getRadarApiHeader());
    }

    private HttpHeaders getRadarApiHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization",radarAuthorizationHeader);
        return headers;
    }
}
