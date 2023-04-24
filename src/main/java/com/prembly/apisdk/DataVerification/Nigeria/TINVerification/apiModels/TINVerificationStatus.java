package com.prembly.apisdk.DataVerification.Nigeria.TINVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TINVerificationStatus {
    @JsonProperty("status")
    private String status;

    @JsonProperty("reference")
    private String reference;
}
