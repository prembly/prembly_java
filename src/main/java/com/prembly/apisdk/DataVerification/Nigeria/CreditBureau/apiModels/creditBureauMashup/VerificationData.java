package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.creditBureauMashup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VerificationData {
    @JsonProperty("first_central")
    private Object firstCentral;
    @JsonProperty("credit_bureau")
    private Object creditBureau;
}
