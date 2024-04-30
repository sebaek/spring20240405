package com.study.controller;

import com.study.service.Service04;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main37")
public class Controller37 {
    private final Service04 service;

    @GetMapping("sub1")
    public void method1() {
        service.action1();
    }
}
