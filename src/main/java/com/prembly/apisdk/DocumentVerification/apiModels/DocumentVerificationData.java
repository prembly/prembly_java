package com.prembly.apisdk.DocumentVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DocumentVerificationData {
    @JsonProperty("fullName")
    private String fullName;
    private String gender;
    private String dob;
    @JsonProperty("document_name")
    private String documentName;
    @JsonProperty("documentNumber")
    private String documentNumber;
    @JsonProperty("documentType")
    private String documentType;
    @JsonProperty("documentCountry")
    private String documentCountry;
    private String issuer;
    private Integer age;
    @JsonProperty("expirationDate")
    private String expirationDate;
    private Object device;
}
