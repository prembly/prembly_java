package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IdentificationHistory {
    @JsonProperty("UpDateDate")
    private String upDateDate;

    @JsonProperty("UpDateOnDate")
    private String upDateOnDate;

    @JsonProperty("IdentificationNumber")
    private String identificationNumber;

    @JsonProperty("IdentificationType")
    private String identificationType;
}
