package com.prembly.apisdk.DataVerification.Nigeria.InternationalPassport;

import com.prembly.apisdk.DataVerification.Nigeria.InternationalPassport.apiModels.*;
import com.prembly.apisdk.DataVerification.Nigeria.InternationalPassport.service.InternationalPassportService;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class InternationalPassportServiceTest {
    private PremblySdkRestClient restClient;
    private InternationalPassportService internationalPassportService;

    @BeforeEach
    public void setUp() {
        restClient = mock(PremblySdkRestClient.class);
        internationalPassportService = new InternationalPassportService("https://sandbox.myidentitypay.com", restClient);
    }

    @Test
    public void internationalPassportSyncShouldReturnVerificationResponse() {
        InternationalPassportSyncRequest request = new InternationalPassportSyncRequest();
        request.setLastName("test");
        request.setNumber("A00400000");

        InternationalPassportSyncResponse expectedResponse = new InternationalPassportSyncResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        InternationalPassportSyncResponse actualResponse = internationalPassportService.internationalPassportSync(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void internationalPassportImageShouldReturnVerificationResponse() {
        InternationalPassportImageRequest request = new InternationalPassportImageRequest();
        request.setCustomerName("test");
        request.setCustomerReference("7488484JDHRHRJWKIEIEI344");
        request.setImage("https://www.biography.com/.image/c_fill%2Ccs_srgb%2Cfl_progressive%2Ch_400%2Cq_auto:good%2Cw_620/MTY2MzU3Nzk2OTM2MjMwNTkx/elon_musk_royal_society.jpg");

        InternationalPassportImageResponse expectedResponse = new InternationalPassportImageResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        InternationalPassportImageResponse actualResponse = internationalPassportService.internationalPassportImage(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void internationalPassportFaceValidationShouldReturnVerificationResponse() {
        InternationalPassportFaceValidationRequest request = new InternationalPassportFaceValidationRequest();
        request.setLastName("test");
        request.setNumber("A00400000");
        request.setImage("https://www.biography.com/.image/c_fill%2Ccs_srgb%2Cfl_progressive%2Ch_400%2Cq_auto:good%2Cw_620/MTY2MzU3Nzk2OTM2MjMwNTkx/elon_musk_royal_society.jpg");

        InternationalPassportFaceValidationResponse expectedResponse = new InternationalPassportFaceValidationResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        InternationalPassportFaceValidationResponse actualResponse = internationalPassportService.internationalPassportFaceValidation(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void internationalPassportAsyncShouldReturnVerificationResponse() {
        InternationalPassportAsyncRequest request = new InternationalPassportAsyncRequest();
        request.setLastName("test");
        request.setNumber("A00400000");

        InternationalPassportAsyncResponse expectedResponse = new InternationalPassportAsyncResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        InternationalPassportAsyncResponse actualResponse = internationalPassportService.internationalPassportAsync(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }
}
