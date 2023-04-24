package com.prembly.apisdk.biometric.FaceRecognition.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Gender {
    @JsonProperty("Value")
    private String value;

    @JsonProperty("Confidence")
    private Double confidence;
}
