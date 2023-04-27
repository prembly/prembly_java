package com.prembly.apisdk.DataVerification.Nigeria.VotersCard.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VcData {
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("vin")
    private String vin;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("occupation")
    private String occupation;
    @JsonProperty("timeOfRegistration")
    private String timeOfRegistration;
    @JsonProperty("state")
    private String state;
    @JsonProperty("lga")
    private String lga;
    @JsonProperty("registrationAreaWard")
    private String registrationAreaWard;
    @JsonProperty("pollingUnit")
    private String pollingUnit;
    @JsonProperty("pollingUnitCode")
    private String pollingUnitCode;
    @JsonProperty("date_of_birth")
    private String dateOfBirth;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
}

