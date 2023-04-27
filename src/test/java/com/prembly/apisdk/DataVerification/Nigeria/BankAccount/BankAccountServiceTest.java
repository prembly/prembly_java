package com.prembly.apisdk.DataVerification.Nigeria.BankAccount;

import com.prembly.apisdk.DataVerification.Nigeria.BankAccount.apiModels.*;
import com.prembly.apisdk.DataVerification.Nigeria.BankAccount.service.BankAccountService;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class BankAccountServiceTest {
    private PremblySdkRestClient restClient;
    private BankAccountService bankAccountService;
    @BeforeEach
    public void setUp() {
        restClient = mock(PremblySdkRestClient.class);
        bankAccountService = new BankAccountService("https://sandbox.myidentitypay.com", restClient);
    }
    @Test
    public void getBankCodesShouldReturnVerificationResponse() {
        GetBankCodesResponse expectedResponse = new GetBankCodesResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setResponseCode("00");

        when(restClient.get(any(), any())).thenReturn(expectedResponse);

        GetBankCodesResponse actualResponse = bankAccountService.getBankCodes();

        verify(restClient, times(1)).get(any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getResponseCode(), actualResponse.getResponseCode());
    }

    @Test
    public void accountNumberOnePointZeroShouldReturnVerificationResponse() {
        AccountNumberRequest request = new AccountNumberRequest();
        request.setBankCode("214");
        request.setNumber("4444444444");

        AccountNumberOnePointZeroResponse expectedResponse = new AccountNumberOnePointZeroResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setDetail("Verification Successfull");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        AccountNumberOnePointZeroResponse actualResponse = bankAccountService.accountNumberOnePointZero(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getDetail(), actualResponse.getDetail());
    }

    @Test
    public void accountWithNameComparisonShouldReturnVerificationResponse() {
        AccountWithNameComparisonRequest request = new AccountWithNameComparisonRequest();
        request.setBankCode("214");
        request.setNumber("4444444444");
        request.setCustomerName("Testing");
        request.setCustomerReference("284848934848");

        AccountWithNameComparisonResponse expectedResponse = new AccountWithNameComparisonResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setDetail("Verification Successful");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        AccountWithNameComparisonResponse actualResponse = bankAccountService.accountWithNameComparison(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getDetail(), actualResponse.getDetail());
    }

    @Test
    public void accountNumberTwoPointZeroShouldReturnVerificationResponse() {
        AccountNumberRequest request = new AccountNumberRequest();
        request.setBankCode("214");
        request.setNumber("4444444444");

        AccountNumberTwoPointZeroResponse expectedResponse = new AccountNumberTwoPointZeroResponse();
        expectedResponse.setStatus(true);
        expectedResponse.setDetail("Verification Successful");

        when(restClient.post(any(), any(), any())).thenReturn(expectedResponse);

        AccountNumberTwoPointZeroResponse actualResponse = bankAccountService.accountNumberTwoPointZero(request);

        verify(restClient, times(1)).post(any(), any(), any());
        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getDetail(), actualResponse.getDetail());
    }
}
