package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.creditBureau;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class VerificationData {
    @JsonProperty("Bvn")
    private String bvn;

    @JsonProperty("Phonenumber")
    private String phoneNumber;

    @JsonProperty("LinkedAccounts")
    private String linkedAccounts;

    @JsonProperty("FullName")
    private String fullName;

    @JsonProperty("DateOFBirth")
    private String dateOfBirth;

    @JsonProperty("Gender")
    private String gender;

    @JsonProperty("LinkedEmail")
    private String linkedEmail;

    @JsonProperty("IsLoan")
    private String isLoan;

    @JsonProperty("LoanAmounts")
    private String loanAmounts;

    @JsonProperty("LastUpdatedDate")
    private String lastUpdatedDate;

    @JsonProperty("Score")
    private String score;

    @JsonProperty("Delinquency")
    private String delinquency;

    @JsonProperty("PerformanceSummary")
    private List<PerformanceSummary> performanceSummary;
}
