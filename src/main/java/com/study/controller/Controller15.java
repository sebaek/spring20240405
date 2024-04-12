package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main15")
public class Controller15 {

    @RequestMapping("sub1")
    public void sub1() {
        // /WEB-INF/view/main15/sub1.jsp 로 포워드
    }

    @RequestMapping("sub2")
    public void sub2() {
        // /WEB-INF/view/main15/sub2.jsp 로 포워드
    }
}
