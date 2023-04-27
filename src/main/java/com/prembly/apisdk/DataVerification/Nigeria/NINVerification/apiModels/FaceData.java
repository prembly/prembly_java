package com.prembly.apisdk.DataVerification.Nigeria.NINVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FaceData {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("message")
    private String message;
}
