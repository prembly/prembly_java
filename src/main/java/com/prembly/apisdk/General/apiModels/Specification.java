package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Specification {
    @JsonProperty("year")
    private String year;

    @JsonProperty("make")
    private String make;

    @JsonProperty("model")
    private String model;

    @JsonProperty("trim")
    private String trim;

    @JsonProperty("size")
    private String size;

    @JsonProperty("category")
    private String category;

    @JsonProperty("made_in")
    private String madeIn;

    @JsonProperty("made_in_city")
    private String madeInCity;

    @JsonProperty("doors")
    private String doors;

    @JsonProperty("fuel_type")
    private String fuelType;

    @JsonProperty("fuel_capacity")
    private String fuelCapacity;

    @JsonProperty("city_mileage")
    private String cityMileage;

    @JsonProperty("highway_mileage")
    private String highwayMileage;

    @JsonProperty("engine")
    private String engine;

    @JsonProperty("engine_size")
    private String engineSize;

    @JsonProperty("engine_cylinders")
    private String engineCylinders;

    @JsonProperty("transmission")
    private String transmission;

    @JsonProperty("transmission_type")
    private String transmissionType;

    @JsonProperty("transmission_speeds")
    private String transmissionSpeeds;

    @JsonProperty("drivetrain")
    private String drivetrain;

    @JsonProperty("anti_brake_system")
    private String antiBrakeSystem;

    @JsonProperty("steering_type")
    private String steeringType;

    @JsonProperty("curb_weight")
    private String curbWeight;

    @JsonProperty("gross_vehicle_weight_rating")
    private String grossVehicleWeightRating;

    @JsonProperty("overall_height")
    private String overallHeight;

    @JsonProperty("overall_length")
    private String overallLength;

    @JsonProperty("overall_width")
    private String overallWidth;

    @JsonProperty("wheelbase_length")
    private String wheelbaseLength;

    @JsonProperty("standard_seating")
    private String standardSeating;
}
