package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Associate {
    @JsonProperty("reference_number")
    private String referenceNumber;

    @JsonProperty("forename")
    private String forename;

    @JsonProperty("name")
    private String name;

    @JsonProperty("date_of_birth")
    private String dateOfBirth;
}
