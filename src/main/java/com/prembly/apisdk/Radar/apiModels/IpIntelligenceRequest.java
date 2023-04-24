package com.prembly.apisdk.Radar.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IpIntelligenceRequest {
    @JsonProperty("ip_address")
    private String ipAddress;
}
