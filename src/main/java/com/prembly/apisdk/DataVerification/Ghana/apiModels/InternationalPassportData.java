package com.prembly.apisdk.DataVerification.Ghana.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InternationalPassportData {
    @JsonProperty("PassportNo")
    private String passportNo;

    @JsonProperty("FirstName")
    private String firstName;

    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("MiddleName")
    private String middleName;

    @JsonProperty("Nationality")
    private String nationality;

    @JsonProperty("DateOfBirth")
    private String dateOfBirth;

    @JsonProperty("Gender")
    private String gender;

    @JsonProperty("PlaceOfBirth")
    private String placeOfBirth;

    @JsonProperty("PlaceOfIssue")
    private String placeOfIssue;

    @JsonProperty("IssueDate")
    private String issueDate;

    @JsonProperty("ExpiryDate")
    private String expiryDate;

    @JsonProperty("Picture")
    private String picture;

    @JsonProperty("Signature")
    private String signature;
}
