package com.prembly.apisdk.Radar.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IpRequestText {
    @JsonProperty("ip_address")
    private String ipAddress;
}
