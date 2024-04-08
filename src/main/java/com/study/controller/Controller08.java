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
}
