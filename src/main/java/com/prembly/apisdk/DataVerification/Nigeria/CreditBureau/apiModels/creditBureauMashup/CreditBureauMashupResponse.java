package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.creditBureauMashup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreditBureauMashupResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("data")
    private VerificationData data;

    @JsonProperty("verification")
    private Verification verification;
}
