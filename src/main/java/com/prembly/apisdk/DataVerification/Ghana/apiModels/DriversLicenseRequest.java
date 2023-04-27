package com.prembly.apisdk.DataVerification.Ghana.apiModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriversLicenseRequest {
    private String dob;
    private String number;
}
