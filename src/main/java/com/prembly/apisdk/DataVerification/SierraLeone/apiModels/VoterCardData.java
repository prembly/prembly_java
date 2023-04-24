package com.prembly.apisdk.DataVerification.SierraLeone.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VoterCardData {
    @JsonProperty("IdNumber")
    private String idNumber;

    @JsonProperty("CenterCode")
    private String centerCode;

    @JsonProperty("Ward")
    private String ward;

    @JsonProperty("Constituency")
    private String constituency;

    @JsonProperty("District")
    private String district;

    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("OtherNames")
    private String otherNames;

    @JsonProperty("Sex")
    private String sex;

    @JsonProperty("DateOfBirth")
    private String dateOfBirth;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("Village")
    private String village;

    @JsonProperty("Picture")
    private String picture;
}
