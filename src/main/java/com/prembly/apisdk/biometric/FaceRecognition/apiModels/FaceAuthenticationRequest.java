package com.prembly.apisdk.biometric.FaceRecognition.apiModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaceAuthenticationRequest {
    private String image;
}