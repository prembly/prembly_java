package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DataItem {
    @JsonProperty("BusinessData")
    private List<BusinessData> businessData;
    @JsonProperty("HighestDelinquencyRating")
    private List<HighestDelinquencyRating> highestDelinquencyRating;
    @JsonProperty("FacilityPerformanceSummary")
    private List<FacilityPerformanceSummary> facilityPerformanceSummary;
}
