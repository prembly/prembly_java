package com.prembly.apisdk.DataVerification.Nigeria.Mashup.apiModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BvnOrPhoneRequest {
    private String channel;
    private String number;
}
