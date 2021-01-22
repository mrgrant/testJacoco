package com.test.demo.controller;

import com.test.demo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Chen Xinwei
 * @Date: 2021/1/22 2:01 下午
 */
@RestController
public class HelloController {
    @Resource
    HelloService helloService;

    @GetMapping("/index")
    public String index() {
        return "Greetings from Spring Boot" + helloService.hello(1, 2);
    }
}
