package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MarketAnalysis {
    @JsonProperty("time_period")
    private String timePeriod;

    @JsonProperty("certainty")
    private String certainty;
}
