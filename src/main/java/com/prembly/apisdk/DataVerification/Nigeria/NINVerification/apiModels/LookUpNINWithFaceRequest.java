package com.prembly.apisdk.DataVerification.Nigeria.NINVerification.apiModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LookUpNINWithFaceRequest {
    private String number;
    private String image;
}
