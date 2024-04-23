package com.study.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Mapper03 {

    @Delete("""
            DELETE FROM Customers
            WHERE CustomerId = 1
            """)
    int deleteOneCustomer();


    @Delete("""
            DELETE FROM Customers
            WHERE CustomerId = #{id}
            """)
    int deleteOneCustomerById(int id);

    @Delete("""
            DELETE FROM Employees 
            WHERE EmployeeId = #{e}
            """)
    int deleteEmployeeById(Integer e);
}
