package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main8")
public class Controller08 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        // 요청 분석/가공
        // 비즈니스 로직 처리
        // 결과를 model에 담고
        model.addAttribute("name1", "value1");
        model.addAttribute("name2", "value2");

        // view로 포워딩 (/WEB-INF/view/main8/sub1.jsp)

    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        model.addAttribute("city", "서울");
        model.addAttribute("address", "신촌");

        // todo : 적절한 jsp를 작성해서 "서울", "신촌" 출력되도록
    }

    @RequestMapping("sub3")
    public void method3(Model model) {
        model.addAttribute("name", "김민재");
        model.addAttribute("age", 33);
    }

    @RequestMapping("sub4")
    public void method4(Model model) {
        // model attribute의 name : String
        // model attribute의 value : Object

        // 따라서 model attribute의 value는 무엇이든 될 수 있다.
        // 자주 사용하는 타입
        // String, 기본타입(Wrapper)
        // 배열, List, Map
        // JavaBeans

        // 배열
        model.addAttribute("car",
                new String[]{"tesla", "kia", "hyundai"});


    }

    @RequestMapping("sub5")
    public void method5(Model model) {
        model.addAttribute("cities",
                new String[]{"서울", "대구", "부산"});
        model.addAttribute("countries",
                new String[]{"한국", "미국", "케냐"});

        // TODO : 적절한 jsp 작성 후
        // 서울, 대구, 부산, 한국, 미국, 케냐

    }
}
