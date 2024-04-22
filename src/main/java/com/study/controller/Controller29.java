package com.study.controller;

import com.study.domain.MyBean254Customer;
import com.study.domain.MyBean258Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Controller
@RequestMapping("main29")
public class Controller29 {
    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1(Integer id, Model model) throws SQLException {
        if (id != null) {
            String sql = """
                    SELECT *
                    FROM Customers
                    WHERE CustomerId = ?
                    """;
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            try (rs; pstmt; conn) {
                if (rs.next()) {
                    MyBean254Customer c = new MyBean254Customer();
                    c.setId(rs.getInt(1));
                    c.setName(rs.getString(2));
                    c.setContactName(rs.getString(3));
                    c.setAddress(rs.getString(4));
                    c.setCity(rs.getString(5));
                    c.setPostalCode(rs.getString(6));
                    c.setCountry(rs.getString(7));

                    model.addAttribute("customer", c);
                }
            }

        }

    }

    @PostMapping("sub1/delete")
    public String method2(Integer id, RedirectAttributes rttr) throws SQLException {
        String sql = """
                DELETE FROM Customers
                WHERE CustomerId = ?
                """;
        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);

        try (pstmt; conn) {
            int rowCount = pstmt.executeUpdate();
            if (rowCount > 0) {
                rttr.addFlashAttribute("message", id + "번 고객이 삭제 되었습니다.");
            } else {
                rttr.addFlashAttribute("message", "삭제되지 않았습니다.");
            }
        }


        return "redirect:/main29/sub1";

    }

    // todo; 직원 지우기
    @GetMapping("sub2")
    public void method3(Integer id, Model model) throws Exception {
        if (id != null) {

            String sql = """
                    SELECT *
                    FROM Employees
                    WHERE EmployeeId = ?
                    """;
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            try (rs; pstmt; conn) {
                if (rs.next()) {
                    MyBean258Employee e = new MyBean258Employee();
                    e.setId(rs.getInt(1));
                    e.setLastName(rs.getString(2));
                    e.setFirstName(rs.getString(3));
                    e.setBirthDate(rs.getString(4));
                    e.setPhoto(rs.getString(5));
                    e.setNotes(rs.getString(6));

                    model.addAttribute("employee", e);
                }
            }
        }

    }

    @PostMapping("sub2/delete")
    public String method4(Integer id, RedirectAttributes rttr) throws SQLException {
        String sql = """
                DELETE FROM Employees
                WHERE EmployeeId = ?
                """;
        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        try (pstmt; conn) {
            int rowCount = pstmt.executeUpdate();
            if (rowCount > 0) {
                rttr.addFlashAttribute("message", id + "번 직원이 삭제 되었습니다.");
            } else {
                rttr.addFlashAttribute("message", "삭제되지 않았습니다.");
            }
        }
        return "redirect:/main29/sub2";
    }

}
