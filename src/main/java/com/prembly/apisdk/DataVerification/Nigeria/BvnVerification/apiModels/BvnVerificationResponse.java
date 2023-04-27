package com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BvnVerificationResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("face_data")
    private BvnVerificationFaceData faceData;

    @JsonProperty("bvn_data")
    private BvnVerificationData bvnData;

    @JsonProperty("verification")
    private BvnVerificationStatus verification;
}
