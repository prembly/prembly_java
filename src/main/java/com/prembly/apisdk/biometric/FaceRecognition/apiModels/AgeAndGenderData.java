package com.prembly.apisdk.biometric.FaceRecognition.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AgeAndGenderData {
    @JsonProperty("age")
    private Age age;

    @JsonProperty("gender")
    private Gender gender;
}
