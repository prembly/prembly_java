package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmailVerificationResponse {
    private Boolean status;
    @JsonProperty("response_code")
    private String responseCode;
    private String detail;
    private EmailVerificationData data;
    private Verification verification;
}
