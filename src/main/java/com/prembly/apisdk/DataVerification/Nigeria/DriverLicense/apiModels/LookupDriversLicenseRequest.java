package com.prembly.apisdk.DataVerification.Nigeria.DriverLicense.apiModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LookupDriversLicenseRequest {
    private String dob;
    private String number;
}
