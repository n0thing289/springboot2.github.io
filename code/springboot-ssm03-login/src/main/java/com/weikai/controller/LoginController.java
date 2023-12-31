package com.weikai.controller;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.weikai.pojo.User;
import com.weikai.service.UserService;
import com.weikai.utils.Code;
import com.weikai.utils.JWTUtil;
import com.weikai.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController//@Controller + @ResponseBody
@RequestMapping("/logins")
public class LoginController {

    @Resource
    private UserService userService;

    @PostMapping
    public Result loginVerify(@RequestBody User formUser) {
        //验证登录
        boolean flag = userService.verify(formUser);

        //
        String token = null;
        if(flag){
            token = JWTUtil.generateByUser(formUser);
        }

        //验证成功应该给用户token
        return new Result(flag ? Code.VERIFY_OK : Code.VERIFY_ERR, token, null);
    }
}
