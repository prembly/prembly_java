package com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BasicCacDirector {
    @JsonProperty("name")
    private String name;

    @JsonProperty("designation")
    private String designation;
}
