package com.prembly.apisdk.Radar.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NameIntelligenceData {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("request_text")
    private NameRequestText requestText;

    @JsonProperty("request_file")
    private String requestFile;

    @JsonProperty("response_file")
    private String responseFile;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;
}
