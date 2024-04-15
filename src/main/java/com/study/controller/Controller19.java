package com.study.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main19")
public class Controller19 {

    @RequestMapping("sub1")
    public void sub1() {
        System.out.println("Controller19.sub1");
    }

    @RequestMapping("sub2")
    public void sub2(HttpSession session) {
        session.setAttribute("attr", "value");
        System.out.println("Controller19.sub2");
    }

    @RequestMapping("sub3")
    public void sub3(HttpSession session) {
        Object attr = session.getAttribute("attr");
        System.out.println("attr = " + attr); // value
    }

    @RequestMapping("sub4")
    public void sub4(String name, HttpSession session) {
        session.setAttribute("name", name);
    }

    @RequestMapping("sub5")
    public void sub5(HttpSession session) {
        Object name = session.getAttribute("name");
        System.out.println("name = " + name);
    }

    @RequestMapping("sub6")
    public void sub6(HttpServletResponse response) {
        Cookie cookie = new Cookie("cookie-name1", "cookie-value1");
        response.addCookie(cookie);

    }

    @RequestMapping("sub7")
    public void sub7(HttpServletResponse response) {
        // todo : /main19/sub7로 요청 오면 새 쿠키를 추가해서 응답하도록

    }
}
