package com.prembly.apisdk.DataVerification.Nigeria.TINVerification.apiModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TINVerificationRequest {
    private String channel;
    private String number;
}
