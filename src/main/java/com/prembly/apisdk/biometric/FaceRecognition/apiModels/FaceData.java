package com.prembly.apisdk.biometric.FaceRecognition.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FaceData {
    private Boolean status;
    @JsonProperty("response_code")
    private String responseCode;
    private String message;
    private Double confidence;
}
