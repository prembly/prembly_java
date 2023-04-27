package com.prembly.apisdk.Radar.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FullName {
    @JsonProperty("value")
    private String value;

    @JsonProperty("check_type")
    private String[] checkType;

    @JsonProperty("date_of_birth")
    private String dateOfBirth;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("source")
    private String source;
}
