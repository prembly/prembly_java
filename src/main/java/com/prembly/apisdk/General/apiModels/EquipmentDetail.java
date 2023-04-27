package com.prembly.apisdk.General.apiModels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentDetail {
    @JsonProperty("Anti-Brake_System")
    private String antiBrakeSystem;
    @JsonProperty("Steering_Type")
    private String steeringType;
    @JsonProperty("Front_Brake_Type")
    private String frontBrakeType;
    @JsonProperty("Rear_Brake_Type")
    private String rearBrakeType;
    @JsonProperty("Front_Suspension")
    private String frontSuspension;
    @JsonProperty("Rear_Suspension")
    private String rearSuspension;
    @JsonProperty("Front_Spring_Type")
    private String frontSpringType;
    @JsonProperty("Rear_Spring_Type")
    private String rearSpringType;
    @JsonProperty("Tires")
    private String tires;
    @JsonProperty("Front_Headroom")
    private String frontHeadroom;
    @JsonProperty("Rear_Headroom")
    private String rearHeadroom;
    @JsonProperty("Front_Legroom")
    private String frontLegroom;
    @JsonProperty("Rear_Legroom")
    private String rearLegroom;
    @JsonProperty("Front_Shoulder_Room")
    private String frontShoulderRoom;
    @JsonProperty("Rear_Shoulder_Room")
    private String rearShoulderRoom;
    @JsonProperty("Curb_Weight-automatic")
    private String curbWeightAutomatic;
    @JsonProperty("Overall_Length")
    private String overallLength;
    @JsonProperty("Overall_Width")
    private String overallWidth;
    @JsonProperty("Overall_Height")
    private String overallHeight;
    @JsonProperty("Wheelbase")
    private String wheelbase;
    @JsonProperty("Ground_Clearance")
    private String groundClearance;
    @JsonProperty("Track_Front")
    private String trackFront;
    @JsonProperty("Track_Rear")
    private String trackRear;
    @JsonProperty("Cargo_Length")
    private String cargoLength;
    @JsonProperty("Width_At_Wheelwell")
    private String widthAtWheelwell;
    @JsonProperty("Width_At_Wall")
    private String widthAtWall;
    @JsonProperty("Standard_Seating")
    private String standardSeating;
    @JsonProperty("Standard_Towing")
    private String standardTowing;
    @JsonProperty("Maximum_Towing")
    private String maximumTowing;
    @JsonProperty("Standard_Payload")
    private String standardPayload;
    @JsonProperty("Maximum_Payload")
    private String maximumPayload;
    @JsonProperty("Standard_GVWR")
    private String standardGVWR;
    @JsonProperty("Maximum_GVWR")
    private String maximumGVWR;
}
