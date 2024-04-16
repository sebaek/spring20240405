package com.study.controller;

import com.study.domain.MyBean241;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@Controller
@RequestMapping("main24")
public class Controller24 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1(Model model) throws Exception {
        var list = new ArrayList<MyBean241>();
        String sql = """
                SELECT FirstName, LastName
                FROM Employees
                """;
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        try (conn; stmt; rs) {
            while (rs.next()) {
                MyBean241 bean = new MyBean241();
                bean.setFirstName(rs.getString(1));
                bean.setLastName(rs.getString(2));
                list.add(bean);
            }
        }

        model.addAttribute("employees", list);
    }

    @GetMapping("sub2")
    public void method2(Model model) throws Exception {
        String sql = """
                SELECT CustomerName, City, Country
                FROM Customers
                """;
        // todo : 조회된 결과를 view에서 보여주기
        //  MyBean242(customerName, city, country) 클래스 만들기
        
    }

}
