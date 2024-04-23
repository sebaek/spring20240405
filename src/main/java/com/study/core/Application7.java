package com.study.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application7 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(Application7.class, args);
        MyClass71 b1 = context.getBean(MyClass71.class);
        System.out.println("b1 = " + b1);
        MyClass72 b2 = context.getBean(MyClass72.class);
        System.out.println("b2 = " + b2);

        Object b3 = context.getBean("myClass71");
        System.out.println("b3 = " + b3);

        Object b4 = context.getBean("someMethod1");
        System.out.println("b4 = " + b4);

    }
}

@Component
class MyClass71 {

}

@Configuration
class MyConfiguration7 {

    // @Component 애노테이션을 붙일 수 없는
    // 클래스로 Spring Bean 만들기
    // 이름은 메소드명으로 결정됨
    @Bean
    public MyClass72 someMethod1() {
        return new MyClass72();
    }

}

class MyClass72 {

}
