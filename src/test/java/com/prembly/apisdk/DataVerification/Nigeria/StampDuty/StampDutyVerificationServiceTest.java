package com.prembly.apisdk.DataVerification.Nigeria.StampDuty;

import com.prembly.apisdk.DataVerification.Nigeria.StampDuty.apiModels.StampDutyVerificationRequest;
import com.prembly.apisdk.DataVerification.Nigeria.StampDuty.apiModels.StampDutyVerificationResponse;
import com.prembly.apisdk.DataVerification.Nigeria.StampDuty.service.StampDutyVerificationService;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class StampDutyVerificationServiceTest {
    private PremblySdkRestClient restClient;
    private StampDutyVerificationService stampDutyVerificationService;

    @BeforeEach
    public void setUp() {
        restClient = mock(PremblySdkRestClient.class);
        stampDutyVerificationService = new StampDutyVerificationService("https://sandbox.myidentitypay.com", restClient);
    }

    @Test
    public void verifyStampDutyShouldReturnVerificationResponse() {
        StampDutyVerificationRequest request = new StampDutyVerificationRequest();
        request.setNumber("2022-0000-1111-2222");
        request.setCustomerReference("goke123444");
        request.setCustomerName("Test Account");

        StampDutyVerificationResponse expectedResponse = new StampDutyVerificationResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        StampDutyVerificationResponse actualResponse = stampDutyVerificationService.verifyStampDuty(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }
}

