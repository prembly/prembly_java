package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanySearchWithStringsRequest {
    private String query;
    @JsonProperty("customer_name")
    private String customerName;
    @JsonProperty("customer_reference")
    private String customer_reference;
}
