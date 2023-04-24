package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import lombok.Data;

import java.util.Map;

@Data
public class Role {
    private Long id;
    private String name;
    private Long providerId;
    private String countryId;
    private Map<String,String> translation;
}
