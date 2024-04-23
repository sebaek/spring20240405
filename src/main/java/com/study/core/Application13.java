package com.study.core;

import lombok.Getter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application13 {
    public static void main(String[] args) {
        BeanFactory bf = SpringApplication.run(Application13.class, args);
        MyClass132 b1 = bf.getBean(MyClass131.class).getField();
        // todo ; 생성자 주입을 활용해서
        //  null 이 아니게
        System.out.println("b1 = " + b1);
    }
}


@Getter
class MyClass131 {
    private MyClass132 field;
}

class MyClass132 {
}
