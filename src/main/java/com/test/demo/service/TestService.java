package com.test.demo.service;

/**
 * @Author: Chen Xinwei
 * @Date: 2021/2/1 10:08 上午
 */
public interface TestService {
    Long testForLoop(int num);

    Long testIf(int num);

    String testChangeController(int num);

    String testChangeImpl(int num);

    String testChangeUtils(int num);
}
