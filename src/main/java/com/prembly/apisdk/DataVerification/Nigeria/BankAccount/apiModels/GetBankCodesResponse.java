package com.prembly.apisdk.DataVerification.Nigeria.BankAccount.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GetBankCodesResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("message")
    private String message;

    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("data")
    private List<BankCode> data;
}
