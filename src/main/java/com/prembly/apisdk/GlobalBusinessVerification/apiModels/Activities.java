package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import lombok.Data;

import java.util.Map;

@Data
public class Activities {
    private Integer id;
    private String providerId;
    private String providerName;
    private String countryId;
    private String createdAt;
    private Map<String,String> translation;
    private String isicId;
    private String naceId;
    private Type type;
    private String nace;
}
