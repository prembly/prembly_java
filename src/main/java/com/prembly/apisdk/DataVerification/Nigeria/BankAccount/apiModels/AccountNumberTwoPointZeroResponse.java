package com.prembly.apisdk.DataVerification.Nigeria.BankAccount.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccountNumberTwoPointZeroResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("account_data")
    private AccountNumberTwoPointZeroData accountData;

    @JsonProperty("verification")
    private Verification verification;
}
