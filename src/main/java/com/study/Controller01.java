package com.study;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class Controller01 {

    @RequestMapping("/main1")
    public void method1(WebRequest request, HttpServletResponse response) throws IOException {
        // 1. 요청 분석/가공
        String name = request.getParameter("name");

        // 2. 비즈니스 로직 실행
        String data = name + "님 반갑습니다.";

        String result = STR."""
                <html>
                    <body>
                        <h1>\{data}</h1>
                    </body>
                </html>
                """;

        // 3. 결과 응답
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print(result);

    }
}
