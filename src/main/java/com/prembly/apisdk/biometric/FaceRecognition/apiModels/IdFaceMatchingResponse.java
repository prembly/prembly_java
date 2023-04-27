package com.prembly.apisdk.biometric.FaceRecognition.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IdFaceMatchingResponse {
    private Boolean status;
    @JsonProperty("response_code")
    private String responseCode;
    private String detail;
    @JsonProperty("face_data")
    private FaceData faceData;
    @JsonProperty("data")
    private UserData data;
}
