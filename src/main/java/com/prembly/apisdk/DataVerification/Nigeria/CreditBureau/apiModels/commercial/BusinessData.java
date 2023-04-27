package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BusinessData {
    @JsonProperty("CommercialID")
    private String commercialId;

    @JsonProperty("ReferenceNo")
    private String referenceNo;

    @JsonProperty("BusinessName")
    private String businessName;

    @JsonProperty("TradingName")
    private String tradingName;

    @JsonProperty("IndustrySector")
    private String industrySector;

    @JsonProperty("PreviousBusinessName")
    private String previousBusinessName;

    @JsonProperty("BusinessRegistrationNumber")
    private String businessRegistrationNumber;

    @JsonProperty("PreviousRegistrationNumber")
    private String previousRegistrationNumber;

    @JsonProperty("NoOfDirectors")
    private Integer noOfDirectors;

    @JsonProperty("BusinessType")
    private String businessType;

    @JsonProperty("DateOfIncorporation")
    private String dateOfIncorporation;

    @JsonProperty("DateOfCommencement")
    private String dateOfCommencement;

    @JsonProperty("TaxIdentificationNumber")
    private String taxIdentificationNumber;

    @JsonProperty("VatNumber")
    private String vatNumber;

    @JsonProperty("Webaddress")
    private String webAddress;

    @JsonProperty("CommercialEmail1")
    private String commercialEmail1;

    @JsonProperty("CommercialEmail2")
    private String commercialEmail2;

    @JsonProperty("CommercialEmail3")
    private String commercialEmail3;

    @JsonProperty("CommercialEmail4")
    private String commercialEmail4;

    @JsonProperty("CommercialAddress1")
    private String commercialAddress1;

    @JsonProperty("CommercialAddress2")
    private String commercialAddress2;

    @JsonProperty("CommercialAddress3")
    private String commercialAddress3;

    @JsonProperty("CommercialAddress4")
    private String commercialAddress4;

    @JsonProperty("postalAddress1")
    private String postalAddress1;

    @JsonProperty("postalAddress2")
    private String postalAddress2;

    @JsonProperty("postalAddress3")
    private String postalAddress3;

    @JsonProperty("postalAddress4")
    private String postalAddress4;

    @JsonProperty("Telephone1")
    private String telephone1;

    @JsonProperty("Telephone2")
    private String telephone2;

    @JsonProperty("Telephone3")
    private String telephone3;

    @JsonProperty("Telephone4")
    private String telephone4;

    @JsonProperty("Fax1")
    private String fax1;

    @JsonProperty("Fax2")
    private String fax2;

    @JsonProperty("Fax3")
    private String fax3;

    @JsonProperty("Fax4")
    private String fax4;

    @JsonProperty("UpdatedOn")
    private String updatedOn;
}
