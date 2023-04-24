package com.prembly.apisdk.DataVerification.SouthAfrica.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessVerificationRequest {
    @JsonProperty("customer_name")
    private String customerName;
    @JsonProperty("reg_number")
    private String regNumber;
    @JsonProperty("customer_reference")
    private String customerReference;
}
