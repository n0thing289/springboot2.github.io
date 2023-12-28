package com.weikai.service.impl;

import com.weikai.mapper.UserMapper;
import com.weikai.pojo.User;
import com.weikai.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public boolean verify(User formUser) {
        //将表单的user的username传给数据库sql,返回User
        User dbUser = userMapper.selectByUsername(formUser.getUsername());
//        System.out.println(dbUser);

        //判断有没有这个用户
        if(dbUser == null){
            //验证失败
            return false;
        }
        //有这个用户那么判断密码是否一样
        if(formUser.getPassword().equals(dbUser.getPassword())){
            //验证成功
            return true;
        }
        return false;
    }
}
