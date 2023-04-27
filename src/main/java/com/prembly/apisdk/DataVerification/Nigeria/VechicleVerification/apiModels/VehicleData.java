package com.prembly.apisdk.DataVerification.Nigeria.VechicleVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VehicleData {
    @JsonProperty("vehicle_number")
    private String vehicleNumber;

    @JsonProperty("vehicle_name")
    private String vehicleName;

    @JsonProperty("vehicle_color")
    private String vehicleColor;
}
