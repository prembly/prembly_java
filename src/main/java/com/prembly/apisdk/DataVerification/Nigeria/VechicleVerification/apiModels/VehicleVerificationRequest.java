package com.prembly.apisdk.DataVerification.Nigeria.VechicleVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VehicleVerificationRequest {
    @JsonProperty("vehicle_number")
    private String vehicleNumber;
}
