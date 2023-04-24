package com.prembly.apisdk.DataVerification.Nigeria.VechicleVerification;

import com.prembly.apisdk.DataVerification.Nigeria.VechicleVerification.apiModels.VehicleVerificationRequest;
import com.prembly.apisdk.DataVerification.Nigeria.VechicleVerification.apiModels.VehicleVerificationResponse;
import com.prembly.apisdk.DataVerification.Nigeria.VechicleVerification.service.VehicleVerificationService;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class VehicleVerificationServiceTest {
    private PremblySdkRestClient restClient;
    private VehicleVerificationService vehicleVerificationService;

    @BeforeEach
    public void setUp() {
        restClient = mock(PremblySdkRestClient.class);
        vehicleVerificationService = new VehicleVerificationService("https://sandbox.myidentitypay.com", restClient);
    }

    @Test
    public void plateNumberVerificationShouldReturnVerificationResponse() {
        VehicleVerificationRequest request = new VehicleVerificationRequest();
        request.setVehicleNumber("AAA000000");

        VehicleVerificationResponse expectedResponse = new VehicleVerificationResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        VehicleVerificationResponse actualResponse = vehicleVerificationService.plateNumberVerification(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }
}
