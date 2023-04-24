package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class VinCarChassisData {
    @JsonProperty("vehicle_name")
    private String vehicleName;

    @JsonProperty("vehicle_age")
    private String vehicleAge;

    @JsonProperty("vehicle_made_in")
    private String vehicleMadeIn;

    @JsonProperty("vehicle_image")
    private String vehicleImage;

    @JsonProperty("market_analysis")
    private MarketAnalysis marketAnalysis;

    @JsonProperty("vehicle_specification")
    private List<Specification> specificationList;

    @JsonProperty("vehicle_equipments")
    private List<VehicleEquipment> vehicleEquipments;

    @JsonProperty("fuel_details")
    private FuelDetails fuelDetails;

    @JsonProperty("vehicle_warranty")
    private List<VehicleWarranty> vehicleWarrantyList;
}
