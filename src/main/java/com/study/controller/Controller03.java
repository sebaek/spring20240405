package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main3")
public class Controller03 {

    // 경로 : /main3/sub1
    @RequestMapping("sub1")
    public void method1() {
        System.out.println("Controller03.method1");
    }

    // 경로 : /main3/sub2 
}
