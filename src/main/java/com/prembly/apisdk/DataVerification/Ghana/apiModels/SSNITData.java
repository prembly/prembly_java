package com.prembly.apisdk.DataVerification.Ghana.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SSNITData {
    @JsonProperty("FSSNo")
    private String fssNo;

    @JsonProperty("FullName")
    private String fullName;

    @JsonProperty("BirthDate")
    private String birthDate;

    @JsonProperty("Sex")
    private String sex;

    @JsonProperty("CardSerial")
    private String cardSerial;

    @JsonProperty("Photo")
    private String photo;
}
