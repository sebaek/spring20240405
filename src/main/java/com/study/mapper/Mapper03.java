package com.study.mapper;

import com.study.domain.MyBean254Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
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

    @Insert("""
            INSERT INTO Customers
            (CustomerName, ContactName, Address, City, PostalCode, Country)
            VALUES 
            (#{name}, #{contactName}, #{address}, #{city}, #{postalCode}, #{country})
            """)
    int insertCustomer(MyBean254Customer customer);
}
