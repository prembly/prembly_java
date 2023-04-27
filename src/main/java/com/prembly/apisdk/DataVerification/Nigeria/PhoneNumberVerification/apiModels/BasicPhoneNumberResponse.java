package com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BasicPhoneNumberResponse {
    private Boolean status;
    @JsonProperty("response_code")
    private String responseCode;
    private String message;
    @JsonProperty("data")
    private BasicData data;
    private Verification verification;
}
