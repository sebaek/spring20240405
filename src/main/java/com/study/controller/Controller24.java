package com.study.controller;

import com.study.domain.MyBean241;
import com.study.domain.MyBean242;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public void method2(@ModelAttribute("customers") ArrayList<MyBean242> list) throws Exception {
        String sql = """
                SELECT CustomerName, City, Country
                FROM Customers
                """;
        // todo : 조회된 결과를 view에서 보여주기
        //  MyBean242(customerName, city, country) 클래스 만들기

        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        try (conn; stmt; rs) {


            while (rs.next()) {
                String name = rs.getString(1);
                String city = rs.getString(2);
                String country = rs.getString(3);

                MyBean242 data = new MyBean242();
                data.setCustomerName(name);
                data.setCity(city);
                data.setCountry(country);

                list.add(data);
            }
        }
    }

    // todo: 세번째 메소드를 만들어서
    //  고객이 있는 나라들을 중복없이 조회 후 jsp에서 출력
    @GetMapping("sub3")
    public void method3(Model model) throws Exception {
        var list = new ArrayList<String>();
        String sql = "SELECT DISTINCT Country FROM Customers";

        Statement stmt = dataSource.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        try (rs; stmt) {
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        }
        model.addAttribute("countryList", list);
    }
}
