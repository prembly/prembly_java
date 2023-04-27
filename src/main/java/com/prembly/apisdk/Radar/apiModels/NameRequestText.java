package com.prembly.apisdk.Radar.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NameRequestText {
    @JsonProperty("full_name")
    private FullName fullName;

    @JsonProperty("source")
    private String source;
}
