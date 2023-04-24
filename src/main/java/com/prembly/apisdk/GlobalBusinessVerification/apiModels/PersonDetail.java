package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import lombok.Data;

@Data
public class PersonDetail {
    private Integer id;
    private String name;
    private Integer countryId;
    private String occupation;
    private String nationality;
    private String birthYear;
    private String birthMonth;
    private String birthDate;
    private String address;
    private String countryOfResidence;
    private String honorific;
    private String number;
    private Boolean isForeign;
    private String documentType;
    private String documentIssuedOn;
    private String documentIssuedBy;
    private String documentNumber;
    private Boolean hideAddress;
    private String email;
    private String phone;
    private String countryCode;
}
