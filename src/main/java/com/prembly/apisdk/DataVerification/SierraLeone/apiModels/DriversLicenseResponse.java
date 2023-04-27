package com.prembly.apisdk.DataVerification.SierraLeone.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DriversLicenseResponse {
    @JsonProperty("status")
    private boolean status;

    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private DriversLicenseData data;
}
