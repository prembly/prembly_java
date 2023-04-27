package com.prembly.apisdk.Radar.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmailIntelligenceResponse {
    private String code;
    private String message;
    private Boolean status;
    @JsonProperty("data")
    private EmailIntelligenceData data;
}
