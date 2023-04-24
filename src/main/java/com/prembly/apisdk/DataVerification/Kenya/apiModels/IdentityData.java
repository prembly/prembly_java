package com.prembly.apisdk.DataVerification.Kenya.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IdentityData {
    @JsonProperty("identity_type")
    private String identityType;

    @JsonProperty("identity_number")
    private String identityNumber;

    @JsonProperty("identity_name")
    private String identityName;

    @JsonProperty("date_of_birth")
    private String dateOfBirth;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("photo")
    private String photo;

    @JsonProperty("transaction_id")
    private String transactionId;

    @JsonProperty("usr_password")
    private String password;

    @JsonProperty("place_of_birth")
    private String placeOfBirth;

    @JsonProperty("place_of_live")
    private String placeOfLive;

    @JsonProperty("date_of_issue")
    private String dateOfIssue;

    @JsonProperty("id_serial_number")
    private String idSerialNumber;

    @JsonProperty("expiry_date")
    private String expiryDate;

    @JsonProperty("signature")
    private String signature;
}
