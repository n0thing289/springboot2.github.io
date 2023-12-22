package com.bjpowernode.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/user/login")
    @ResponseBody
    public String login(HttpServletRequest request) {
        return "UserController login(HttpServletRequest request = " + request + ") 执行";
    }

    @RequestMapping("/user/account")
    @ResponseBody
    public String account(HttpServletRequest request) {
        return "UserController account(HttpServletRequest request = " + request + ") 执行";
    }
}
