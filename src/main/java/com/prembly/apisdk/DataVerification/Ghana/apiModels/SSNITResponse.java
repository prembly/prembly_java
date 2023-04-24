package com.prembly.apisdk.DataVerification.Ghana.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SSNITResponse {
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("message")
    private String message;
    @JsonProperty("response_code")
    private String responseCode;
    @JsonProperty("face_data")
    private FaceData faceData;
    @JsonProperty("data")
    private SSNITData data;
    private Verification verification;
}
