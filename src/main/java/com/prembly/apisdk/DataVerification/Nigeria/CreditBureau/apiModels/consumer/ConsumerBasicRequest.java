package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerBasicRequest {
    private String mode;
    private String number;
    private String dob;
    @JsonProperty("customer_name")
    private String customerName;
    @JsonProperty("customer_reference")
    private String customerReference;
}
