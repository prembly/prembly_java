package com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels;

import lombok.Data;

@Data
public class AffiliatesResidentialAddress {
    private String country;
    private String state;
    private String lga;
    private String city;
    private String address;
    private String streetNumber;
    private String postcode;
    private Boolean hideResidentialAddress;
    private String affiliateType;
}
