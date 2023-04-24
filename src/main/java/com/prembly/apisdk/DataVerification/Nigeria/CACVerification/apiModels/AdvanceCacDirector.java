package com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels;

import lombok.Data;

@Data
public class AdvanceCacDirector {
    private String surname;
    private String firstname;
    private String otherName;
    private String email;
    private String phoneNumber;
    private String gender;
    private String formerNationality;
    private String city;
    private String occupation;
    private String formerName;
    private String corporationName;
    private String rcNumber;
    private String state;
    private String accreditationnumber;
    private String formType;
    private String numSharesAlloted;
    private String typeOfShares;
    private String dateOfBirth;
    private String dateOfAppointment;
    private String status;
    private String formerSurname;
    private String formerFirstName;
    private String formerOtherName;
    private String identityNumber;
    private String otherDirectorshipDetails;
    private AffiliateTypeFk affiliateTypeFk;
    private CountryFk countryFk;
    private String lga;
    private Boolean isCorporate;
    private String nationality;
    private String address;
    private String streetNumber;
    private String isChairman;
    private String isDesignated;
    private String postcode;
    private String formerNameType;
    private AffiliatesResidentialAddress affiliatesResidentialAddress;
    private String affiliatesPscInformation;
    private String isPublicUser;
}
