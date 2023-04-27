package com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AdvanceData {
    @JsonProperty("nin")
    private String nin;

    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("middlename")
    private String middleName;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("maidenname")
    private String maidenName;

    @JsonProperty("telephoneno")
    private String telephoneNo;

    @JsonProperty("state")
    private String state;

    @JsonProperty("place")
    private String place;

    @JsonProperty("title")
    private String title;

    @JsonProperty("height")
    private String height;

    @JsonProperty("email")
    private String email;

    @JsonProperty("birthdate")
    private String birthdate;

    @JsonProperty("birthstate")
    private String birthState;

    @JsonProperty("birthcountry")
    private String birthCountry;

    @JsonProperty("centralID")
    private String centralId;

    @JsonProperty("documentno")
    private String documentNo;

    @JsonProperty("educationallevel")
    private String educationalLevel;

    @JsonProperty("employmentstatus")
    private String employmentStatus;

    @JsonProperty("maritalstatus")
    private String maritalStatus;

    @JsonProperty("nok_firstname")
    private String nokFirstname;

    @JsonProperty("nok_middlename")
    private String nokMiddlename;
    @JsonProperty("nok_address1")
    private String nokAddress1;
    @JsonProperty("nok_address2")
    private String nokAddress2;
    @JsonProperty("nok_lga")
    private String nokLga;
    @JsonProperty("nok_state")
    private String nokState;
    @JsonProperty("nok_town")
    private String nokTown;
    @JsonProperty("nok_postalcode")
    private String nokPostalCode;
    @JsonProperty("othername")
    private String otherName;
    @JsonProperty("pfirstname")
    private String pFirstName;
    @JsonProperty("photo")
    private String photo;
    @JsonProperty("pmiddlename")
    private String pMiddleName;
    @JsonProperty("psurname")
    private String pSurname;
    @JsonProperty("profession")
    private String profession;
    @JsonProperty("nspokenlang")
    private String nSpokenLang;
    @JsonProperty("ospokenlang")
    private String oSpokenLang;
    @JsonProperty("religion")
    private String religion;
    @JsonProperty("residence_town")
    private String residenceTown;
    @JsonProperty("residence_lga")
    private String residenceLga;
    @JsonProperty("residence_state")
    private String residenceState;
    @JsonProperty("residencestatus")
    private String residenceStatus;
    @JsonProperty("residence_AddressLine1")
    private String residenceAddressLine1;

    @JsonProperty("residence_AddressLine2")
    private String residenceAddressLine2;

    @JsonProperty("self_origin_lga")
    private String selfOriginLga;

    @JsonProperty("self_origin_place")
    private String selfOriginPlace;

    @JsonProperty("self_origin_state")
    private String selfOriginState;

    @JsonProperty("signature")
    private String signature;

    @JsonProperty("nationality")
    private String nationality;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("trackingId")
    private String trackingId;
}
