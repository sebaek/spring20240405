package com.study.mapper;

import com.study.domain.MyBean331;
import com.study.domain.MyBean332;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Mapper04 {

    @Select("""
            SELECT string_col stringCol,
                    int_col intCol,
                    dec_col decCol,
                    date_col dateCol,
                    date_time_col dateTimeCol
            FROM my_table9
            """)
    List<MyBean331> select1();

    @Select("""
            SELECT string_col stringCol,
                    int_col intCol,
                    dec_col decCol,
                    date_col dateCol,
                    date_time_col dateTimeCol
            FROM my_table9
            """)
    List<MyBean332> select2();
}
