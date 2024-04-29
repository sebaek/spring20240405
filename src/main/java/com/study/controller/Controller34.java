package com.study.controller;

import com.study.mapper.Mapper05;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main34")
@RequiredArgsConstructor
public class Controller34 {

    private final Mapper05 mapper;

    // 해당월의 직원별 매출액 조회
    // /main34/sub1?year=1997&month=7
    @GetMapping("sub1")
    public void method1(Integer year, Integer month, Model model) {
        // 1997-07-01
        String from = "%d-%02d-01".formatted(year, month);
        // 1997-07-31
        String to = "%d-%02d-31".formatted(year, month);

        List<Mapper05.EmployeeIncome> value = mapper.selectIncomeList(from, to);
        value.forEach(System.out::println);
        model.addAttribute("incomeList", value);
    }
}
