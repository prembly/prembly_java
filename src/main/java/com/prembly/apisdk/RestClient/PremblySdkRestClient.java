package com.prembly.apisdk.RestClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PremblySdkRestClient {

    private RestTemplate restTemplate;
    private final String apiKey;
    private final String appId;

    public PremblySdkRestClient(RestTemplate restTemplate,
                                @Value("${identitypass.api.id}") String appId,
                                @Value("${identitypass.api.key}") String apiKey) {
        this.restTemplate = restTemplate;
        this.apiKey = apiKey;
        this.appId = appId;
    }

    public <T> T get(String url, Class<T> responseType) {
        HttpHeaders headers = getHeaders();
        HttpEntity<Void> entity = new HttpEntity<>(headers);
        ResponseEntity<T> responseEntity = restTemplate.exchange(
                url, HttpMethod.GET, entity, responseType);
        return  responseEntity.getBody();
    }

    public <T> T post(String url, Object requestObject, Class<T> responseType) {
        HttpHeaders headers = getHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(requestObject, headers);
        ResponseEntity<T> responseEntity = restTemplate.postForEntity(url, entity, responseType);
        return responseEntity.getBody();
    }

    public <T> T post(String url, Object requestObject, Class<T> responseType,HttpHeaders headers) {
        HttpEntity<Object> entity = new HttpEntity<>(requestObject, headers);
        ResponseEntity<T> responseEntity = restTemplate.postForEntity(url, entity, responseType);
        return responseEntity.getBody();
    }

    private HttpHeaders getHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-api-key", apiKey);
        headers.set("app-id", appId);
        return headers;
    }
}

