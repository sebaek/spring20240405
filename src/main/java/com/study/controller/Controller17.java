package com.study.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main17")
public class Controller17 {

    @RequestMapping("sub1")
    public void sub1(Model model, HttpSession session) {
        // session : 한 브라우저의 요청들(request)이 공유하는 객체
        model.addAttribute("name", "흥민");
        session.setAttribute("city", "런던");

        // ${model} -> 테슬라
        // ${requestScope.model} -> 테슬라
        // ${sessionScope.model} -> 제네시스
        model.addAttribute("model", "테슬라");
        session.setAttribute("model", "제네시스");
        // /WEB-INF/view/main17/sub1.jsp
    }

    @RequestMapping("sub2")
    public String sub2(Model model) {
        // /WEB-INF/view/main17/sub1.jsp
        return "/main17/sub1";
    }
}
