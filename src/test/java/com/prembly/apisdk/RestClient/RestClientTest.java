package com.prembly.apisdk.RestClient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@SpringBootTest
public class RestClientTest {
    @Mock
    private RestTemplate restTemplate;
    @InjectMocks
    private PremblySdkRestClient restClient;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testPost() {
        String url = "http://example.com/api";
        String requestBody = "{ \"message\": \"Hello, world!\" }";
        ResponseEntity<String> expectedResponse = new ResponseEntity<>("{\"response\": \"OK\"}", HttpStatus.OK);
        when(restTemplate.postForEntity(eq(url), any(HttpEntity.class), eq(String.class))).thenReturn(expectedResponse);

        String response = restClient.post(url, requestBody, String.class);

        assertEquals("{\"response\": \"OK\"}", response);
    }
}


