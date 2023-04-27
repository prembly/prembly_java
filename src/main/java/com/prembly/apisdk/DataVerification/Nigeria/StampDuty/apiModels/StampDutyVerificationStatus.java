package com.prembly.apisdk.DataVerification.Nigeria.StampDuty.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StampDutyVerificationStatus {
    @JsonProperty("status")
    private String status;
    @JsonProperty("reference")
    private String reference;
}
