package com.study.mapper;

import com.study.domain.MyBean254Customer;
import com.study.domain.MyBean258Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface Mapper07 {

    @Insert("""
            INSERT INTO Employees
            (LastName, FirstName)
            VALUES (#{lastName}, #{firstName})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(MyBean258Employee e);

    @Insert("""
            INSERT INTO Customers
            (CustomerName)
            VALUES (#{name})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertCustomer(MyBean254Customer c);
}
