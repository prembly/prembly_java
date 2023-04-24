package com.prembly.apisdk.DataVerification.Nigeria.DriverLicense.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FrscDataDLI {
    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("licenseNo")
    private String licenseNo;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("middleName")
    private String middleName;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("issuedDate")
    private String issuedDate;

    @JsonProperty("expiryDate")
    private String expiryDate;

    @JsonProperty("stateOfIssue")
    private String stateOfIssue;

    @JsonProperty("birthDate")
    private String birthDate;

    @JsonProperty("photo")
    private String photo;
}
