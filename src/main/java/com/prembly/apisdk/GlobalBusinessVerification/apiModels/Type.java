package com.prembly.apisdk.GlobalBusinessVerification.apiModels;

import lombok.Data;

import java.util.Map;

@Data
public class Type {
    private Integer id;
    private String name;
    private Map<String,String> translation;
}
