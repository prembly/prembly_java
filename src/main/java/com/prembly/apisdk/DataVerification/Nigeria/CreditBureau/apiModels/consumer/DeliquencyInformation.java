package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DeliquencyInformation {
    @JsonProperty("SubscriberName")
    private String subscriberName;

    @JsonProperty("AccountNo")
    private String accountNo;

    @JsonProperty("PeriodNum")
    private String periodNum;

    @JsonProperty("MonthsinArrears")
    private String monthsinArrears;
}
