package com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class IgreeResponse {
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("contacts")
    private List<String> contacts;
    @JsonProperty("response_code")
    private String responseCode;
    @JsonProperty("data")
    private IgreeData data;
}
