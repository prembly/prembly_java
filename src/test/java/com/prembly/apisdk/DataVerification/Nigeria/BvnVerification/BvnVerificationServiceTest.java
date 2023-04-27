package com.prembly.apisdk.DataVerification.Nigeria.BvnVerification;


import com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels.BvnVerificationFaceData;
import com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels.BvnVerificationRequest;
import com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.apiModels.BvnVerificationResponse;
import com.prembly.apisdk.DataVerification.Nigeria.BvnVerification.service.BvnVerificationService;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class BvnVerificationServiceTest {
    private PremblySdkRestClient restClient;
    private BvnVerificationService bvnVerificationService;
    @BeforeEach
    public void setUp() {
        restClient = mock(PremblySdkRestClient.class);
        bvnVerificationService = new BvnVerificationService("https://sandbox.myidentitypay.com", restClient);
    }
    @Test
    public void bvnOnePointZeroShouldReturnVerificationResponse() {
        BvnVerificationRequest request = new BvnVerificationRequest();
        request.setNumber("54651333604");

        BvnVerificationResponse expectedResponse = new BvnVerificationResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        BvnVerificationResponse actualResponse = bvnVerificationService.bvnOnePointZero(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void bvnTwoPointZeroShouldReturnVerificationResponse() {
        BvnVerificationRequest request = new BvnVerificationRequest();
        request.setNumber("54651333604");

        BvnVerificationResponse expectedResponse = new BvnVerificationResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        BvnVerificationResponse actualResponse = bvnVerificationService.bvnTwoPointZero(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void bvnTwoPointZeroPlusFaceValidationShouldReturnVerificationResponse() {
        BvnVerificationRequest request = new BvnVerificationRequest();
        request.setNumber("54651333604");
        request.setImage("https://res.cloudinary.com/dh3i1wodq/image/upload/v1675417496/cbimage_3_drqdoc.jpg");

        BvnVerificationResponse expectedResponse = new BvnVerificationResponse();
        expectedResponse.setStatus(true);
        BvnVerificationFaceData bvnVerificationFaceData = new BvnVerificationFaceData();
        bvnVerificationFaceData.setStatus(true);
        expectedResponse.setFaceData(bvnVerificationFaceData);

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        BvnVerificationResponse actualResponse = bvnVerificationService.bvnTwoPointZeroPlusFaceValidation(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getFaceData().getStatus(), actualResponse.getFaceData().getStatus());
    }
}
