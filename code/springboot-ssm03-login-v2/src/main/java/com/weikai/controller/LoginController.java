package com.weikai.controller;

import com.weikai.pojo.User;
import com.weikai.service.UserService;
import com.weikai.utils.Code;
import com.weikai.utils.JWTUtil;
import com.weikai.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logins")
public class LoginController {

    @Resource
    private UserService userService;


    @GetMapping
    public Result loginVerifyToTest(User formUser) {
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

    /**
     * 验证并生成token给登录的用户
     * @param formUser
     * @return
     */
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
