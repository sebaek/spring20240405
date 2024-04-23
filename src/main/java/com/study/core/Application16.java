package com.study.core;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application16 {
    public static void main(String[] args) {
        BeanFactory factory = SpringApplication.run(Application16.class, args);

        MyClass161 bean = factory.getBean(MyClass161.class);
        bean.action();
    }
}

@Component
@RequiredArgsConstructor
class MyClass161 {
    private final MyInterface161 field;

    public void action() {
        field.someMethod();
    }
}

interface MyInterface161 {
    public void someMethod();
}

@Component
class MyClass163 implements MyInterface161 {
    public void someMethod() {
        System.out.println("some action22222");
    }
}

//@Component
class MyClass162 implements MyInterface161 {
    public void someMethod() {
        System.out.println("some action11111111");
    }
}
