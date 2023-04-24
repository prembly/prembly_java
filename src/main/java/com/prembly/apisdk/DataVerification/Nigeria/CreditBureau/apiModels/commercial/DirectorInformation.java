package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DirectorInformation {
    @JsonProperty("Directorid")
    private Integer directorId;

    @JsonProperty("DateofBirth")
    private String dateOfBirth;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("othernames")
    private String otherNames;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("Identificationnumber")
    private String identificationNumber;

    @JsonProperty("DirectorAppointmentdate")
    private String directorAppointmentDate;
}
