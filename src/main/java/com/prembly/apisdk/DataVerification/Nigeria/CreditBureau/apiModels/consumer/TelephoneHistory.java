package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TelephoneHistory {
    @JsonProperty("HomeNoUpdatedonDate")
    private String homeNoUpdatedOnDate;

    @JsonProperty("HomeTelephoneNumber")
    private String homeTelephoneNumber;

    @JsonProperty("WorkNoUpdatedonDate")
    private String workNoUpdatedOnDate;

    @JsonProperty("WorkTelephoneNumber")
    private String workTelephoneNumber;

    @JsonProperty("MobileNoUpdatedonDate")
    private String mobileNoUpdatedOnDate;

    @JsonProperty("MobileTelephoneNumber")
    private String mobileTelephoneNumber;
}
