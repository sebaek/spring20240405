package com.study.controller;

import com.study.domain.MyBean201;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("main20")
public class Controller20 {
    @RequestMapping("sub1")
    public void sub1() {
    }

    @RequestMapping("sub2")
    public void sub2() {
    }

    @RequestMapping("sub3")
    public void sub3() {
    }

    @RequestMapping("sub4")
    public void sub4() {
    }

    @RequestMapping("sub5")
    public void sub5(String player, Model model) {
        // 1. 요청 분석/가공
        // 2. 비즈니스 로직 처리
        // 3. 결과를 모델에 담고
        model.addAttribute("result", player + "검색 결과");
        // 4. 뷰로 forward(뷰 이름 리턴)

    }

    @RequestMapping("sub6")
    public void sub6(String address, String type, Model model) {
        model.addAttribute("result", address + "의 " + type + " 검색 결과");
    }

    @RequestMapping("sub7")
    public void sub7(String name,
                     Integer age,
                     LocalDate birth,
                     String address,
                     String hobby,
                     Model model) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("birth = " + birth);
        System.out.println("address = " + address);
        System.out.println("hobby = " + hobby);

    }

    @RequestMapping("sub8")
    public void sub8(@ModelAttribute MyBean201 data) {
        // @ModelAttribute 생략 가능
        System.out.println(data);
    }

    @RequestMapping("sub9")
    public void sub9() {
        //todo: sub9.jsp 만들고
        // city, address, title, content
        // 의 요청 파라미터 입력받고 전송하는
        // form 요소 작성
        // 전송 위치 : /main20/sub10
    }

    // /main20/sub10 요청 경로에서 일하는 메소드 작성
    // city, address, title, content 의 요청 파라미터가
    // MyBean202 객체의 property로 바인딩 되도록 코드 작성


}
