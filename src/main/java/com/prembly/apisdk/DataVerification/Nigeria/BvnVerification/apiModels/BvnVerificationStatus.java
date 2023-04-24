package com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BvnVerificationStatus {
    @JsonProperty("status")
    private String status;

    @JsonProperty("reference")
    private String reference;
}
