package com.prembly.apisdk.biometric.FaceRecognition.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AgeAndGenderResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private AgeAndGenderData data;
}
