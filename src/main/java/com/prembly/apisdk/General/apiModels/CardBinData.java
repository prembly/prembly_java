package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CardBinData {
    private String bin;
    private String brand;
    @JsonProperty("sub_brand")
    private String subBrand;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("card_type")
    private String cardType;
    private String bank;
}
