package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommercialBasicRequest {
    @JsonProperty("rc_number")
    private String rcNumber;
    @JsonProperty("customer_name")
    private String customerName;
    @JsonProperty("customer_reference")
    private String customerReference;
}
