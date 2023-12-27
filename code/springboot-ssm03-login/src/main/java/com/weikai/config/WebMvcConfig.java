package com.weikai.config;

import com.weikai.controller.JWTHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    //解决跨域
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .allowedMethods("GET", "HEAD", "POST", "DELETE", "OPTIONS", "PUT")
//                .allowCredentials(true)
//                .maxAge(3600)
//                .allowedHeaders("*");
//    }



    //JWT拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new JWTHandlerInterceptor())
//                .addPathPatterns("/**")
//                .excludePathPatterns("/")
//                .excludePathPatterns("/index")
//                .excludePathPatterns("/login.html")
//                .excludePathPatterns("/css/**")
//                .excludePathPatterns("/js/**")
//                .excludePathPatterns("/plugins/**");
//    }

    //放行静态资源
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
//        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
//        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
//    }

}
