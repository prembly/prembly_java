package com.prembly.apisdk.DataVerification.Nigeria.NINVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NinData {
    @JsonProperty("birthcountry")
    private String birthCountry;

    @JsonProperty("birthdate")
    private String birthDate;

    @JsonProperty("birthlga")
    private String birthLga;

    @JsonProperty("birthstate")
    private String birthState;

    @JsonProperty("centralID")
    private String centralId;

    @JsonProperty("educationallevel")
    private String educationalLevel;

    @JsonProperty("email")
    private String email;

    @JsonProperty("emplymentstatus")
    private String employmentStatus;

    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("heigth")
    private String height;

    @JsonProperty("maritalstatus")
    private String maritalStatus;

    @JsonProperty("nin")
    private String nin;

    @JsonProperty("nok_address1")
    private String nokAddress1;

    @JsonProperty("nok_address2")
    private String nokAddress2;

    @JsonProperty("nok_firstname")
    private String nokFirstName;

    @JsonProperty("nok_lga")
    private String nokLga;

    @JsonProperty("nok_middlename")
    private String nokMiddleName;

    @JsonProperty("nok_postalcode")
    private String nokPostalCode;

    @JsonProperty("nok_state")
    private String nokState;

    @JsonProperty("nok_surname")
    private String nokSurname;

    @JsonProperty("nok_town")
    private String nokTown;

    @JsonProperty("nspokenlang")
    private String nSpokenLang;

    @JsonProperty("ospokenlang")
    private String oSpokenLang;

    @JsonProperty("pfirstname")
    private String pFirstName;

    @JsonProperty("photo")
    private String photo;

    @JsonProperty("pmiddlename")
    private String pMiddleName;

    @JsonProperty("profession")
    private String profession;

    @JsonProperty("psurname")
    private String pSurname;

    @JsonProperty("religion")
    private String religion;

    @JsonProperty("residence_address")
    private String residenceAddress;

    @JsonProperty("residence_Town")
    private String residenceTown;

    @JsonProperty("residence_lga")
    private String residenceLga;

    @JsonProperty("residence_state")
    private String residenceState;

    @JsonProperty("residencestatus")
    private String residenceStatus;

    @JsonProperty("self_origin_lga")
    private String selfOriginLga;

    @JsonProperty("self_origin_place")
    private String selfOriginPlace;

    @JsonProperty("self_origin_state")
    private String selfOriginState;

    @JsonProperty("signature")
    private String signature;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("telephoneno")
    private String telephoneNo;

    @JsonProperty("title")
    private String title;
}
