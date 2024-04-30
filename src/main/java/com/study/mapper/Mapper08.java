package com.study.mapper;

import com.study.domain.MyBean258Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Mapper08 {
    @Select("""
             <script>
             SELECT * 
             FROM Employees
             WHERE LastName = 'abc'
                <if test="false">
                OR FirstName = 'abc'
                </if>
            </script>
             """)
    List<MyBean258Employee> query1();
}
