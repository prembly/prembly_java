package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private Integer id;
    private String companyId;
    private Integer personId;
    private Integer roleId;
    private Double amount;
    private Double percentage;
    private String appointedOn;
    private String resignedOn;
    private Integer fromCompanyId;
    private Double shares;
    private Double votingShares;
    private String notes;
    private String notifiedOn;
    private Integer sourceNum;
    private String sharesType;
    private Double sharesValue;
    private Double sharesCount;
    private String fromCompany;
    private PersonDetail person;
    private Role role;
    private List<Company> companies;
    private List<String> naturesOfControl;
}
