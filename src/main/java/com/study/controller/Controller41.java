package com.study.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/api/main41")
public class Controller41 {

    @PostMapping("sub1")
    public void sub1(@RequestBody Map<String, Object> map) {
        // @RequestBody
        // 역직렬화(파싱, 디코딩) JSON -> Map
        System.out.println("map = " + map);
    }

    @PostMapping("sub2")
    public void sub2(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);
    }

    @PostMapping("sub3")
    public void sub3(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);
    }
}
