package com.prembly.apisdk.DataVerification.Nigeria.InternationalPassport.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PassportData {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("middle_name")
    private String middleName;

    @JsonProperty("dob")
    private String dateOfBirth;

    @JsonProperty("mobile")
    private String mobileNumber;

    @JsonProperty("photo")
    private String photo;

    @JsonProperty("signature")
    private String signature;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("issued_at")
    private String issuedAt;

    @JsonProperty("issued_date")
    private String issuedDate;

    @JsonProperty("expiry_date")
    private String expiryDate;

    @JsonProperty("reference_id")
    private String referenceId;

    @JsonProperty("number")
    private String number;
}
