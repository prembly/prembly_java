package com.prembly.apisdk.DataVerification.Nigeria.BankAccount.service;

import com.prembly.apisdk.DataVerification.Nigeria.BankAccount.apiModels.*;
import com.prembly.apisdk.RestClient.PremblySdkRestClient;
import com.prembly.apisdk.RestClient.config.PremblyApiUrls;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {
    private final PremblySdkRestClient restClient;
    private final PremblyApiUrls premblyApiUrls;
    public BankAccountService(
            @Value("${identitypass.api.baseUrl:}") String baseApiUrl,
            PremblySdkRestClient restClient
    ){
        this.restClient = restClient;
        this.premblyApiUrls = new PremblyApiUrls(baseApiUrl);
    }

    public GetBankCodesResponse getBankCodes(){
        return restClient.get(premblyApiUrls.getGetBankCodesApiUrl(),GetBankCodesResponse.class);
    }

    public AccountNumberOnePointZeroResponse accountNumberOnePointZero(AccountNumberRequest request){
        return restClient.post(premblyApiUrls.getAccountNumberOnePointZeroApiUrl(),request, AccountNumberOnePointZeroResponse.class);
    }

    public AccountWithNameComparisonResponse accountWithNameComparison(AccountWithNameComparisonRequest request){
        return restClient.post(premblyApiUrls.getAccountWithNameComparisonApiUrl(),request, AccountWithNameComparisonResponse.class);
    }

    public AccountNumberTwoPointZeroResponse accountNumberTwoPointZero(AccountNumberRequest request){
        return restClient.post(premblyApiUrls.getAccountNumberTwoPointZeroApiUrl(),request, AccountNumberTwoPointZeroResponse.class);
    }
}
