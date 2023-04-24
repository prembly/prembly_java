package com.prembly.apisdk.DataVerification.Ghana.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InternationalPassportResponse {
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("message")
    private String message;
    @JsonProperty("response_code")
    private String responseCode;
    @JsonProperty("data")
    private InternationalPassportData data;
    private Verification verification;
}
