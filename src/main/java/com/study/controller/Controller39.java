package com.study.controller;

import com.study.service.Service05;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class Controller39 {
    private final Service05 service;

    // /api/customer?id=3
    @GetMapping("/api/customer")
    @ResponseBody
    public String customerName(Integer id) {
        return service.getCustomerName(id);
    }
}
