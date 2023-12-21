package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//@Controller + @ResponseBody
@RequestMapping("/hellos")
public class HelloSpringBoot {

    @GetMapping
    public String sayHello(){
        System.out.println("Hello SpringBoot!");
        return "{'module':'sayHello() HelloSpringBoot'}";
    }
}
