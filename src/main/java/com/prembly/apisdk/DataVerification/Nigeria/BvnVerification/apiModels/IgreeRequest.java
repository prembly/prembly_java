package com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IgreeRequest {
    private String number;
    private String mode;
    private String channel;
    private String otp;
    @JsonProperty("verification_method")
    private String verificationMethod;
}
