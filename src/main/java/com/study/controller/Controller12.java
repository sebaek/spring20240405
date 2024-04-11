package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main12")
public class Controller12 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("age", 15);
        model.addAttribute("products", List.of());
//        model.addAttribute("products", List.of("Apple", "Banana"));

//        model.addAttribute("member",
//                Map.of("country", "korea",
//                        "age", 30));

//        model.addAttribute("member",
//                Map.of("country", "korea",
//                        "age", 15));
//
//        model.addAttribute("member",
//                Map.of("country", "us",
//                        "age", 30));
//
        model.addAttribute("member",
                Map.of("country", "us",
                        "age", 15));
        // /main12/sub1.jsp
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
//        model.addAttribute("age", 3); // 어린이용 콘텐츠
//        model.addAttribute("age", 13); // 청소년용 콘텐츠
//        model.addAttribute("age", 23); // 성인용 콘텐츠
        model.addAttribute("age", 33); // 성인용 콘텐츠
    }

    @RequestMapping("sub3")
    public void method3(Model model) {
        model.addAttribute("dan", 6);
    }

    @RequestMapping("sub4")
    public void method4(Model model) {
        model.addAttribute("myList", List.of("java", "css", "react"));
        model.addAttribute("foods", List.of("피자", "햄버거", "찌개", "돈까스"));

        model.addAttribute("myMap", Map.of("son", "london",
                "lee", "paris",
                "kim", "munchen"));

        model.addAttribute("cars", Map.of("tesla", "usa",
                "kia", "korea",
                "volvo", "sweden"));

        model.addAttribute("myList2", List.of("spring", "bootstrap", "prettier"));
        model.addAttribute("myMap2", Map.of("한국", "김치", "미국", "햄버거", "베트남", "쌀국수"));

    }

    @RequestMapping("sub5")
    public void method5(Model model) {
        model.addAttribute("myList", List.of("java", "css", "react"));
    }
}
