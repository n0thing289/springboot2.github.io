package com.bjpowernode.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boots")
public class BootController {

    @Value("${server.port}")
    private String port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${school.name}")
    private String schoolName;

    @Value("${site}")
    private String site;

    @GetMapping
    public String queryData(){
        return "port: " + port + ",项目地址: "+ contextPath +",学校名字: "+schoolName+",学校官网: "+site;
    }
}
