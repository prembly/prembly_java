package com.prembly.apisdk.DataVerification.SouthAfrica.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BusinessVerificationData {
    @JsonProperty("name")
    private String name;

    @JsonProperty("registration_number")
    private String registrationNumber;

    @JsonProperty("company_type")
    private String companyType;

    @JsonProperty("region")
    private String region;

    @JsonProperty("no_of_directors")
    private String noOfDirectors;
}
