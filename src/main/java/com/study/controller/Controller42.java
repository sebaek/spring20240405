package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/main42")
public class Controller42 {

    @GetMapping("sub1")
    @ResponseBody
    public String method1() {

        return "어떤 데이터";
    }

    @GetMapping("sub2")
    @ResponseBody
    public String method2() {
        double random = Math.random();
        String result = "";
        if (random < 1.0 / 3) {
            return "가위";
        } else if (random < 2.0 / 3) {
            return "바위";
        }
        return "보";
    }
}
