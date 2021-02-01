package com.test.demo.service.impl;

import com.test.demo.service.TestService;
import com.test.demo.utils.Plus;
import org.springframework.stereotype.Service;

/**
 * @Author: Chen Xinwei
 * @Date: 2021/2/1 10:07 上午
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public Long testForLoop(int num) {
        long sum = 0L;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        return sum;
    }

    @Override
    public Long testIf(int num) {
        if (num < 0) {
            num = -num;
        }
        if (num < 10) {
            return Plus.fact(num);
        } else {
            return Plus.summation(num);
        }
    }

    @Override
    public String testChangeController(int num) {
        return String.valueOf(Plus.add(num, num));
    }

    @Override
    public String testChangeImpl(int num) {
        return String.valueOf(Plus.add(num, num));
    }

    @Override
    public String testChangeUtils(int num) {
        return String.valueOf(Plus.power(num));
    }
}
