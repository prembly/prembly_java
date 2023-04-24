package com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AdvancePhoneNumberResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("data")
    private AdvanceData data;

    @JsonProperty("verification")
    private Verification verification;

}
