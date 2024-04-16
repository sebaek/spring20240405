package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("main21")
public class Controller21 {

    // /main21/sub1
    @RequestMapping(value = "sub1",
            method = {RequestMethod.GET, RequestMethod.POST})
    public void method1() {
        System.out.println("Controller21.method1");
    }

    @RequestMapping("sub2")
    public void method2() {
    }

    // GET /main21/sub3
    @RequestMapping(value = "sub3", method = RequestMethod.GET)
    public void method3() {
        System.out.println("Controller21.method3");
    }

    // POST /main21/sub3
    @RequestMapping(value = "sub3", method = RequestMethod.POST)
    public void method4() {
        System.out.println("Controller21.method4");
    }

}
