package com.prembly.apisdk.DataVerification.Ghana.apiModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VotersCardRequest {
    private String type;
    private String number;
}
