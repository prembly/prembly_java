package com.prembly.apisdk.DataVerification.Ghana.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VotersCardData {
    @JsonProperty("PollingStation")
    private String pollingStation;

    @JsonProperty("VoterID")
    private String voterID;

    @JsonProperty("Age")
    private String age;

    @JsonProperty("DateOfBirth")
    private String dateOfBirth;

    @JsonProperty("Sex")
    private String sex;

    @JsonProperty("RegDate")
    private String regDate;

    @JsonProperty("Fullname")
    private String fullname;

    @JsonProperty("Picture")
    private String picture;

    @JsonProperty("Othernames")
    private String othernames;

    @JsonProperty("Surname")
    private String surname;
}
