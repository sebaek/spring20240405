package com.study.domain;


import lombok.Data;

@Data
public class MyBean411 {
    private String name;
    private Integer age;

    public String getDesc() {
        return STR."이름은 \{name}이고 나이는 \{age}세 입니다.";
    }
}
