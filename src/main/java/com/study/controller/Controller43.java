package com.study.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/main43")
public class Controller43 {

    // ResponseEntity 상태코드를 직접 명시해서 응답할 때
    @GetMapping("sub1")
    @ResponseBody // ResponseEntity 응답일 땐 생략 가능
    public ResponseEntity sub1() {

        return ResponseEntity.status(200).build();
    }

    @GetMapping("sub2")
//    @ResponseBody
    public ResponseEntity sub2() {
        return ResponseEntity.status(400).build();
    }
}
