package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main12")
public class Controller12 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("age", 15);
        model.addAttribute("products", List.of());
//        model.addAttribute("products", List.of("Apple", "Banana"));
        // /main12/sub1.jsp
    }
}
