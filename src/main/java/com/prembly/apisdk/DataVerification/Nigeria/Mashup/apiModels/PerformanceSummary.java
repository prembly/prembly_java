package com.prembly.apisdk.DataVerification.Nigeria.Mashup.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PerformanceSummary {
    @JsonProperty("ACCOUNT_BALANCE")
    private String accountBalance;

    @JsonProperty("APPROVED_AMOUNT")
    private String approvedAmount;

    @JsonProperty("DATA_PRDR_ID")
    private String dataProviderId;

    @JsonProperty("DISHONORED_CHEQUES_COUNT")
    private String dishonoredChequesCount;

    @JsonProperty("FACILITIES_COUNT")
    private String facilitiesCount;

    @JsonProperty("INSTITUTION_NAME")
    private String institutionName;

    @JsonProperty("NONPERFORMING_FACILITY")
    private String nonPerformingFacility;

    @JsonProperty("OVERDUE_AMOUNT")
    private String overdueAmount;

    @JsonProperty("PERFORMING_FACILITY")
    private String performingFacility;
}
