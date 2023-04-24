package com.prembly.apisdk.DataVerification.Nigeria.BankAccount.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BankCode {
    private String name;
    private String slug;
    private String code;
    private String longcode;
    private String gateway;
    @JsonProperty("pay_with_bank")
    private Boolean payWithBank;
    private Boolean active;
    @JsonProperty("is_deleted")
    private Boolean isDeleted;
    private String country;
    private String currency;
    private String type;
    private Integer id;
    private String createdAt;
    private String updatedAt;
}
