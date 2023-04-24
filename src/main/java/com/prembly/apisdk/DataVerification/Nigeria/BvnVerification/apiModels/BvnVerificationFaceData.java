package com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BvnVerificationFaceData {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("message")
    private String message;
}
