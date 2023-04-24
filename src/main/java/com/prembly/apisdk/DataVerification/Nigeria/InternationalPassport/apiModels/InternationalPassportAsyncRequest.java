package com.prembly.apisdk.DataVerification.Nigeria.InternationalPassport.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternationalPassportAsyncRequest {
    private String number;
    @JsonProperty("last_name")
    private String lastName;
}
