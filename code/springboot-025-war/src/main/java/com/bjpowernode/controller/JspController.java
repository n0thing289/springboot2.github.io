package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JspController {

    @RequestMapping("/jsp/main")
    @ResponseBody
    public String main() {
        return "main()...";
    }
}
