package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FacilityPerformanceSummary {
    @JsonProperty("TotalMonthlyInstalment")
    private String totalMonthlyInstalment;

    @JsonProperty("TotalOutstandingdebt")
    private String totalOutstandingDebt;

    @JsonProperty("TotalAccountarrear")
    private String totalAccountArrear;

    @JsonProperty("TotalAccounts")
    private String totalAccounts;

    @JsonProperty("TotalAccounts1")
    private String totalAccounts1;

    @JsonProperty("Amountarrear")
    private String amountArrear;

    @JsonProperty("TotalaccountinGoodcondition")
    private String totalAccountInGoodCondition;

    @JsonProperty("TotalaccountinBadcondition")
    private String totalAccountInBadCondition;

    @JsonProperty("TotalNumberofJudgement")
    private String totalNumberOfJudgement;

    @JsonProperty("TotalJudgementAmount")
    private String totalJudgementAmount;

    @JsonProperty("LastJudgementDate")
    private String lastJudgementDate;

    @JsonProperty("TotalNumberofDishonoured")
    private String totalNumberOfDishonoured;

    @JsonProperty("TotalDishonouredAmount")
    private String totalDishonouredAmount;

    @JsonProperty("LastBouncedChequesDate")
    private String lastBouncedChequesDate;

    @JsonProperty("TotalMonthlyInstalment1")
    private String totalMonthlyInstalment1;

    @JsonProperty("TotalOutstandingdebt1")
    private String totalOutstandingDebt1;

    @JsonProperty("TotalAccountarrear1")
    private String totalAccountArrear1;

    @JsonProperty("Amountarrear1")
    private String amountArrear1;

    @JsonProperty("TotalaccountinGoodcondition1")
    private String totalAccountInGoodCondition1;

    @JsonProperty("TotalaccountinBadcondition1")
    private String totalAccountInBadCondition1;

    @JsonProperty("TotalNumberofJudgement1")
    private String totalNumberOfJudgement1;

    @JsonProperty("TotalJudgementAmount1")
    private String totalJudgementAmount1;

    @JsonProperty("LastJudgementDate1")
    private String lastJudgementDate1;

    @JsonProperty("TotalNumberofDishonoured1")
    private String totalNumberOfDishonoured1;

    @JsonProperty("TotalDishonouredAmount1")
    private String totalDishonouredAmount1;

    @JsonProperty("LastBouncedChequesDate1")
    private String lastBouncedChequesDate1;

    @JsonProperty("TotalNumberofAccounts")
    private String totalNumberOfAccounts;

    @JsonProperty("Rating")
    private String rating;
}
