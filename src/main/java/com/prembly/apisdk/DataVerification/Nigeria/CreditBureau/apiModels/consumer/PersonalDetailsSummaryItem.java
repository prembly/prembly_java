package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PersonalDetailsSummaryItem {
    @JsonProperty("ConsumerID")
    private String consumerId;

    @JsonProperty("Header")
    private String header;

    @JsonProperty("ReferenceNo")
    private String referenceNo;

    @JsonProperty("Nationality")
    private String nationality;

    @JsonProperty("NationalIDNo")
    private String nationalIdNo;

    @JsonProperty("PassportNo")
    private String passportNo;

    @JsonProperty("DriversLicenseNo")
    private String driversLicenseNo;

    @JsonProperty("BankVerificationNo")
    private String bankVerificationNo;

    @JsonProperty("PencomIDNo")
    private String pencomIdNo;

    @JsonProperty("OtheridNo")
    private String otherIdNo;

    @JsonProperty("BirthDate")
    private String birthDate;

    @JsonProperty("Dependants")
    private String dependants;

    @JsonProperty("Gender")
    private String gender;

    @JsonProperty("MaritalStatus")
    private String maritalStatus;

    @JsonProperty("ResidentialAddress1")
    private String residentialAddress1;

    @JsonProperty("ResidentialAddress2")
    private String residentialAddress2;

    @JsonProperty("ResidentialAddress3")
    private String residentialAddress3;

    @JsonProperty("ResidentialAddress4")
    private String residentialAddress4;

    @JsonProperty("PostalAddress1")
    private String postalAddress1;

    @JsonProperty("PostalAddress2")
    private String postalAddress2;

    @JsonProperty("PostalAddress3")
    private String postalAddress3;

    @JsonProperty("PostalAddress4")
    private String postalAddress4;

    @JsonProperty("HomeTelephoneNo")
    private String homeTelephoneNo;

    @JsonProperty("WorkTelephoneNo")
    private String workTelephoneNo;

    @JsonProperty("CellularNo")
    private String cellularNo;

    @JsonProperty("EmailAddress")
    private String emailAddress;

    @JsonProperty("EmployerDetail")
    private String employerDetail;

    @JsonProperty("PropertyOwnedType")
    private String propertyOwnedType;

    @JsonProperty("Surname")
    private String surname;

    @JsonProperty("FirstName")
    private String firstName;

    @JsonProperty("OtherNames")
    private String otherNames;
}
