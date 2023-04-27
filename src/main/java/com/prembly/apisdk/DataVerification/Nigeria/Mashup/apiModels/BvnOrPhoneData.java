package com.prembly.apisdk.DataVerification.Nigeria.Mashup.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BvnOrPhoneData {
    @JsonProperty("bvn_data")
    private BvnData bvnData;
    @JsonProperty("nin_data")
    private NinData ninData;
    @JsonProperty("voters_data")
    private VotersData votersData;
}
