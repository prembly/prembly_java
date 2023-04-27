package com.prembly.apisdk.DataVerification.Nigeria.Mashup.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BvnCreditBureauData {
    @JsonProperty("bvn_data")
    private BvnData bvnData;
    @JsonProperty("credit_data")
    private CreditData creditData;
}
