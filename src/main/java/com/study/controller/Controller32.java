package com.study.controller;

import com.study.mapper.Mapper03;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main32")
public class Controller32 {

    private final Mapper03 mapper;

    @RequestMapping("sub1")
    public void method1() {
        int rowCount = mapper.deleteOneCustomer();
        System.out.println(rowCount + "명 고객 삭제됨");
    }

    // /main32/sub2?cid=5
    @RequestMapping("sub2")
    public void method2(Integer cid) {
        int rowCount = mapper.deleteOneCustomerById(cid);
        System.out.println(rowCount + "명 고객 삭제됨");
    }

    // todo ;
    //  /main32/sub3?eid=2
    //   2번 직원 삭제하는 메소드와 mapper에 메소드 작성하기
    @GetMapping("sub3")
    public void method3(Integer eid) {
        int rows = mapper.deleteEmployeeById(eid);

        System.out.println(rows + "명 직원 삭제됨");
    }
}
