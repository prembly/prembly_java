package com.prembly.apisdk.DataVerification.Uganda.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BusinessVerificationData {
    @JsonProperty("name")
    private String name;

    @JsonProperty("res_status")
    private String resStatus;

    @JsonProperty("is_compliant")
    private String isCompliant;

    @JsonProperty("ent_subtype")
    private String entSubtype;

    @JsonProperty("reg_date")
    private String regDate;

    @JsonProperty("reg_nr")
    private String regNr;

    @JsonProperty("reg_end_date")
    private String regEndDate;

    @JsonProperty("name_change_hist")
    private String nameChangeHist;
}
