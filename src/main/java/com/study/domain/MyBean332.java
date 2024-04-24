package com.study.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class MyBean332 {
    private String stringCol; // VARCHAR
    private Integer intCol; // INT
    private Double decCol; // DEC
    private LocalDate dateCol; // DATE
    private LocalDateTime dateTimeCol; // DATETIME
}
