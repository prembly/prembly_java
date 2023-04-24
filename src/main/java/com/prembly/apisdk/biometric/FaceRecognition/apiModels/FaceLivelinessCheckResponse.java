package com.prembly.apisdk.biometric.FaceRecognition.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FaceLivelinessCheckResponse {
    private Boolean status;
    private String detail;
    private Double confidence;
    @JsonProperty("confidence_in_percentage")
    private Double confidenceInPercentage;
    private Verification verification;
}
