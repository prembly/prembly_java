package com.prembly.apisdk.DataVerification.Nigeria.VotersCard.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LookupVinIdImageResponse {
    private Boolean status;
    private String detail;
    @JsonProperty("response_code")
    private String responseCode;
    @JsonProperty("vc_data")
    private VcData vcData;
}
