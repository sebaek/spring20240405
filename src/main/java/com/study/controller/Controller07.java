package com.study.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("main7")
public class Controller07 {

    @RequestMapping("sub1")
    public void method1(String search, HttpServletResponse resp) throws IOException {
        // 검색 하는 일...
//        String result = search + " 키워드 검색 결과";
        String result = STR."""
                <div style="display:flex;
                    justify-content: center;
                    align-items: center;">
                    <div style="padding: 10px; background-color: skyblue;">
                        \{search} + 키워드 검색 결과
                    </div>
                </div>
                """;

        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().print(result);

    }

    // /main7/sub2
    @RequestMapping("sub2")
    public String method2() {
        // 요청 정보 분석/가공
        // 비즈니스 로직 처리
        // 결과를 모델에 담고
        // view로 포워딩 (view이름 리턴)
        return "view1";
    }

    @RequestMapping("sub3")
    public String method3() {
        return "view2";
        // /WEB-INF/view/view2.jsp 로 포워딩
    }

    @RequestMapping("sub4")
    public String method4() {
        return "view3";
        // /WEB-INF/view/view3.jsp 로 포워딩
        // todo: view3.jsp 만들기
    }

    // /main7/sub5
    @RequestMapping("sub5")
    public String method5() {
        // 요청 경로와 view 이름이 같은 경우가 많음
        return "/main7/sub5";
    }

    // TODO:
    // /main7/sub6 요청을 처리하는 메소드 작성
    @RequestMapping("sub6")
    public String method6() {
        // /WEB-INF/view/main7/sub6.jsp 가 응답
//        return "/main7/sub6";
        // 요청경로와 같은 view의 이름으로 결정됨
        return null;

    }

    @RequestMapping("sub7")
    public void method7() {
        // 요청 경로와 같은 view의 이름으로 결정됨
        // view : /WEB-INF/view/main7/sub7.jsp
    }

    // TODO: /main7/sub8로 요청왔을 때 일하는 method8 작성, jsp도 작성
    // 이 메소드는 /WEB-INF/view/main7/sub8.jsp로 포워드 하도록
    @RequestMapping("sub8")
    public void method8() {
        System.out.println("Controller07.method8");
    }

}









