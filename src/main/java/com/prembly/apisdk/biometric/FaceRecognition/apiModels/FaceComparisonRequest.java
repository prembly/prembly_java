package com.prembly.apisdk.biometric.FaceRecognition.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaceComparisonRequest {
    @JsonProperty("image_one")
    private String imageOne;
    @JsonProperty("image_two")
    private String imageTwo;
}
