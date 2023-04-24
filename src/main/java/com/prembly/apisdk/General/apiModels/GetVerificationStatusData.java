package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetVerificationStatusData {
    @JsonProperty("verification_status")
    private String verificationStatus;

    @JsonProperty("billing_status")
    private Boolean billingStatus;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("response_code")
    private String responseCode;
}
