package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import lombok.Data;

import java.util.Map;

@Data
public class CompanyType {
    private Integer id;
    private String type;
    private Integer countryId;
    private Map<String, String> translation;
}
