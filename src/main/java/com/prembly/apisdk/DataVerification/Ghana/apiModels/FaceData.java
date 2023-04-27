package com.prembly.apisdk.DataVerification.Ghana.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FaceData {
    private Boolean status;
    private String message;
    @JsonProperty("response_code")
    private String responseCode;
    private Double confidence;
}
