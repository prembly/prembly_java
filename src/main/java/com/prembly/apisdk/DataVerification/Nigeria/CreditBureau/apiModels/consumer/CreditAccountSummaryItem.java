package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreditAccountSummaryItem {
    @JsonProperty("TotalMonthlyInstalment")
    private String totalMonthlyInstalment;

    @JsonProperty("TotalOutstandingdebt")
    private String totalOutstandingdebt;

    @JsonProperty("TotalAccountarrear")
    private String totalAccountarrear;

    @JsonProperty("Amountarrear")
    private String amountarrear;

    @JsonProperty("TotalAccounts")
    private String totalAccounts;

    @JsonProperty("TotalAccounts1")
    private String totalAccounts1;

    @JsonProperty("TotalaccountinGodcondition")
    private String totalaccountinGodcondition;

    @JsonProperty("TotalaccountinGoodcondition")
    private String totalaccountinGoodcondition;

    @JsonProperty("TotalNumberofJudgement")
    private String totalNumberofJudgement;

    @JsonProperty("TotalJudgementAmount")
    private String totalJudgementAmount;

    @JsonProperty("LastJudgementDate")
    private String lastJudgementDate;

    @JsonProperty("TotalNumberofDishonoured")
    private String totalNumberofDishonoured;

    @JsonProperty("TotalDishonouredAmount")
    private String totalDishonouredAmount;

    @JsonProperty("LastBouncedChequesDate")
    private String lastBouncedChequesDate;

    @JsonProperty("TotalMonthlyInstalment1")
    private String totalMonthlyInstalment1;

    @JsonProperty("TotalOutstandingdebt1")
    private String totalOutstandingdebt1;

    @JsonProperty("TotalAccountarrear1")
    private String totalAccountarrear1;

    @JsonProperty("Amountarrear1")
    private String amountarrear1;

    @JsonProperty("TotalaccountinGodcondition1")
    private String totalaccountinGodcondition1;

    @JsonProperty("TotalaccountinBadcondition")
    private String totalaccountinBadcondition;

    @JsonProperty("TotalNumberofJudgement1")
    private String totalNumberofJudgement1;

    @JsonProperty("TotalJudgementAmount1")
    private String totalJudgementAmount1;

    @JsonProperty("LastJudgementDate1")
    private String lastJudgementDate1;

    @JsonProperty("TotalNumberofDishonoured1")
    private String totalNumberofDishonoured1;

    @JsonProperty("TotalDishonouredAmount1")
    private String totalDishonouredAmount1;

    @JsonProperty("LastBouncedChequesDate1")
    private String lastBouncedChequesDate1;

    @JsonProperty("Rating")
    private String rating;
}