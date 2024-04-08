package com.study.controller;

import com.study.domain.MyBean091;
import com.study.domain.MyBean092;
import com.study.domain.MyBean093;
import com.study.domain.MyBean094;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main9")
public class Controller09 {

    @RequestMapping("sub1")
    public void sub1(Model model) {
        MyBean091 myBean09 = new MyBean091();
        model.addAttribute("person", myBean09);
    }

    @RequestMapping("sub2")
    public void sub2(Model model) {
        MyBean092 obj = new MyBean092();
        obj.setAge(20);
        obj.setName("흥민");

        MyBean092 obj2 = new MyBean092();
        obj2.setAge(60);
        obj2.setName("차범근");

        model.addAttribute("person", obj);
        model.addAttribute("person2", obj2);
    }

    @RequestMapping("sub3")
    public void sub3(Model model) {
        MyBean093 obj1 = new MyBean093();
        obj1.setAge(20);
        obj1.setAddress("신촌");
        obj1.setCity("서울");
        MyBean093 obj2 = new MyBean093();
        obj2.setAge(60);
        obj2.setAddress("해운대");
        obj2.setCity("부산");

        model.addAttribute("member1", obj1);
        model.addAttribute("member2", obj2);
        // todo: jsp 만들기
    }

    @RequestMapping("sub4")
    public void sub4(Model model) {
        MyBean094 obj1 = new MyBean094();
        obj1.setModelNumber("k5");
        obj1.setProductPrice(5000);
        obj1.setWeight(2400.50);
        obj1.setName("kia");
        obj1.setUsed(true);

        model.addAttribute("car", obj1);
    }

}
