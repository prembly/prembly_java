package com.prembly.apisdk.DataVerification.Nigeria.TINVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TINVerificationResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("data")
    private TINVerificationData data;

    @JsonProperty("verification")
    private TINVerificationStatus verification;
}
