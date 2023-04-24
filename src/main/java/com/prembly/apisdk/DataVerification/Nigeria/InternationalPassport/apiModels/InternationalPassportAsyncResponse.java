package com.prembly.apisdk.DataVerification.Nigeria.InternationalPassport.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InternationalPassportAsyncResponse {
    private Boolean status;
    @JsonProperty("response_code")
    private String responseCode;
    @JsonProperty("verification")
    private VerificationIPA verificationIPA;
}
