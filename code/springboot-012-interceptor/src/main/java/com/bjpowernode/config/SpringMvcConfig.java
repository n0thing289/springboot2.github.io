package com.bjpowernode.config;

import com.bjpowernode.controller.LoginInterceptor;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    //获取拦截器对象
    @Resource
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //指定拦截的请求uri地址
        String path []= {"/user/**"};
        //指定不拦截的地址
        String excludePath  [] = {"/user/login"};
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns(path)
                .excludePathPatterns(excludePath);
    }
}
