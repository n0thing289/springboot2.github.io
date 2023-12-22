package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 先不用Rest风格
 */
@Controller
public class JspController {
    /**
     * 测试第一种访问jsp
     * @return
     */
    @RequestMapping("/useJsp")
    public String useJsp(){
        System.out.println("useJsp()...");
        return "use.Jsp";
    }

    public String useJsp2(){
        return "";
    }
}
