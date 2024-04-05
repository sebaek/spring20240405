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
    @RequestMapping("sub2")
    public void method2() {
        System.out.println("Controller03.method2");
    }

    // 경로 : /main3/sub3
    // 파라미터 : name
    // /main3/sub3?name
    @RequestMapping(value = "sub3", params = "name")
    public void method3() {
        System.out.println("Controller03.method3");
    }

    // /main3/sub3?name&age
    @RequestMapping(value = "sub3", params = {"name", "age"})
    public void method4() {
        System.out.println("Controller03.method4");
    }

    // /main3/sub3?address&city
    // todo: method5 작성
    @RequestMapping(value = "sub3", params = {"address", "city"})
    public void method5() {
        System.out.println("Controller03.method5");
    }


    // todo: 아래 메소드 실행될 수 있는 경로 작성
    // /main3/sub3?country&city
    // /main3/sub3?city&country
    // /main3/sub3?city=seoul&country=korea
    // /main3/sub3?city=tokyo&country=japan
    // /main3/sub3?country=uk&city=london
    @RequestMapping(value = "sub3", params = {"country", "city"})
    public void method6() {
        System.out.println("Controller03.method6");
    }


}
