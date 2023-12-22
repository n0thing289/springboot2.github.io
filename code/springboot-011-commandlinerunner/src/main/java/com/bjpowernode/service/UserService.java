package com.bjpowernode.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void sayHello(){
        System.out.println("UserService sayHello()...");
    }
}
