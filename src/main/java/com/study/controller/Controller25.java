package com.study.controller;

import com.study.domain.*;
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
@RequestMapping("main25")
public class Controller25 {
    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1(@RequestParam(value = "name", required = false) String searchName,
                        Model model) throws SQLException {
        var list = new ArrayList<MyBean251>();
        // jdk 21
        String sql = STR."""
                SELECT *
                FROM Employees
                WHERE LastName = '\{searchName}'
                """;

        // jdk 21 이전
        String sql1 = """
                SELECT *
                FROM Employees
                WHERE LastName = '""" + searchName + "'";

        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try (rs; stmt; conn) {
            while (rs.next()) {
                String id = rs.getString(1);
                String lastName = rs.getString(2);
                String firstName = rs.getString(3);
                String birthDate = rs.getString(4);
                String photo = rs.getString(5);
                String notes = rs.getString(6);

                MyBean251 obj
                        = new MyBean251(id, lastName, firstName, birthDate, photo, notes);
                list.add(obj);
            }

        }
        model.addAttribute("employees", list);
    }

    @GetMapping("sub2")
    public void method2(@RequestParam(value = "name", required = false) String search
            , Model model) throws SQLException {
        // todo : name 요청 파라미터와 일치하는 상품명으로 상품(Products) 조회
        //  예) SELECT * FROM Products WHERE ProductName = 'Chais'
        String sql = STR."""
                SELECT * FROM Products
                WHERE ProductName = '\{search}'
                """;
        var list = new ArrayList<MyBean252>();
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String unit = rs.getString(5);
            double price = rs.getDouble(6);

            MyBean252 product = new MyBean252(id, name, unit, price);
            list.add(product);
        }

        model.addAttribute("products", list);

    }

    @GetMapping("sub3")
    public void method3(String search, Model model) throws SQLException {
        String oldsql = STR."""
                SELECT * FROM Products
                WHERE ProductName = '\{search}'
                """;
        String sql = """
                SELECT * FROM Products
                WHERE ProductName = ?
                """;

        var list = new ArrayList<MyBean252>();
        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        // 첫번째 파라미터:물음표 위치
        // 두번째 파라미터:넣을 값
        pstmt.setString(1, search);

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            MyBean252 row = new MyBean252(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(5),
                    rs.getDouble(6));

            list.add(row);
        }
        model.addAttribute("products", list);
    }

    // todo : 고객 이름을 입력 받아서 고객 정보 조회
    //   sub4메소드와 sub4.jsp 작성
    //  예)SELECT * FROM Customers WHERE CustomerName = ?
    @GetMapping("sub4")
    public String method4(String search, Model model) throws SQLException {
        String sql = "SELECT * FROM Customers WHERE CustomerName = ?";
        var list = new ArrayList<MyBean254Customer>();

        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, search);

        ResultSet rs = pstmt.executeQuery();

        try (rs; conn; pstmt) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String contactName = rs.getString(3);
                String address = rs.getString(4);
                String city = rs.getString(5);
                String postalCode = rs.getString(6);
                String country = rs.getString(7);

                MyBean254Customer obj = new MyBean254Customer();
                obj.setId(id);
                obj.setName(name);
                obj.setContactName(contactName);
                obj.setAddress(address);
                obj.setCity(city);
                obj.setPostalCode(postalCode);
                obj.setCountry(country);

                list.add(obj);
            }
        }
        model.addAttribute("customerList", list);
        model.addAttribute("prevSearch", search);

        return "main25/sub4CustomerList";
    }

    @GetMapping("sub5")
    public String method5(String search, Model model) throws SQLException {
        var list = new ArrayList<MyBean254Customer>();
        String sql = """
                SELECT * FROM Customers
                WHERE CustomerName LIKE ?
                """;
        String keyword = "%" + search + "%";

        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, keyword);
        ResultSet rs = pstmt.executeQuery();

        try (rs; conn; pstmt) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String contactName = rs.getString(3);
                String address = rs.getString(4);
                String city = rs.getString(5);
                String postalCode = rs.getString(6);
                String country = rs.getString(7);

                MyBean254Customer obj = new MyBean254Customer();
                obj.setId(id);
                obj.setName(name);
                obj.setContactName(contactName);
                obj.setAddress(address);
                obj.setCity(city);
                obj.setPostalCode(postalCode);
                obj.setCountry(country);

                list.add(obj);
            }
        }

        model.addAttribute("customerList", list);
        model.addAttribute("prevSearch", search);

        return "main25/sub4CustomerList";
    }

    // todo: 상품명으로 상품들 조회 메소드 작성
    @GetMapping("sub6")
    public String method6(String search, Model model) throws SQLException {
        var list = new ArrayList<MyBean256Product>();

        String sql = """
                SELECT *
                FROM Products
                WHERE ProductName LIKE ?
                """;
        String keyword = "%" + search + "%";
        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, keyword);
        ResultSet rs = pstmt.executeQuery();
        try (rs; conn; pstmt) {
            while (rs.next()) {
                MyBean256Product p = new MyBean256Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setSupplierId(rs.getInt(3));
                p.setCategoryId(rs.getInt(4));
                p.setUnit(rs.getString(5));
                p.setPrice(rs.getDouble(6));
                list.add(p);
            }
        }

        model.addAttribute("prevSearch", search);
        model.addAttribute("products", list);

        return "main25/sub6ProductList";
    }

    // 조회 문자열이 contactName 또는 customerName에 포함된 고객들 조회
    @GetMapping("sub7")
    public String method7(String search, Model model) throws SQLException {
        var list = new ArrayList<MyBean254Customer>();
        String sql = """
                SELECT *
                FROM Customers
                WHERE CustomerName LIKE ?
                   OR ContactName LIKE ?
                """;
        String keyword = "%" + search + "%";
        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, keyword);
        pstmt.setString(2, keyword);

        ResultSet rs = pstmt.executeQuery();

        try (rs; conn; pstmt) {
            while (rs.next()) {
                MyBean254Customer obj = new MyBean254Customer();
                obj.setId(rs.getInt(1));
                obj.setName(rs.getString(2));
                obj.setContactName(rs.getString(3));
                obj.setAddress(rs.getString(4));
                obj.setCity(rs.getString(5));
                obj.setPostalCode(rs.getString(6));
                obj.setCountry(rs.getString(7));
                list.add(obj);
            }
        }
        model.addAttribute("prevSearch", search);
        model.addAttribute("customerList", list);
        return "main25/sub4CustomerList";
    }

    // todo:
    //  조회 문자열이 last name 또는 first name에 포함된 직원들 조회 메소드 작성
    @GetMapping("sub8")
    public String method8(String name, Model model) throws SQLException {
        var list = new ArrayList<MyBean258Employee>();
        String sql = """
                SELECT *
                FROM Employees
                WHERE LastName LIKE ?
                   OR FirstName LIKE ?
                """;
        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "%" + name + "%");
        pstmt.setString(2, "%" + name + "%");
        ResultSet rs = pstmt.executeQuery();

        try (rs; conn; pstmt) {
            while (rs.next()) {
                MyBean258Employee row = new MyBean258Employee();
                row.setId(rs.getInt(1));
                row.setLastName(rs.getString(2));
                row.setFirstName(rs.getString(3));
                row.setBirthDate(rs.getString(4));
                row.setPhoto(rs.getString(5));
                row.setNotes(rs.getString(6));

                list.add(row);

            }
        }

        model.addAttribute("prevSearch", name);
        model.addAttribute("employeeList", list);

        return "main25/sub8EmployeeList";
    }

}
