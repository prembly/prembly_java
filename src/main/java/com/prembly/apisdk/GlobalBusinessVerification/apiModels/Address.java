package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import lombok.Data;

import java.util.List;

@Data
public class Address {
    private Long id;
    private String address;
    private String countryId;
    private List<Object> companies;
}
