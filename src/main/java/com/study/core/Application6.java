package com.study.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application6 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(Application6.class, args);
        Object b1 = context.getBean("mybean61");
        Object b2 = context.getBean("myClass62");
        Object b3 = context.getBean(MyClass61.class);
        Object b4 = context.getBean(MyClass62.class);
        System.out.println(b1 == b3); // true
        System.out.println(b2 == b4); // true

    }
}

// todo : 2개 Component(Spring Bean) 만들기
@Component("mybean61")
class MyClass61 {
}

@Component
class MyClass62 {
}
