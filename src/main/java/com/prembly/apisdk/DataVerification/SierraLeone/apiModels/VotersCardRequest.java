package com.prembly.apisdk.DataVerification.SierraLeone.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VotersCardRequest {
    @JsonProperty("search_mode")
    private String searchMode;
    private String number;
    @JsonProperty("firstname")
    private String firstName;
    @JsonProperty("lastname")
    private String lastName;
    @JsonProperty("middlename")
    private String middleName;
    private String dob;
}
