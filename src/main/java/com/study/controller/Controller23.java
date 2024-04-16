package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@Controller
@RequestMapping("main23")
public class Controller23 {
    @RequestMapping("sub1")
    public void method1() {
        // 요청 파라미터 분석/가공
        // 비즈니스 로직 실행
        String sql = """
                SELECT FirstName FROM Employees
                """;
        // 1. db와 연결
        Connection con = null;
        // 2. 실행 준비
        Statement statement = con.createStatement();
        // 3. 쿼리 실행
        ResultSet resultSet = statement.executeQuery(sql);

        // 4. 결과 가공
        while (resultSet.next()) { // 각 행을 탐색
            String name = resultSet.getString(1); // 첫번째 컬럼의 값 얻기
            list.add(name);
        }

        // 5. 자원 닫기

        // 모델에 결과 넣고
        model.addAttribute("nameList", list);
        // view로 포워드
    }
}
