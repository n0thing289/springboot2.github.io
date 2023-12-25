package com.bjpowernode.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloThymeleafController {

    @RequestMapping("/hello")
    public String hello(Model model, HttpServletRequest request){
        //request域中绑定数据
        request.setAttribute("data", "欢迎使用thymeleaf模板引擎");
        //指定视图
        //逻辑名称
        return "hello"; //跳转到hello页面
    }
}
