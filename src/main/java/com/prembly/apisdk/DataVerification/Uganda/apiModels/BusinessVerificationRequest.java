package com.prembly.apisdk.DataVerification.Uganda.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessVerificationRequest {
    @JsonProperty("customer_reference")
    private String customerReference;
    @JsonProperty("customer_name")
    private String customerName;
    @JsonProperty("reservation_number")
    private String reservationNumber;
}
