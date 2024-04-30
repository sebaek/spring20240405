package com.study.controller;

import com.study.service.Service02;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main35")
public class Controller35 {

    private final Service02 service;

    @GetMapping("sub1")
    public void sub1() {
        service.transferMoney1();
    }

    @GetMapping("sub2")
    public void sub2() {
        service.transferMoney2();
    }
}
