package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VehicleWarranty {
    @JsonProperty("type")
    private String type;

    @JsonProperty("warranty")
    private String warranty;

    @JsonProperty("estimated_remainings")
    private String estimatedRemainings;
}
