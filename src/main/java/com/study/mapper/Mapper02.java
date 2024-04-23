package com.study.mapper;

import com.study.domain.MyBean254Customer;
import com.study.domain.MyBean256Product;
import com.study.domain.MyBean258Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Mapper02 {

    @Select("SELECT NOW()")
    public String selectNow();


    // 조회 결과의 컬럼명과 
    // 리턴타입의 객체 프로퍼티명이 같으면
    // 값을 바인딩 해줌
    @Select("""
            SELECT ContactName, Address, City, Country
            FROM Customers
            WHERE CustomerID = 1
            """)
    MyBean254Customer selectOneCustomer();

    @Select("""
            SELECT *
            FROM Customers
            WHERE CustomerID = 1
            """)
    MyBean254Customer selectOneCustomer2();

    @Select("""
            SELECT CustomerID id,
                   CustomerName name,
                   ContactName,
                   Address,
                   City,
                   Country,
                   PostalCode
            FROM Customers
            WHERE CustomerID = 1
            """)
    MyBean254Customer selectOneCustomer3();

    @Select("""
            SELECT EmployeeID id,
                   FirstName,
                   LastName,
                   Notes,
                   Photo,
                   BirthDate
            FROM Employees
            WHERE EmployeeID = 2
            """)
    MyBean258Employee selectOneEmployee1();

    @Select("""
            SELECT EmployeeID id,
                   LastName,
                   FirstName,
                   Photo,
                   Notes,
                   BirthDate
            FROM Employees
            WHERE EmployeeID = #{id}
            """)
    MyBean258Employee selectOneEmployee2(Integer id);

    @Select("""
            SELECT CustomerID id,
                   CustomerName name,
                   ContactName,
                   Address,
                   City,
                   Country,
                   PostalCode
            FROM Customers
            WHERE CustomerID = #{id}
            """)
    MyBean254Customer selectOneCustomer4(Integer id);

    @Select("""
            SELECT CustomerID id,
                   CustomerName name,
                   ContactName,
                   Address,
                   City,
                   Country,
                   PostalCode
            FROM Customers
            """)
    List<MyBean254Customer> selectAllCustomer1();

    @Select("""
            SELECT EmployeeID id,
                   LastName,
                   FirstName,
                   Photo,
                   Notes,
                   BirthDate
            FROM Employees
            ORDER BY BirthDate DESC
            """)
    List<MyBean258Employee> selectAllEmployees1();


    @Select("""
            SELECT CustomerID id,
                   CustomerName name,
                   ContactName,
                   Address,
                   City,
                   Country,
                   PostalCode
            FROM Customers
            WHERE Country = #{country1} 
               OR Country = #{country2}
            ORDER BY Country 
            """)
    List<MyBean254Customer> selectCustomersByCountry(String country1, String country2);

    @Select("""
            SELECT ProductID id,
                   ProductName name,
                   CategoryId,
                   SupplierId,
                   Unit,
                   Price
            FROM Products
            WHERE Price BETWEEN #{from} AND #{to}
            ORDER BY Price
            """)
    List<MyBean256Product> selectProductsByPriceBetween(Double from, Double to);
}
