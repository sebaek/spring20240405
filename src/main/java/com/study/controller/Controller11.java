package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main11")
public class Controller11 {
    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("num1", 50);
        model.addAttribute("num2", "20");

        model.addAttribute("age1", 15);
        model.addAttribute("age2", "30");

        model.addAttribute("quantity", 30);
        model.addAttribute("price", 1.5);
        // /WEB-INF/view/main11/sub1.jsp
    }
}
