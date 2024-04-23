package com.study.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application8 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(Application8.class, args);
        MyClass81 b1 = context.getBean(MyClass81.class);
        MyClass82 b2 = context.getBean(MyClass82.class);
        Object b3 = context.getBean("myBean81");
        Object b4 = context.getBean("myBean82");
        System.out.println(b1 == b3); // true
        System.out.println(b2 == b4); // true

    }
}

// todo : @Configuration 클래스와 @Bean 메소드 2개 작성


class MyClass81 {
}

class MyClass82 {
}
