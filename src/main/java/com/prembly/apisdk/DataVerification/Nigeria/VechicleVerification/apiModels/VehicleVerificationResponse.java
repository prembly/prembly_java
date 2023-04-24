package com.prembly.apisdk.DataVerification.Nigeria.VechicleVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class VehicleVerificationResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private VehicleData data;

    @JsonProperty("verification")
    private Verification verification;
}

