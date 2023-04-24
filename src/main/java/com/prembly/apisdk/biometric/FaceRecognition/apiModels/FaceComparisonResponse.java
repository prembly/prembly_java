package com.prembly.apisdk.biometric.FaceRecognition.apiModels;

import lombok.Data;

@Data
public class FaceComparisonResponse {
    private Boolean status;
    private String message;
    private Double confidence;
    private Verification verification;
}
