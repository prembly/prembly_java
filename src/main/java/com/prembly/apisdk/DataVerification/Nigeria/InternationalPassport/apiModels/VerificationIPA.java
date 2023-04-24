package com.prembly.apisdk.DataVerification.Nigeria.InternationalPassport.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VerificationIPA {
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("reference")
    private String reference;
}
