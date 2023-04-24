package com.prembly.apisdk.DataVerification.Nigeria.Mashup.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BvnCreditBureauResponse {
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("response_code")
    private String responseCode;
    @JsonProperty("data")
    private BvnCreditBureauData data;
    private Verification verification;
}
