package com.prembly.apisdk.General.apiModels;

import lombok.Data;

import java.util.List;

@Data
public class VehicleEquipment {
    private String section;
    private List<EquipmentDetail> details;
}
