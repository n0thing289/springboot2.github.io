package com.bjpowernode;

import com.bjpowernode.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Generated by https://start.springboot.io
// 优质的 spring/boot/data/security/cloud 框架中文文档尽在 => https://springdoc.cn
@SpringBootApplication
public class Springboot011CommandlinerunnerApplication implements CommandLineRunner {


    public static void main(String[] args) {
        System.out.println("SpringApplication.run之前");
        SpringApplication.run(Springboot011CommandlinerunnerApplication.class, args);
        System.out.println("SpringApplication.run之后");
    }

    @Resource(name = "userService")
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("run方法开始执行");
        userService.sayHello();
        System.out.println("run方法结束");
    }
}
