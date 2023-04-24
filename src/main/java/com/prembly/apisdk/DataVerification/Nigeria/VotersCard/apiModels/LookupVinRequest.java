package com.prembly.apisdk.DataVerification.Nigeria.VotersCard.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LookupVinRequest {
    private String state;
    @JsonProperty("last_name")
    private String lastName;
    private String number;
}
