package com.prembly.apisdk.DataVerification.Nigeria.DriversLicense;

import com.prembly.apisdk.DataVerification.Nigeria.DriverLicense.apiModels.*;
import com.prembly.apisdk.DataVerification.Nigeria.DriverLicense.service.DriverLicenseService;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class DriverLicenseServiceTest {
    private PremblySdkRestClient restClient;
    private DriverLicenseService driverLicenseService;
    @BeforeEach
    public void setUp() {
        restClient = mock(PremblySdkRestClient.class);
        driverLicenseService = new DriverLicenseService("https://sandbox.myidentitypay.com", restClient);
    }
    @Test
    public void driversLicenseBasicShouldReturnVerificationResponse() {
        DriversLicenseBasicRequest request = new DriversLicenseBasicRequest();
        request.setDob("1999-12-21");
        request.setFirstName("test");
        request.setLastName("test");
        request.setNumber("AAD23208212298");

        DriversLicenseBasicResponse expectedResponse = new DriversLicenseBasicResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        DriversLicenseBasicResponse actualResponse = driverLicenseService.driversLicenseBasic(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void advanceDriversLicenseShouldReturnVerificationResponse() {
        AdvanceDriversLicenseRequest request = new AdvanceDriversLicenseRequest();
        request.setDob("1999-12-21");
        request.setFirstName("test");
        request.setLastName("test");
        request.setNumber("AAD23208212298");

        AdvanceDriversLicenseResponse expectedResponse = new AdvanceDriversLicenseResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        AdvanceDriversLicenseResponse actualResponse = driverLicenseService.advanceDriversLicense(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void driversLicenseImageShouldReturnVerificationResponse() {
        DriversLicenseImageRequest request = new DriversLicenseImageRequest();
        request.setImage("/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEB==");

        DriversLicenseImageResponse expectedResponse = new DriversLicenseImageResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        DriversLicenseImageResponse actualResponse = driverLicenseService.driversLicenseImage(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void lookupDriversLicenseShouldReturnVerificationResponse() {
        LookupDriversLicenseRequest request = new LookupDriversLicenseRequest();
        request.setDob("1999-12-21");
        request.setNumber("AAD23208212298");

        LookupDriversLicenseResponse expectedResponse = new LookupDriversLicenseResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        LookupDriversLicenseResponse actualResponse = driverLicenseService.lookupDriversLicense(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void driversLicenseFaceValidationShouldReturnVerificationResponse() {
        DriversLicenseFaceValidationRequest request = new DriversLicenseFaceValidationRequest();
        request.setDob("1999-12-21");
        request.setNumber("AAD23208212298");
        request.setImage("https://res.cloudinary.com/dh3i1wodq/image/upload/v1675417496/cbimage_3_drqdoc.jpg");

        DriversLicenseFaceValidationResponse expectedResponse = new DriversLicenseFaceValidationResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        DriversLicenseFaceValidationResponse actualResponse = driverLicenseService.driversLicenseFaceValidation(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }
}
