package com.prembly.apisdk.DataVerification.Nigeria.NINVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LookUpVirtualNINRequest {
    private String number;
    @JsonProperty("number_nin")
    private String numberNin;
}
