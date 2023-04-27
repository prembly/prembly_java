package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CompanySearchWithRnResponse {
    private Boolean status;
    private String message;
    @JsonProperty("data")
    private CompanySearchWithRnData data;
}
