package com.prembly.apisdk.DataVerification.Ghana.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DriversLicenseData {
    @JsonProperty("Name")
    private String name;

    @JsonProperty("DateOfBirth")
    private String dateOfBirth;

    @JsonProperty("ProcessingCenter")
    private String processingCenter;

    @JsonProperty("ClassOfLicence")
    private String classOfLicence;

    @JsonProperty("Nationality")
    private String nationality;

    @JsonProperty("DateOfIssue")
    private String dateOfIssue;

    @JsonProperty("ExpiryDate")
    private String expiryDate;

    @JsonProperty("CertificateDate")
    private String certificateDate;

    @JsonProperty("CertificateOfCompetence")
    private String certificateOfCompetence;

    @JsonProperty("DriverImage")
    private String driverImage;

    @JsonProperty("PIN")
    private String pin;
}
