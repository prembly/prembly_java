package com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicCacRequest {
    @JsonProperty("rc_number")
    private String rcNumber;

    @JsonProperty("company_type")
    private String companyType;

    @JsonProperty("company_name")
    private String companyName;
}