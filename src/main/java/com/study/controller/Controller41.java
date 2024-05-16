package com.study.controller;


import com.study.domain.MyBean411;
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

    @PostMapping("sub4")
    public void sub4(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);
    }

    @PostMapping("sub5")
    public void sub5(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);
        Object name = map.get("name");
        System.out.println("name.getClass() = " + name.getClass());

        Object age = map.get("age");
        System.out.println("age.getClass() = " + age.getClass());

        Object item = map.get("item");
        System.out.println("item.getClass() = " + item.getClass());

        Object married = map.get("married");
        System.out.println("married.getClass() = " + married.getClass());

        Object team = map.get("team");
        System.out.println("team.getClass() = " + team.getClass());
    }

    @PostMapping("sub6")
    public void sub6(@RequestBody MyBean411 bean411) {
        System.out.println("bean411 = " + bean411);

    }
}
