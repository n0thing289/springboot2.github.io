package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boots")
public class BootController {
    @GetMapping
    public String doSome(){

        return "{'doSome':'测试多环境'}";
    }
}
