package com.study.domain;

public class MyBean091 {
    // name, age 속성(property)가 있음

    // property 명은 getter, setter의 메소드명으로 부터 결정
    // get, set을 제거하고 앞글자를 소문자로 바꾼 것

    public String getName() {
        return "흥민";
    }

    public Integer getAge() {
        return 30;
    }
}
