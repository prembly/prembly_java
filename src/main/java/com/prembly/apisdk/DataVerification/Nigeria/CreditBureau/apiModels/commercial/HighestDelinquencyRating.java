package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HighestDelinquencyRating {
    @JsonProperty("HighestDelinquencyRating")
    private String highestDelinquencyRating;
}
