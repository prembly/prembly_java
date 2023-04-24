package com.prembly.apisdk.DataVerification.SouthAfrica.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NationalIdentityResponse {
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("message")
    private String message;
    @JsonProperty("response_code")
    private String responseCode;
    @JsonProperty("data")
    private NationalIdentityData data;
}
