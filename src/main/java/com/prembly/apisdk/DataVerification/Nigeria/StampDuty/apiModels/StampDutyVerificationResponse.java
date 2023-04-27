package com.prembly.apisdk.DataVerification.Nigeria.StampDuty.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class StampDutyVerificationResponse {
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("response_code")
    private String responseCode;
    @JsonProperty("data")
    private StampDutyVerificationData data;
    @JsonProperty("verification")
    private StampDutyVerificationStatus verification;
}
