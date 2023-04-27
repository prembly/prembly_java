package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmploymentHistory {
    @JsonProperty("UpDateDate")
    private String updateDate;

    @JsonProperty("UpDateOnDate")
    private String updateOnDate;

    @JsonProperty("EmployerDetail")
    private String employerDetail;

    @JsonProperty("Occupation")
    private String occupation;
}
