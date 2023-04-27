package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AddressHistory {
    @JsonProperty("UpDateDate")
    private String updateDate;

    @JsonProperty("UpDateOnDate")
    private String updateOnDate;

    @JsonProperty("Address1")
    private String address1;

    @JsonProperty("Address2")
    private String address2;

    @JsonProperty("Address3")
    private String address3;

    @JsonProperty("Address4")
    private String address4;

    @JsonProperty("AddressTypeInd")
    private String addressTypeInd;
}
