package com.prembly.apisdk.Radar.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmailIntelligenceData {
    private Integer id;
    @JsonProperty("request_text")
    private EmailRequestText requestText;
    @JsonProperty("request_file")
    private String requestFileUrl;
    @JsonProperty("response_file")
    private String responseFileUrl;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
}
