package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main5")
public class Controller05 {

    // /main5/sub1?city=seoul
    // /main5/sub1?city=london
    @RequestMapping("sub1")
    public void method1(@RequestParam("city") String param) {
        System.out.println(param + " 검색 로직 실행");
    }

    // /main5/sub2?address=sinchon
    // /main5/sub2?address=gangnam
    // /main5/sub2?address=hongdae

    // "~ 로 가는 경로 탐색"

}
