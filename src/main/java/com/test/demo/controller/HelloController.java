package com.test.demo.controller;

import com.test.demo.service.HelloService;
import com.test.demo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @Resource
    TestService testService;

    @GetMapping("/index")
    public String index() {
        return "Greetings from Spring Boot " + helloService.hello(1, 2);
    }

    @GetMapping("/pageOne")
    public String pageOne() {
        return "Greetings from Page One " + helloService.sayPageOne(1);
    }

    @GetMapping("/testForLoop")
    public String testForLoop(@RequestParam("num") int num) {
        return "test For loop " + testService.testForLoop(num);
    }

    @GetMapping("/testIf")
    public String testIf(@RequestParam ("num") int num) {
        return "test If " + testService.testIf(num);
    }

    @GetMapping("/testChangeController")
    public String testChangeController(@RequestParam ("num") int num) {
        return "test change controller " + testService.testChangeController(num);
    }

    @GetMapping("/testChangeImpl")
    public String testChangeImpl(@RequestParam ("num") int num) {
        return "test change impl " + testService.testChangeImpl(num);
    }

    @GetMapping("/testChangeUtils")
    public String testChangeUtils(@RequestParam("num") int num) {
        return "test change utils " + testService.testChangeUtils(num);
    }
}
