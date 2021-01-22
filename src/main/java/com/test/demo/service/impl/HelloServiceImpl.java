package com.test.demo.service.impl;

import com.test.demo.utils.Plus;
import com.test.demo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Author: Chen Xinwei
 * @Date: 2021/1/22 2:12 下午
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(int a, int b) {
        return String.valueOf(Plus.add(a, b));
    }

    @Override
    public String sayPageOne(int a) {
        return String.valueOf(Plus.add(a, a));
    }
}
