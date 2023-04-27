package com.prembly.apisdk.DataVerification.SierraLeone.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DriversLicenseData {
    @JsonProperty("idnumber")
    private String idNumber;

    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("surname")
    private String surName;

    @JsonProperty("middlename")
    private String middleName;

    @JsonProperty("dateofbirth")
    private String dateOfBirth;

    @JsonProperty("placeofbirth")
    private String placeOfBirth;

    @JsonProperty("residentialaddress")
    private String residentialAddress;

    @JsonProperty("expirydate")
    private String expiryDate;

    @JsonProperty("issuedate")
    private String issueDate;

    @JsonProperty("idclass")
    private String idClass;

    @JsonProperty("issuesignature")
    private String issueSignature;

    @JsonProperty("signature")
    private String signature;

    @JsonProperty("frontportrait")
    private String frontPortrait;
}
