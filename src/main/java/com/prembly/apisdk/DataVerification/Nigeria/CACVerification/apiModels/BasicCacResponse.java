package com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BasicCacResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("data")
    private BasicVerificationData data;

    @JsonProperty("verification")
    private Verification verification;
}
