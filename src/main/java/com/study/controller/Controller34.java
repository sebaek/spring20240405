package com.study.controller;

import com.study.mapper.Mapper05;
import com.study.service.Service01;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main34")
@RequiredArgsConstructor
public class Controller34 {
    private final Service01 service;

    // 해당월의 직원별 매출액 조회
    // /main34/sub1?year=1997&month=7
    @GetMapping("sub1")
    public void method1(Integer year, Integer month, Model model) {


        List<Mapper05.EmployeeIncome> value = service.employeeIncomeList(year, month);
        model.addAttribute("incomeList", value);
        model.addAttribute("year", year);
        model.addAttribute("month", month);

    }

    // todo ; 해당월의 고객별 구매금액 조회 (구매금액이 높은 순)
    //   service01, mapper05 에 메소드만 추가해서 작성
    //   필요하면 dto(java bean)도 작성
    // /main34/sub2?year=1996&month=7
    @GetMapping("sub2")
    public void method2(Integer year, Integer month, Model model) {
        List<Map<String, Object>> list = service.customerPurchaseList(year, month);
        model.addAttribute("list", list);
        model.addAttribute("year", year);
        model.addAttribute("month", month);
    }
}
