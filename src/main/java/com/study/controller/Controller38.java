package com.study.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller38 {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/path1")
    @PreAuthorize("isAuthenticated()")
    // https://docs.spring.io/spring-security/reference/5.8/servlet/authorization/expression-based.html
    public void path1() {
        System.out.println("Controller38.path1");
    }
}
