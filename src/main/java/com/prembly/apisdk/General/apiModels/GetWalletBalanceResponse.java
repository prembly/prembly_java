package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetWalletBalanceResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("balance")
    private Double balance;
}
