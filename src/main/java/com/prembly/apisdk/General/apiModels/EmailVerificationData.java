package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmailVerificationData {
    private String email;
    @JsonProperty("did_you_mean")
    private String didYouMean;
    private String user;
    private String domain;
    @JsonProperty("format_valid")
    private Boolean formatValid;
    @JsonProperty("mx_found")
    private Boolean mxFound;
    @JsonProperty("smtp_check")
    private Boolean smtpCheck;
    @JsonProperty("catch_all")
    private Boolean catchAll;
    private Boolean role;
    private Boolean disposable;
    private Boolean free;
    private Double score;
}
