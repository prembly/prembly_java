package com.prembly.apisdk.DataVerification.Uganda.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BusinessVerificationResponse {
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("response_code")
    private String responseCode;
    @JsonProperty("data")
    private BusinessVerificationData data;
}
