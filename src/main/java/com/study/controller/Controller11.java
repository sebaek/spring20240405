package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

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

    @RequestMapping("sub2")
    public void method2(Model model) {
        // ${empty attr1} : false
        model.addAttribute("attr1", List.of(3));
        // ${empty attr2} : true
        model.addAttribute("attr2", List.of());

        // ${empty attr3} : false
        model.addAttribute("attr3", Map.of("a", "b"));
        // ${empty attr4} : true
        model.addAttribute("attr4", Map.of());

        model.addAttribute("attr5", null);
    }
}
