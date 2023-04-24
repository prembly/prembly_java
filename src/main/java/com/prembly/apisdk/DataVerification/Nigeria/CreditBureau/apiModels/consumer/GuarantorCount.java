package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GuarantorCount {
    @JsonProperty("GuarantorsSecured")
    private String guarantorsSecured;

    @JsonProperty("Accounts")
    private String accounts;
}
