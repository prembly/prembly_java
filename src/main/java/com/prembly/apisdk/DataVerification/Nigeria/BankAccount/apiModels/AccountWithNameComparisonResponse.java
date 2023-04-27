package com.prembly.apisdk.DataVerification.Nigeria.BankAccount.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccountWithNameComparisonResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("account_data")
    private AccountComparisonData accountData;

    @JsonProperty("comparism_data")
    private ComparismData comparismData;

    @JsonProperty("verification")
    private Verification verification;
}
