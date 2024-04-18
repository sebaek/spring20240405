package com.study.controller;

import com.study.domain.MyBean261Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;

@Controller
@RequestMapping("main26")
public class Controller26 {
    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public String sub1(String start,
                       String end,
                       Model model) throws SQLException {
        // todo : 메소드 작성하세요.
        //  between 활용
        String sql = """
                SELECT * 
                FROM Orders
                WHERE OrderDate BETWEEN ? AND ?
                """;

        var list = new ArrayList<MyBean261Order>();

        Connection con = dataSource.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, start);
        pstmt.setString(2, end);

        ResultSet rs = pstmt.executeQuery();

        try (rs; pstmt; con;) {
            while (rs.next()) {
                MyBean261Order order = new MyBean261Order();
                order.setId(rs.getInt(1));
                order.setCustomerId(rs.getInt(2));
                order.setEmployeeId(rs.getInt(3));
                order.setDate(rs.getString(4));
                order.setShipperId(rs.getInt(5));

                list.add(order);
            }
        }

        model.addAttribute("prevStart", start);
        model.addAttribute("prevEnd", end);
        model.addAttribute("orderList", list);

        return "main26/sub1OrderList";
    }

    @GetMapping("sub2")
    public String method2(Model model) throws Exception {

        String sql = """
                SELECT DISTINCT Country
                FROM Customers
                """;
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        var countryList = new ArrayList<String>();
        try (stmt; rs;) {
            while (rs.next()) {
                countryList.add(rs.getString(1));
            }
            model.addAttribute("countryList", countryList);
        }

        return "main25/sub4CustomerList";
    }
}
