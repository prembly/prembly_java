package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AdvanceDataItem {
    @JsonProperty("Scoring")
    private List<Scoring> scoring;
    @JsonProperty("PersonalDetailsSummary")
    private List<PersonalDetailsSummaryItem> personalDetailsSummary;
    @JsonProperty("DeliquencyInformation")
    private List<DeliquencyInformation> delinquencyInformation;
    @JsonProperty("CreditAccountSummary")
    private List<CreditAccountSummaryItem> creditAccountSummary;
    @JsonProperty("CreditAccountRating")
    private List<AccountRatingItem> creditAccountRating;
    @JsonProperty("CreditAgreementSummary")
    private List<CreditAgreementSummary> creditAgreementSummary;
    @JsonProperty("AccountMonthlyPaymentHistoryHeader")
    private List<AccountMonthlyPaymentHistoryHeader> accountMonthlyPaymentHistoryHeader;
    @JsonProperty("AccountMonthlyPaymentHistory")
    private List<AccountMonthlyPaymentHistory> accountMonthlyPaymentHistory;
    @JsonProperty("GuarantorCount")
    private List<GuarantorCount> guarantorCount;
    @JsonProperty("GuarantorDetails")
    private List<GuarantorDetails> guarantorDetails;
    @JsonProperty("CompanyDirectorSummary")
    private Object CompanyDirectorSummary;
    @JsonProperty("IdentificationHistory")
    private List<IdentificationHistory> identificationHistory;
    @JsonProperty("AddressHistory")
    private List<AddressHistory> addressHistory;
    @JsonProperty("EmploymentHistory")
    private List<EmploymentHistory> employmentHistory;
    @JsonProperty("TelephoneHistory")
    private List<TelephoneHistory> telephoneHistory;
}
