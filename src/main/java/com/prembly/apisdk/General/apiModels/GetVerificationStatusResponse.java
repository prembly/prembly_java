package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetVerificationStatusResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("data")
    private GetVerificationStatusData data;
}
