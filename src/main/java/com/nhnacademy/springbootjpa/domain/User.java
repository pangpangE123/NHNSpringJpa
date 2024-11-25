package com.nhnacademy.springbootjpa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {

    private String id;
    private String password;
    // TODO 1 age 추가
    private Integer age;
}
