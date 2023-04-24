package com.prembly.apisdk.Radar.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PhoneRequestText {
    @JsonProperty("phone_number")
    private String phoneNumber;
}
