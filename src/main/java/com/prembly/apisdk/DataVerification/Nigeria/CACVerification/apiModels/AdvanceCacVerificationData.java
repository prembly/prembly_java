package com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AdvanceCacVerificationData {
    @JsonProperty("rc_number")
    private String rcNumber;

    @JsonProperty("company_name")
    private String companyName;

    @JsonProperty("email_address")
    private String emailAddress;

    @JsonProperty("branchAddress")
    private String branchAddress;

    @JsonProperty("city")
    private String city;

    @JsonProperty("address")
    private String address;

    @JsonProperty("company_status")
    private String companyStatus;

    @JsonProperty("lga")
    private String lga;

    @JsonProperty("date_of_registration")
    private String dateOfRegistration;

    @JsonProperty("state")
    private String state;

    @JsonProperty("directors")
    private List<AdvanceCacDirector> directors;
}
