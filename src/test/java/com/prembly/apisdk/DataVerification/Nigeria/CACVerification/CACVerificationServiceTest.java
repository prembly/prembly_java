package com.prembly.apisdk.DataVerification.Nigeria.CACVerification;

import com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels.AdvanceCacRequest;
import com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels.AdvanceCacResponse;
import com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels.BasicCacRequest;
import com.prembly.apisdk.DataVerification.Nigeria.CACVerification.apiModels.BasicCacResponse;
import com.prembly.apisdk.DataVerification.Nigeria.CACVerification.service.CACVerificationService;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CACVerificationServiceTest {
    private PremblySdkRestClient restClient;
    private CACVerificationService cacVerificationService;

    @BeforeEach
    public void setUp() {
        restClient = mock(PremblySdkRestClient.class);
        cacVerificationService = new CACVerificationService("https://sandbox.myidentitypay.com", restClient);
    }
    @Test
    public void basicCacShouldReturnVerificationResponse() {
        BasicCacRequest request = new BasicCacRequest();
        request.setRcNumber("092932");
        request.setCompanyType("RC");

        BasicCacResponse expectedResponse = new BasicCacResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        BasicCacResponse actualResponse = cacVerificationService.basicCac(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void basicCacUsingNameShouldReturnVerificationResponse() {
        BasicCacRequest request = new BasicCacRequest();
        request.setCompanyName("TEST COMPANY");

        BasicCacResponse expectedResponse = new BasicCacResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        BasicCacResponse actualResponse = cacVerificationService.basicCacUsingName(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void advanceCacShouldReturnVerificationResponse() {
        AdvanceCacRequest request = new AdvanceCacRequest();
        request.setCompanyName("TEST COMPANY");
        request.setCompanyType("RC");
        request.setRcNumber("092932");

        AdvanceCacResponse expectedResponse = new AdvanceCacResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        AdvanceCacResponse actualResponse = cacVerificationService.advanceCac(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }
}
