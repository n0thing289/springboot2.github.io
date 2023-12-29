package com.weikai.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    //解决跨域
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // 允许哪个请求头
                .allowedHeaders("*")
                // 允许哪个方法跨域
                .allowedMethods("*")
                // 允许哪个请求来源进行跨域
//                .allowedOrigins("*")
                .allowedOriginPatterns("*")
                // 是否允许携带cookie进行跨域
                .allowCredentials(true);
//                .exposedHeaders("*");

    }
}
