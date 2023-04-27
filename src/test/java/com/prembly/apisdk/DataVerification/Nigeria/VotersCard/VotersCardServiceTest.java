package com.prembly.apisdk.DataVerification.Nigeria.VotersCard;


import com.prembly.apisdk.DataVerification.Nigeria.VotersCard.apiModels.LookupVinIdImageRequest;
import com.prembly.apisdk.DataVerification.Nigeria.VotersCard.apiModels.LookupVinIdImageResponse;
import com.prembly.apisdk.DataVerification.Nigeria.VotersCard.apiModels.LookupVinRequest;
import com.prembly.apisdk.DataVerification.Nigeria.VotersCard.apiModels.LookupVinResponse;
import com.prembly.apisdk.DataVerification.Nigeria.VotersCard.service.VotersCardService;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class VotersCardServiceTest {
    private PremblySdkRestClient restClient;
    private VotersCardService votersCardService;

    @BeforeEach
    public void setUp() {
        restClient = mock(PremblySdkRestClient.class);
        votersCardService = new VotersCardService("https://sandbox.myidentitypay.com", restClient);
    }

    @Test
    public void lookupVinIdImageShouldReturnVerificationResponse() {
        LookupVinIdImageRequest request = new LookupVinIdImageRequest();
        request.setImage("https://asset.cloudinary.com/dh3i1wodq/089761016db6dab086ca450bf2465898");

        LookupVinIdImageResponse expectedResponse = new LookupVinIdImageResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        LookupVinIdImageResponse actualResponse = votersCardService.lookupVinIdImage(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void lookupVinShouldReturnVerificationResponse() {
        LookupVinRequest request = new LookupVinRequest();
        request.setLastName("test");
        request.setNumber("987f545AJ67890");
        request.setState("lagos");

        LookupVinResponse expectedResponse = new LookupVinResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        LookupVinResponse actualResponse = votersCardService.lookupVin(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }
}
