package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Alias {
    @JsonProperty("qualification")
    private String qualification;

    @JsonProperty("forename")
    private String forename;

    @JsonProperty("country_of_birth_id")
    private String countryOfBirthId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("date_of_birth")
    private String dateOfBirth;

    @JsonProperty("name_in_original_script")
    private String nameInOriginalScript;

    @JsonProperty("forename_in_original_script")
    private String forenameInOriginalScript;

    @JsonProperty("place_of_birth")
    private String placeOfBirth;
}
