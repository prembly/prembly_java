package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccountRatingItem {
    @JsonProperty("NoOfHomeLoanAccountsGood")
    private String noOfHomeLoanAccountsGood;

    @JsonProperty("NoOfHomeLoanAccountsBad")
    private String noOfHomeLoanAccountsBad;

    @JsonProperty("NoOfAutoLoanccountsGood")
    private String noOfAutoLoanccountsGood;

    @JsonProperty("NoOfAutoLoanAccountsBad")
    private String noOfAutoLoanAccountsBad;

    @JsonProperty("NoOfStudyLoanAccountsGood")
    private String noOfStudyLoanAccountsGood;

    @JsonProperty("NoOfStudyLoanAccountsBad")
    private String noOfStudyLoanAccountsBad;

    @JsonProperty("NoOfPersonalLoanAccountsGood")
    private String noOfPersonalLoanAccountsGood;

    @JsonProperty("NoOfPersonalLoanAccountsBad")
    private String noOfPersonalLoanAccountsBad;

    @JsonProperty("NoOfCreditCardAccountsGood")
    private String noOfCreditCardAccountsGood;

    @JsonProperty("NoOfCreditCardAccountsBad")
    private String noOfCreditCardAccountsBad;

    @JsonProperty("NoOfRetailAccountsGood")
    private String noOfRetailAccountsGood;

    @JsonProperty("NoOfRetailAccountsBad")
    private String noOfRetailAccountsBad;

    @JsonProperty("NoOfJointLoanAccountsGood")
    private String noOfJointLoanAccountsGood;

    @JsonProperty("NoOfJointLoanAccountsBad")
    private String noOfJointLoanAccountsBad;

    @JsonProperty("NoOfTelecomAccountsGood")
    private String noOfTelecomAccountsGood;

    @JsonProperty("NoOfTelecomAccountsBad")
    private String noOfTelecomAccountsBad;

    @JsonProperty("NoOfOtherAccountsGood")
    private String noOfOtherAccountsGood;

    @JsonProperty("NoOfOtherAccountsBad")
    private String noOfOtherAccountsBad;
}
