package com.prembly.apisdk.DocumentVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentVerificationRequest {
    @JsonProperty("doc_type")
    private String docType;
    @JsonProperty("doc_country")
    private String docCountry;
    @JsonProperty("doc_image")
    private String docImage;
}
