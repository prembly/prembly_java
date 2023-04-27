package com.prembly.apisdk.DataVerification.Nigeria.NINVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LookUpNINWithFaceResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("face_data")
    private FaceData faceData;

    @JsonProperty("nin_data")
    private NinData ninData;

    @JsonProperty("verification")
    private Verification verification;
}
