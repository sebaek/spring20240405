package com.study.core;

import lombok.Getter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application15 {
    public static void main(String[] args) {
        BeanFactory bf = SpringApplication.run(Application15.class, args);
        MyClass152 d = bf.getBean(MyClass151.class).getDependency();
        // todo ; null이 아니게 setter 주입 활용한 코드 작성
        System.out.println("d = " + d);
    }
}

@Getter
@Component
class MyClass151 {
    private MyClass152 dependency;

    @Autowired
    public void setDependency(MyClass152 dependency) {
        this.dependency = dependency;
    }
}

@Component
class MyClass152 {
}