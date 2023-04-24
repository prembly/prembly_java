package com.prembly.apisdk.DataVerification.Nigeria.BankAccount.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ComparismData {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("confidence")
    private double confidence;
}
