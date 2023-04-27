package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IdentityDocument {
    @JsonProperty("citizenship_id")
    private String citizenshipId;

    @JsonProperty("issuing_country_id")
    private String issuingCountryId;

    @JsonProperty("nr")
    private String nr;

    @JsonProperty("expiry_date")
    private String expiryDate;

    @JsonProperty("place_of_issue")
    private String placeOfIssue;

    @JsonProperty("type")
    private String type;

    @JsonProperty("issued_on")
    private String issuedOn;
}
