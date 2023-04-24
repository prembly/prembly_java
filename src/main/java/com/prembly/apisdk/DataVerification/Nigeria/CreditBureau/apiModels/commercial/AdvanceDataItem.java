package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AdvanceDataItem {
    @JsonProperty("BusinessData")
    private List<BusinessData> businessData;
    @JsonProperty("HighestDelinquencyRating")
    private List<HighestDelinquencyRating> highestDelinquencyRating;
    @JsonProperty("FacilityPerformanceSummary")
    private List<FacilityPerformanceSummary> facilityPerformanceSummary;
    @JsonProperty("DirectorInformation")
    private List<DirectorInformation> directorInformation;
    @JsonProperty("CreditAgreementSummary")
    private List<CreditAgreementSummary> creditAgreementSummary;
    @JsonProperty("AccountMonthlyPaymentHistoryHeader")
    private List<AccountMonthlyPaymentHistoryHeader> accountMonthlyPaymentHistoryHeader;
    @JsonProperty("AccountMonthlyPaymentHistory")
    private List<AccountMonthlyPaymentHistory> accountMonthlyPaymentHistory;
    @JsonProperty("AddressHistory")
    private List<AddressHistory> addressHistory;
    @JsonProperty("AdditionalContactHistory")
    private List<AdditionalContactHistory> additionalContactHistory;

}
