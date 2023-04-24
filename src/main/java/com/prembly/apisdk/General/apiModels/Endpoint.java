package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Endpoint {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("code")
    private String code;

    @JsonProperty("country_endpoint")
    private List<CountryEndpoint> countryEndpoints;
}
