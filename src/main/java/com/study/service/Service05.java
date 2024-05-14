package com.study.service;

import com.study.mapper.Mapper09;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class Service05 {
    private final Mapper09 mapper;

    public String getCustomerName(Integer id) {
        return mapper.selectNameById(id);
    }
}
