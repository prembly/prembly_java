package com.prembly.apisdk.General.apiModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetVerificationStatusRequest {
    private String reference;
}
