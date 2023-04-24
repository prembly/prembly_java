package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Company {
    @JsonProperty("name")
    private String name;

    @JsonProperty("shortName")
    private String shortName;

    @JsonProperty("brandName")
    private String brandName;

    @JsonProperty("internationalNumber")
    private String internationalNumber;

    @JsonProperty("countryCode")
    private String countryCode;
}
