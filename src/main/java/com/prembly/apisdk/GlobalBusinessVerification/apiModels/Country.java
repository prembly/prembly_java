package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Country {
    private int id;
    private String name;
    private List<String> deadCompanyStatus;
    private List<String> liquidatedCompanyStatus;
    private List<String> liquidationCompanyStatus;
    private List<String> bankruptcyProcessCompanyStatus;
    private List<String> reservationCompanyStatus;
    private List<String> formationCompanyStatus;
    private String code;
    private String currency;
    private List<CountrySource> sources;
    private Map<String, String> translation;
    private Map<String, String> fromCountry;
    private Integer companiesCount;
    private Integer parentId;
    private Integer activeCompaniesCount;
}
