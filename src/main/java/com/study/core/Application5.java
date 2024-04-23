package com.study.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application5 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(Application5.class, args);
        MyClass51 b1 = context.getBean(MyClass51.class);
        System.out.println("b1 = " + b1);
        MyClass52 b2 = context.getBean(MyClass52.class);
        System.out.println("b2 = " + b2);
        Object b3 = context.getBean("myClass51");
        System.out.println("b3 = " + b3);
        Object b4 = context.getBean("mybean1");
        System.out.println("b4 = " + b4);
    }
}

// spring bean의 이름을 주지 않으면
// 클래스명을 lowerCamelCase로 바꾼 것을 이름으로 사용
@Component
class MyClass51 {
}

// spring bean에 이름 부여
@Component("mybean1")
class MyClass52 {
}
