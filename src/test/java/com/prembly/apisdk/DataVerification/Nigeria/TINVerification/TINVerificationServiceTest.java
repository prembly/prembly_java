package com.prembly.apisdk.DataVerification.Nigeria.TINVerification;

import com.prembly.apisdk.DataVerification.Nigeria.TINVerification.apiModels.TINVerificationRequest;
import com.prembly.apisdk.DataVerification.Nigeria.TINVerification.apiModels.TINVerificationResponse;
import com.prembly.apisdk.DataVerification.Nigeria.TINVerification.service.TINVerificationService;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class TINVerificationServiceTest {
    private PremblySdkRestClient restClient;
    private TINVerificationService tinVerificationService;

    @BeforeEach
    public void setUp() {
        restClient = mock(PremblySdkRestClient.class);
        tinVerificationService = new TINVerificationService("https://sandbox.myidentitypay.com", restClient);
    }

    @Test
    public void verifyTINShouldReturnVerificationResponse() {
        TINVerificationRequest request = new TINVerificationRequest();
        request.setChannel("TIN");
        request.setNumber("12392112349");

        TINVerificationResponse expectedResponse = new TINVerificationResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        TINVerificationResponse actualResponse = tinVerificationService.verifyTIN(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }
}
