package com.study.service;

import com.study.mapper.Mapper05;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Service01 {
    private final Mapper05 mapper05;

    public List<Mapper05.EmployeeIncome> employeeIncomeList(Integer year, Integer month) {
        // 1997-07-01
        String from = "%d-%02d-01".formatted(year, month);
        // 1997-07-31
        String to = "%d-%02d-31".formatted(year, month);

        return mapper05.selectIncomeList(from, to);
    }
}
