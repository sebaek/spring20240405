package com.study.core;

import lombok.Getter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application9 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(Application9.class, args);
        MyClass91 b1 = context.getBean(MyClass91.class);
        MyClass92 b2 = context.getBean(MyClass92.class);
        MyClass91 b3 = b2.getMyClass91();

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
    }
}

@Component
class MyClass91 {
}

@Component
@Getter
class MyClass92 {
    // dependency injection 방법
    // 1. 필드에 주입
    // 2. 생성자 주입
    // 3. setter 주입

    @Autowired
    private MyClass91 myClass91; // dependency
}
