package com.study.service;

import com.study.mapper.Mapper08;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class Service04 {
    private final Mapper08 mapper;

    public void action1() {
        mapper.query1();
    }
}
