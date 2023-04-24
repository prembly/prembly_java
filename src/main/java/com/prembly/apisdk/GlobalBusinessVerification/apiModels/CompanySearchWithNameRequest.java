package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanySearchWithNameRequest {
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("company_name")
    private String companyName;
}
