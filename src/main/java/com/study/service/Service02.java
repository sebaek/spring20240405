package com.study.service;

import com.study.mapper.Mapper06;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Service02 {
    private final Mapper06 mapper;

    public void transferMoney1() {
        // 강인이 돈 500 빼기
        mapper.minusMoney();
        // 흥민이 돈 500 더하기
        mapper.plusMoney();
    }

    @Transactional
    public void transferMoney2() {
        // 강인이 돈 500 빼기
        mapper.minusMoney();

        if (true) {
            throw new RuntimeException();
        }

        // 흥민이 돈 500 더하기
        mapper.plusMoney();
    }
}
