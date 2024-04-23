package com.study.core;

import lombok.Getter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Application10 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(Application10.class, args);
        MyClass101 bean = context.getBean(MyClass101.class);
        MyClass102 field = bean.getField();
        System.out.println("field = " + field); // null이 아니게
    }
}

// todo ; 적절한 annotation 작성
@Configuration
class MyConfiguration10 {
    @Bean
    public MyClass101 myClass101() {
        return new MyClass101();
    }

    @Bean
    public MyClass102 myClass102() {
        return new MyClass102();
    }
}

//@Component
@Getter
class MyClass101 {
    @Autowired
    private MyClass102 field;
}

//@Component
class MyClass102 {

}