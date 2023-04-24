package com.prembly.apisdk.DataVerification.Kenya.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdentityRequest {
    @JsonProperty("customer_name")
    private String customerName;
    @JsonProperty("customer_reference")
    private String customerReference;
    private String number;
}
