package com.study.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Mapper09 {
    @Select("""
            SELECT CustomerName
            FROM Customers
            WHERE CustomerId = #{id}
            """)
    String selectNameById(Integer id);
}
