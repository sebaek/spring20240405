package com.study.service;

import com.study.mapper.Mapper06;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
// service 내 모든 메소드에 적용됨
@Transactional(rollbackFor = Exception.class)
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

    @Transactional
    public void transferMoney3() throws Exception {
        // 강인이 돈 500 빼기
        mapper.minusMoney();

        if (true) {
            throw new Exception();
        }

        // 흥민이 돈 500 더하기
        mapper.plusMoney();
    }

    @Transactional(rollbackFor = Exception.class)
    public void transferMoney4() throws Exception {
        // 강인이 돈 500 빼기
        mapper.minusMoney();

        if (true) {
            throw new Exception();
        }

        // 흥민이 돈 500 더하기
        mapper.plusMoney();
    }

    @Transactional
    public void transferMoney5() {
        // 강인이 돈 500 빼기
        mapper.minusMoney();


        if (true) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


        // 흥민이 돈 500 더하기
        mapper.plusMoney();
    }
}
