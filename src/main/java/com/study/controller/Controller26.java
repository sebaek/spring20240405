package com.study.controller;

import com.study.domain.MyBean254Customer;
import com.study.domain.MyBean256Product;
import com.study.domain.MyBean261Order;
import com.study.domain.MyBean263Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String method2(String[] country, Model model) throws Exception {
        Connection conn = dataSource.getConnection();

        if (country != null && country.length > 0) {
            String questionMarks = "";
            for (int i = 0; i < country.length; i++) {
                questionMarks = questionMarks + "?";
                if (i != country.length - 1) {
                    questionMarks = questionMarks + ",";
                }
            }
            String customerSql = STR."""
                SELECT *
                FROM Customers
                WHERE Country IN (\{questionMarks})
                """;

            var customerList = new ArrayList<MyBean254Customer>();
            PreparedStatement pstmt = conn.prepareStatement(customerSql);
            for (int i = 0; i < country.length; i++) {
                pstmt.setString((i + 1), country[i]);
            }
            ResultSet resultSet = pstmt.executeQuery();
            try (pstmt; resultSet) {

                while (resultSet.next()) {
                    MyBean254Customer data = new MyBean254Customer();
                    data.setId(resultSet.getInt(1));
                    data.setName(resultSet.getString(2));
                    data.setContactName(resultSet.getString(3));
                    data.setAddress(resultSet.getString(4));
                    data.setCity(resultSet.getString(5));
                    data.setPostalCode(resultSet.getString(6));
                    data.setCountry(resultSet.getString(7));
                    customerList.add(data);
                }
                model.addAttribute("customerList", customerList);
            }
        }

        String sql = """
                SELECT DISTINCT Country
                FROM Customers
                """;
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        var countryList = new ArrayList<String>();
        try (stmt; rs; conn) {
            while (rs.next()) {
                countryList.add(rs.getString(1));
            }
            model.addAttribute("countryList", countryList);
        }

        return "main25/sub4CustomerList";
    }

    // todo : 상품 조회 결과가 카테고리, 가격순으로 조회 되도록 코드 수정
    @GetMapping("sub3")
    public String method3(@RequestParam(value = "category", required = false) String[] categorySelect,
                          Model model) throws Exception {
        Connection conn = dataSource.getConnection();

        if (categorySelect != null && categorySelect.length > 0) {

            String marks = "";
            for (int i = 0; i < categorySelect.length; i++) {
                marks += "?";
                if (i != categorySelect.length - 1) {
                    marks += ",";
                }
            }
            String sql = STR."""
                SELECT *
                FROM Products
                WHERE CategoryId IN (\{marks})
                ORDER BY CategoryId, Price
                """;

            PreparedStatement pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < categorySelect.length; i++) {
                pstmt.setString((i + 1), categorySelect[i]);
            }

            ResultSet resultSet = pstmt.executeQuery();

            var productList = new ArrayList<MyBean256Product>();
            try (resultSet; pstmt;) {

                while (resultSet.next()) {
                    MyBean256Product p = new MyBean256Product();
                    p.setId(resultSet.getInt(1));
                    p.setName(resultSet.getString(2));
                    p.setSupplierId(resultSet.getInt(3));
                    p.setCategoryId(resultSet.getInt(4));
                    p.setUnit(resultSet.getString(5));
                    p.setPrice(resultSet.getDouble(6));

                    productList.add(p);
                }
                model.addAttribute("prevCategorySelect", categorySelect);
                model.addAttribute("products", productList);
            }
        }


        String categorySql = "SELECT * FROM Categories";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(categorySql);
        var categoryList = new ArrayList<MyBean263Category>();
        try (rs; stmt;) {
            while (rs.next()) {
                MyBean263Category category = new MyBean263Category();
                category.setId(rs.getInt(1));
                category.setName(rs.getString(2));

                categoryList.add(category);
            }
            model.addAttribute("categoryList", categoryList);
        }

        return "main25/sub6ProductList";
    }
}
