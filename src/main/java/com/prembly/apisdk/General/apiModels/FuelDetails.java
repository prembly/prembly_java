package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FuelDetails {
    @JsonProperty("City_Mileage")
    private String cityMileage;

    @JsonProperty("Highway_Mileage")
    private String highwayMileage;

    @JsonProperty("Fuel_Type")
    private String fuelType;

    @JsonProperty("Fuel_Capacity")
    private String fuelCapacity;
}
