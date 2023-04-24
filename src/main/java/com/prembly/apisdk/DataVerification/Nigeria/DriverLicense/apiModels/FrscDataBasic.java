package com.prembly.apisdk.DataVerification.Nigeria.DriverLicense.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FrscDataBasic {
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("message")
    private String message;
}
