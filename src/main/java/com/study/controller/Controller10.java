package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("main10")
public class Controller10 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        // 요청 분석
        // 비즈니스 로직 실행
        // 결과를 모델에 담고
        var data = new HashMap<String, List>();
        data.put("key1", List.of("java", "css"));
        data.put("key2", List.of("react", "vue"));
        model.addAttribute("myList", data);
        // view로 포워딩 (/WEB-INF/view/main10/sub1.jsp)

    }
}
