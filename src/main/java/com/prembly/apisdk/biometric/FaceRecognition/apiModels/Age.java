package com.prembly.apisdk.biometric.FaceRecognition.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Age {
    @JsonProperty("Low")
    private Integer low;

    @JsonProperty("High")
    private Integer high;
}
