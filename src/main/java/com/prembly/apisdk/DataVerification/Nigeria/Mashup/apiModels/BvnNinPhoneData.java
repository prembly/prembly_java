package com.prembly.apisdk.DataVerification.Nigeria.Mashup.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BvnNinPhoneData {
    @JsonProperty("bvn")
    private String bvn;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("middleName")
    private String middleName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("dateOfBirth")
    private String dateOfBirth;

    @JsonProperty("registrationDate")
    private String registrationDate;

    @JsonProperty("enrollmentBank")
    private String enrollmentBank;

    @JsonProperty("enrollmentBranch")
    private String enrollmentBranch;

    @JsonProperty("email")
    private String email;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("levelOfAccount")
    private String levelOfAccount;

    @JsonProperty("lgaOfOrigin")
    private String lgaOfOrigin;

    @JsonProperty("lgaOfResidence")
    private String lgaOfResidence;

    @JsonProperty("maritalStatus")
    private String maritalStatus;

    @JsonProperty("nin")
    private NinData nin;

    @JsonProperty("nameOnCard")
    private String nameOnCard;

    @JsonProperty("nationality")
    private String nationality;

    @JsonProperty("phoneNumber1")
    private String phoneNumber1;

    @JsonProperty("phoneNumber2")
    private String phoneNumber2;

    @JsonProperty("residentialAddress")
    private String residentialAddress;

    @JsonProperty("stateOfOrigin")
    private String stateOfOrigin;

    @JsonProperty("stateOfResidence")
    private String stateOfResidence;

    @JsonProperty("watchListed")
    private String watchListed;

    @JsonProperty("base64Image")
    private String base64Image;

    @JsonProperty("title")
    private String title;
}
