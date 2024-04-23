package com.study.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application12 {
    public static void main(String[] args) {
        BeanFactory bf = SpringApplication.run(Application12.class, args);
        MyClass122 bean = bf.getBean(MyClass122.class);
        MyClass121 field = bean.getField();
        System.out.println("field = " + field); // null 아님
    }
}

@Component
class MyClass121 {
}

@Component
@Getter
@RequiredArgsConstructor
class MyClass122 {
    private final MyClass121 field;


}
