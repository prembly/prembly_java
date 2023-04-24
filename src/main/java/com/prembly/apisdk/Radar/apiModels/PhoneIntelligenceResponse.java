package com.prembly.apisdk.Radar.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PhoneIntelligenceResponse {
    private String code;
    private String message;
    private Boolean status;
    @JsonProperty("data")
    private PhoneIntelligenceData data;
}
