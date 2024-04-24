package com.study.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class MyBean333 {
    private String title;
    private String name;
    private Integer age;
    private Double price;
    private LocalDate published;
    private LocalDateTime inserted;
}
