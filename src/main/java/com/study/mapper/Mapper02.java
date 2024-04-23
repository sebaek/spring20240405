package com.study.mapper;

import com.study.domain.MyBean254Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
}
