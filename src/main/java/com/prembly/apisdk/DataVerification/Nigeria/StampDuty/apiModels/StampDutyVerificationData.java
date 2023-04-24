package com.prembly.apisdk.DataVerification.Nigeria.StampDuty.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StampDutyVerificationData {
    @JsonProperty("certificate_number")
    private String certificateNumber;
    @JsonProperty("instrument")
    private String instrument;
    @JsonProperty("reserved_company_name")
    private String reservedCompanyName;
    @JsonProperty("consideration")
    private String consideration;
    @JsonProperty("stamp_duty_paid")
    private String stampDutyPaid;
    @JsonProperty("payment_reference")
    private String paymentReference;
    @JsonProperty("beneficiary")
    private String beneficiary;
    @JsonProperty("beneficiary_tin")
    private String beneficiaryTin;
    @JsonProperty("description")
    private String description;
    @JsonProperty("date_of_execution")
    private String dateOfExecution;
    @JsonProperty("date_of_filing")
    private String dateOfFiling;
    @JsonProperty("issuance_date")
    private String issuanceDate;
}
