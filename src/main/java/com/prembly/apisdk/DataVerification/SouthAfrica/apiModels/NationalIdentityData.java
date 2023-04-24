package com.prembly.apisdk.DataVerification.SouthAfrica.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NationalIdentityData {
    @JsonProperty("completename")
    private String completeName;

    @JsonProperty("formofaddress")
    private String formOfAddress;

    @JsonProperty("qualificationpreceding")
    private String qualificationPreceding;

    @JsonProperty("givenfullname")
    private String givenFullName;

    @JsonProperty("givennameinitials")
    private String givenNameInitials;

    @JsonProperty("qualification_int_first")
    private String qualificationIntFirst;

    @JsonProperty("surname_prefix_first")
    private String surnamePrefixFirst;

    @JsonProperty("surname_first")
    private String surnameFirst;

    @JsonProperty("indicator")
    private String indicator;

    @JsonProperty("qualification_int_second")
    private String qualificationIntSecond;

    @JsonProperty("surname_prefix_second")
    private String surnamePrefixSecond;

    @JsonProperty("qualification_suceeding")
    private String qualificationSucceeding;

    @JsonProperty("name_qualified")
    private String nameQualified;

    @JsonProperty("function")
    private String function;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("nationality")
    private String nationality;

    @JsonProperty("nationalid")
    private String nationalId;

    @JsonProperty("organization_name")
    private String organizationName;

    @JsonProperty("dob")
    private String dateOfBirth;

    @JsonProperty("businessid")
    private String businessId;

    @JsonProperty("contact_type")
    private String contactType;

    @JsonProperty("countryCode")
    private String countryCode;

    @JsonProperty("passport")
    private String passport;

    @JsonProperty("contactType")
    private String contactType2;

    @JsonProperty("nameQualified")
    private String nameQualified2;

    @JsonProperty("organizationName")
    private String organizationName2;

    @JsonProperty("qualificationIntFirst")
    private String qualificationIntFirst2;

    @JsonProperty("qualificationIntSecond")
    private String qualificationIntSecond2;

    @JsonProperty("qualificationSuceeding")
    private String qualificationSucceeding2;

    @JsonProperty("surnameFirst")
    private String surnameFirst2;

    @JsonProperty("surnamePrefixFirst")
    private String surnamePrefixFirst2;

    @JsonProperty("surnamePrefixSecond")
    private String surnamePrefixSecond2;
}
