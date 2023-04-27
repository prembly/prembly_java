package com.prembly.apisdk.DataVerification.Nigeria.NINVerification;

import com.prembly.apisdk.DataVerification.Nigeria.NINVerification.apiModels.*;
import com.prembly.apisdk.DataVerification.Nigeria.NINVerification.service.NINVerificationService;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class NINVerificationServiceTest {
    private PremblySdkRestClient restClient;
    private NINVerificationService ninVerificationService;

    @BeforeEach
    public void setUp() {
        restClient = mock(PremblySdkRestClient.class);
        ninVerificationService = new NINVerificationService("https://sandbox.myidentitypay.com", restClient);
    }

    @Test
    public void lookUpNINSlipImageShouldReturnVerificationResponse() {
        LookUpNINSlipImageRequest request = new LookUpNINSlipImageRequest();
        request.setImage("https://asset.cloudinary.com/dh3i1wodq/089761016db6dab086ca450bf2465898");

        LookUpNINSlipImageResponse expectedResponse = new LookUpNINSlipImageResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        LookUpNINSlipImageResponse actualResponse = ninVerificationService.lookUpNINSlipImage(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void lookUpVirtualNINShouldReturnVerificationResponse() {
        LookUpVirtualNINRequest request = new LookUpVirtualNINRequest();
        request.setNumber("AA1234567890123B");
        request.setNumberNin("12345678909");

        LookUpVirtualNINResponse expectedResponse = new LookUpVirtualNINResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setDetail("Verification Successful");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        LookUpVirtualNINResponse actualResponse = ninVerificationService.lookUpVirtualNIN(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getDetail(), actualResponse.getDetail());
    }

    @Test
    public void lookUpNINWithFaceShouldReturnVerificationResponse() {
        LookUpNINWithFaceRequest request = new LookUpNINWithFaceRequest();
        request.setNumber("12345678909");
        request.setImage("https://res.cloudinary.com/dh3i1wodq/image/upload/v1675417496/cbimage_3_drqdoc.jpg");

        LookUpNINWithFaceResponse expectedResponse = new LookUpNINWithFaceResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setDetail("Verification Successful");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        LookUpNINWithFaceResponse actualResponse = ninVerificationService.lookUpNINWithFace(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getDetail(), actualResponse.getDetail());
    }
}

