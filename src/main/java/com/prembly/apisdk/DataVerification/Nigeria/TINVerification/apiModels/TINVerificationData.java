package com.prembly.apisdk.DataVerification.Nigeria.TINVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TINVerificationData {
    @JsonProperty("taxpayer_name")
    private String taxpayerName;

    @JsonProperty("cac_reg_number")
    private String cacRegNumber;

    @JsonProperty("firstin")
    private String firstin;

    @JsonProperty("jittin")
    private String jittin;

    @JsonProperty("tax_office")
    private String taxOffice;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone_number")
    private String phoneNumber;
}
