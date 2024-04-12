package com.study.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("main18")
public class Controller18 {
    // 상품1 키보드
    @RequestMapping("sub1")
    public void sub1(String product,
                     Integer quantity,
                     HttpSession session) {

        if (quantity == null) {
            return;
        }

        HashMap<String, Integer> cart = (HashMap<String, Integer>) session.getAttribute("cart");

        if (cart == null) {
            cart = new HashMap<String, Integer>();
            session.setAttribute("cart", cart);
        }

        // cart에 product가 이미 있으면 quantity 더하기
        //                      없으면 (product, quantity) 추가
        if (cart.containsKey(product)) {
            Integer oldQuantity = cart.get(product);
            cart.put(product, oldQuantity + quantity);
        } else {
            cart.put(product, quantity);
        }

    }

    // 상품2 모니터
    @RequestMapping("sub2")
    public void sub2(String product, Integer quantity, HttpSession session) {
        if (quantity == null) {
            return;
        }

        HashMap<String, Integer> cart = (HashMap<String, Integer>) session.getAttribute("cart");

        if (cart == null) {
            cart = new HashMap<String, Integer>();
            session.setAttribute("cart", cart);
        }

        // cart에 product가 이미 있으면 quantity 더하기
        //                      없으면 (product, quantity) 추가
        if (cart.containsKey(product)) {
            Integer oldQuantity = cart.get(product);
            cart.put(product, oldQuantity + quantity);
        } else {
            cart.put(product, quantity);
        }
    }

    // 상품3 사탕
    @RequestMapping("sub3")
    public void sub3(String product, Integer quantity, HttpSession session) {
        if (quantity == null) {
            return;
        }

        HashMap<String, Integer> cart = (HashMap<String, Integer>) session.getAttribute("cart");

        if (cart == null) {
            cart = new HashMap<String, Integer>();
            session.setAttribute("cart", cart);
        }

        // cart에 product가 이미 있으면 quantity 더하기
        //                      없으면 (product, quantity) 추가
        if (cart.containsKey(product)) {
            Integer oldQuantity = cart.get(product);
            cart.put(product, oldQuantity + quantity);
        } else {
            cart.put(product, quantity);
        }
    }

    // 장바구니
    @RequestMapping("sub4")
    public void sub4() {
    }
}
