package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Scoring {
    @JsonProperty("ConsumerID")
    private String consumerId;
    @JsonProperty("RepaymentHistoryScore")
    private String repaymentHistoryScore;
    @JsonProperty("TotalAmountOwedScore")
    private String totalAmountOwedScore;
    @JsonProperty("TypesOfCreditScore")
    private String typesOfCreditScore;
    @JsonProperty("LengthOfCreditHistoryScore")
    private String lengthOfCreditHistoryScore;
    @JsonProperty("NoOfAcctScore")
    private String noOfAcctScore;
    @JsonProperty("TotalConsumerScore")
    private String totalConsumerScore;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("ScoreDate")
    private String scoreDate;
}
