package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import lombok.Data;

import java.util.Map;

@Data
public class CompanyStatus {
    private Long id;
    private String providerId;
    private String providerName;
    private Integer countryId;
    private Map<String, String> translation;
}
