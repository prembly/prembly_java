package com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification;


import com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification.apiModels.AdvancePhoneNumberResponse;
import com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification.apiModels.BasicPhoneNumberResponse;
import com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification.apiModels.PhoneNumberVerificationRequest;
import com.prembly.apisdk.DataVerification.Nigeria.PhoneNumberVerification.service.PhoneNumberVerificationService;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class PhoneNumberVerificationServiceTest {
    private PremblySdkRestClient restClient;
    private PhoneNumberVerificationService phoneNumberVerificationService;

    @BeforeEach
    public void setUp() {
        restClient = mock(PremblySdkRestClient.class);
        phoneNumberVerificationService = new PhoneNumberVerificationService("https://sandbox.myidentitypay.com", restClient);
    }

    @Test
    public void basicPhoneNumberShouldReturnVerificationResponse() {
        PhoneNumberVerificationRequest request = new PhoneNumberVerificationRequest();
        request.setNumber("08082838283");

        BasicPhoneNumberResponse expectedResponse = new BasicPhoneNumberResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        BasicPhoneNumberResponse actualResponse = phoneNumberVerificationService.basicPhoneNumber(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void advancePhoneNumberShouldReturnVerificationResponse() {
        PhoneNumberVerificationRequest request = new PhoneNumberVerificationRequest();
        request.setNumber("08082838283");

        AdvancePhoneNumberResponse expectedResponse = new AdvancePhoneNumberResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setDetail("Verification Successful");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        AdvancePhoneNumberResponse actualResponse = phoneNumberVerificationService.advancePhoneNumber(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getDetail(), actualResponse.getDetail());
    }
}
