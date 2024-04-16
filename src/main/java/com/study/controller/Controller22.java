package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("main22")
public class Controller22 {
    @GetMapping("sub1")
    public String sub1() {
        // view forward
        return "/main22/sub1";
    }

    @GetMapping("sub2")
    public String sub2() {
        // redirect: 접두어 붙이면
        // redirection 응답 (302) 함
        // 브라우저는 302 응답을 받으면
        // Location 헤더에 있는 값으로
        // 다시 요청을 보냄

        return "redirect:/main22/sub1";
    }

    @GetMapping("sub3")
    public void method3() {
        // login form 있는 jsp (view)로 forward
    }

    @PostMapping("sub4")
    public String method4(String id, String password,
                          RedirectAttributes redirectAttributes) {
        boolean ok = id.equals(password);

        if (ok) {
            // 로그인 성공 시
            // 성공 후 보여주는 페이지로 이동
            redirectAttributes.addAttribute("type", "login");

            return "redirect:/main22/sub5";
        } else {
            // 로그인 실패 시
            // 로그인 form 있는 페이지로 이동
            redirectAttributes.addAttribute("type", "fail");

            return "redirect:/main22/sub3";
        }

    }

    @GetMapping("sub5")
    public void method5() {

    }

    @GetMapping("sub6")
    public void method6() {
        // login form 있는 view로 포워드
        // todo: jsp 작성
    }

    @PostMapping("sub7")
    public String method7(String id, String password) {
        // todo : 아래 코드를 작성하기
        //  id와 password가 일치하면 로그인 성공, 아니면 실패
        //  실패면 login form으로 이동하라는 redirect 응답
        //  성공이면 로그인 성공했다는 경로로 redirect 응답
        return null;
    }

    // todo : 성공 경로 /main22/sub8 에서 일하는 메소드와 jsp 만들기


    @GetMapping("sub9")
    public String method9(RedirectAttributes rttr) {
        String condition = "";
        if (Math.random() < 0.5) {
            condition = "ok";
        } else {
            condition = "fail";
        }
        // redirection 시 정보전달은 RedirectAttributes 활용
        rttr.addAttribute("condition", condition);
        rttr.addAttribute("type", "soccer");
        rttr.addAttribute("address", "신촌");
        rttr.addAttribute("city", "서울");

        // query string
        return "redirect:/main22/sub10";
    }

    @GetMapping("sub10")
    public void method10(String condition) {
        System.out.println("condition = " + condition);
    }

    @GetMapping("sub11")
    public String method11(RedirectAttributes rttr) {
        // redirection 시 정보 전달은 RedirectAttributes 활용
        // addAttribute : 쿼리스트링에 붙음
        rttr.addAttribute("type", "soccer");

        // addFlashAttribute : 모델에 붙음
        rttr.addFlashAttribute("attr1", List.of("car", "food", "phone"));

        return "redirect:/main22/sub12";
    }

    //    @GetMapping("sub12")
//    public void method12(Model model) {
//        Object attr1 = model.getAttribute("attr1");
//        System.out.println("attr1 = " + attr1);
//    }
    @GetMapping("sub12")
    public void method12(@ModelAttribute("attr1") List<String> attr1) {
        System.out.println("attr1 = " + attr1);
    }

    @GetMapping("sub13")
    public void method13() {
    }

    @PostMapping("sub14")
    public String method14(String id, String pw, RedirectAttributes rttr) {
        boolean ok = id.equals(pw);
        if (ok) {
            // 로그인 성공시
            // 메인 페이지로 redirect
            rttr.addFlashAttribute("message", "로그인 성공하였습니다.");
            return "redirect:/main22/sub15";
        } else {
            // 로그인 실패시
            // 로그인 페이지로 redirect
            rttr.addFlashAttribute("message", "아이디와 패스워드를 확인해주세요");
            return "redirect:/main22/sub13";

        }
    }

    @GetMapping("sub15")
    public void method15() {
    }

    // todo:(13, 14, 15)와 같은 일을 하는 (16, 17, 18) 작성

}
