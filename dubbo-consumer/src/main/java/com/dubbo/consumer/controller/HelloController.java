package com.dubbo.consumer.controller;

import com.dubbo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String hello() {
        return "consumer"+userService.getUserName("张三");
    }
}
