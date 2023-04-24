package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AddressHistory {
    @JsonProperty("UpDateOnDate")
    private String updateOnDate;

    @JsonProperty("CommercialAddressType")
    private String commercialAddressType;

    @JsonProperty("CommercialAddress1")
    private String commercialAddress1;

    @JsonProperty("CommercialAddress2")
    private String commercialAddress2;

    @JsonProperty("CommercialAddress3")
    private String commercialAddress3;

    @JsonProperty("CommercialAddress4")
    private String commercialAddress4;
}
