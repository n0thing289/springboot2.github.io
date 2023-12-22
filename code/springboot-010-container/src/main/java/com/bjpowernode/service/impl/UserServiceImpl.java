package com.bjpowernode.service.impl;

import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Service;

//@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public void sayHello() {
        System.out.println("sayHello()...");
    }
}
