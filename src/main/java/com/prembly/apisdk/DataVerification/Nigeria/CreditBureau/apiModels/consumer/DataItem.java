package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DataItem {
    @JsonProperty("PersonalDetailsSummary")
    private List<PersonalDetailsSummaryItem> personalDetailsSummary;

    @JsonProperty("CreditAccountSummary")
    private List<CreditAccountSummaryItem> creditAccountSummary;

    @JsonProperty("AccountRating")
    private List<AccountRatingItem> accountRating;
}
