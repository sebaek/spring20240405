package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Iterator;

@Controller
@RequestMapping("main4")
public class Controller04 {

    // /main4/sub1
    // /main4/sub1?city
    // /main4/sub1?country
    // /main4/sub1?city&country
    // /main4/sub1?city=seoul&country=korea
    @RequestMapping("sub1")
    public void sub1(WebRequest request) {
        Iterator<String> names = request.getParameterNames();

        while (names.hasNext()) {
            String name = names.next();
            System.out.println(name);
        }
    }

    // /main4/sub2?name=son&age=44&city=london&country=uk
    @RequestMapping("sub2")
    public void sub2(WebRequest request) {
        // 콘솔에 name, age, city, country가 출력되도록
        // 코드 작성
        Iterator<String> names = request.getParameterNames();
        while (names.hasNext()) {
            String name = names.next();
//            System.out.println(name);
            String value = request.getParameter(name);
            System.out.println(name + "=" + value);
        }
    }

    // /main4/sub3?query=aespa
    // /main4/sub3?query=bts
    // /main4/sub3?query=newjeans
    @RequestMapping("sub3")
    public void sub3(WebRequest request) {
        String value = request.getParameter("query");

        if (value != null) {
            System.out.println(value + "검색 하기 로직 실행");
            System.out.println("검색결과 응답하기.");
        }
    }

    // /main4/sub4?city=seoul
    // /main4/sub4?city=tokyo
    // /main4/sub4?city=london

    // 콘솔에 도시 정보 출력
}
