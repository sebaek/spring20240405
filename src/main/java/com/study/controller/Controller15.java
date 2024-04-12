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

    @RequestMapping("sub3")
    public void sub3() {
    }

    @RequestMapping("sub4")
    public void sub4() {
    }

    @RequestMapping("sub5")
    public void sub5() {
    }

    @RequestMapping("sub6")
    public void sub6() {
    }

}
