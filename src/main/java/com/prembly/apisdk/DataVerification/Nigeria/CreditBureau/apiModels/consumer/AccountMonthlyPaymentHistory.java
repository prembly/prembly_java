package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccountMonthlyPaymentHistory {
    @JsonProperty("Header")
    private String header;

    @JsonProperty("TableName")
    private String tableName;

    @JsonProperty("DisplayText")
    private String displayText;

    @JsonProperty("DateAccountOpened")
    private String dateAccountOpened;

    @JsonProperty("SubscriberName")
    private String subscriberName;

    @JsonProperty("AccountNo")
    private String accountNo;

    @JsonProperty("SubAccountNo")
    private String subAccountNo;

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("CurrentBalanceDebitInd")
    private String currentBalanceDebitInd;

    @JsonProperty("IndicatorDescription")
    private String indicatorDescription;

    @JsonProperty("MonthlyInstalmentAmt")
    private String monthlyInstalmentAmt;

    @JsonProperty("LastPaymentDate")
    private String lastPaymentDate;

    @JsonProperty("SubscriberTypeInd")
    private String subscriberTypeInd;

    @JsonProperty("AccountNote")
    private String accountNote;

    @JsonProperty("RepaymentFrequencyCode")
    private String repaymentFrequencyCode;

    @JsonProperty("OpeningBalanceAmt")
    private String openingBalanceAmt;

    @JsonProperty("CurrentBalanceAmt")
    private String currentBalanceAmt;

    @JsonProperty("AmountOverdue")
    private String amountOverdue;

    @JsonProperty("ClosedDate")
    private String closedDate;

    @JsonProperty("LastUpdatedDate")
    private String lastUpdatedDate;

    @JsonProperty("PerformanceStatus")
    private String performanceStatus;

    @JsonProperty("LoanDuration")
    private String loanDuration;

    @JsonProperty("AccountStatus")
    private String accountStatus;

    @JsonProperty("M01")
    private String m01;

    @JsonProperty("M02")
    private String m02;

    @JsonProperty("M03")
    private String m03;

    @JsonProperty("M04")
    private String m04;

    @JsonProperty("M05")
    private String m05;

    @JsonProperty("M06")
    private String m06;

    @JsonProperty("M07")
    private String m07;

    @JsonProperty("M08")
    private String m08;

    @JsonProperty("M09")
    private String m09;

    @JsonProperty("M10")
    private String m10;

    @JsonProperty("M11")
    private String m11;

    @JsonProperty("M12")
    private String m12;

    @JsonProperty("M13")
    private String m13;

    @JsonProperty("M14")
    private String m14;

    @JsonProperty("M15")
    private String m15;

    @JsonProperty("M16")
    private String m16;

    @JsonProperty("M17")
    private String m17;

    @JsonProperty("M18")
    private String m18;

    @JsonProperty("M19")
    private String m19;

    @JsonProperty("M20")
    private String m20;

    @JsonProperty("M21")
    private String m21;

    @JsonProperty("M22")
    private String m22;

    @JsonProperty("M23")
    private String m23;

    @JsonProperty("M24")
    private String m24;
}
