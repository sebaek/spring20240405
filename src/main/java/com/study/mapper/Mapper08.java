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

    @Select("""
            <script>
                SELECT * FROM my_table
                <if test="lastName != null">
                -- lastName이 null이 아닐 때 포함되는 어떤 코드
                </if>
                <if test="lastName == null">
                -- lastName이 null일 때 포함되는 어떤 코드
                </if>
            </script>
            """)
    Object query2(MyBean258Employee e);

    @Select("""
            <script>
                SELECT * FROM my_table
                <if test="firstName == 'lee'">
                         -- firstName 이 lee 일 때 포함되는 코드
                </if>
                <if test="firstName != 'lee'">
                        -- firstName 이 lee가 아닐 때 포함되는 코드
                </if>
            </script>
            """)
    Object query3(MyBean258Employee e);

    @Select("""
            SELECT * FROM my_table

            -- firstName 이 null 일 때 포함되는 코드

            -- firstName 이 null 아닐 때 포함되는 코드

            -- firstName 이 "kim" 일 때 포함되는 코드

            -- firstName 이 "lee" 일 때 포함되는 코드
            """)
    Object query4(MyBean258Employee e);
}
