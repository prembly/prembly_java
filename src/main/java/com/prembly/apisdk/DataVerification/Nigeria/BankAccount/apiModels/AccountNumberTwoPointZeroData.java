package com.prembly.apisdk.DataVerification.Nigeria.BankAccount.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccountNumberTwoPointZeroData {
    @JsonProperty("account_currency")
    private String accountCurrency;

    @JsonProperty("account_name")
    private String accountName;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("other_names")
    private String otherNames;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("account_type")
    private String accountType;

    @JsonProperty("address_1")
    private String address1;

    @JsonProperty("address_2")
    private String address2;

    private String city;
    private String phone;

    @JsonProperty("postal_code")
    private String postalCode;

    @JsonProperty("state_code")
    private String stateCode;

    @JsonProperty("country_code")
    private String countryCode;
    private String nationality;

    @JsonProperty("country_of_birth")
    private String countryOfBirth;

    @JsonProperty("country_of_issue")
    private String countryOfIssue;

    private String dob;

    @JsonProperty("expiry_date")
    private String expiryDate;

    @JsonProperty("identity_number")
    private String identityNumber;

    @JsonProperty("identity_type")
    private String identityType;
}
