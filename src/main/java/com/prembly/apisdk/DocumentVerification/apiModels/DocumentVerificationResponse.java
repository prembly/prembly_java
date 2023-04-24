package com.prembly.apisdk.DocumentVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DocumentVerificationResponse {
    private Boolean status;
    @JsonProperty("response_code")
    private String responseCode;
    private String message;
    @JsonProperty("data")
    private DocumentVerificationData data;
    @JsonProperty("verification")
    private Verification verification;
}
