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
}
