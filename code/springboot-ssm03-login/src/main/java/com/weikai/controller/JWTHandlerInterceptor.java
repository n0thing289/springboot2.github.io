package com.weikai.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.weikai.exception.SystemException;
import com.weikai.utils.Code;
import com.weikai.utils.JWTUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class JWTHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("JWT拦截器拦截到了path: " + request.getRequestURL());
        //鉴权, 有没有token, 以及token对不对
        request.setCharacterEncoding("UTF-8");
//        String token = request.getParameter("token");//标准是放在请求头部,但是我没有学会用
        String token = request.getHeader("Authorization");
        if(token == null){
            token = request.getParameter("token");
        }

        System.out.println("JWT拦截器获取的token: "+token);
        try{
            JWTUtil.verify(token);
            System.out.println("JWT拦截器鉴权成功");
            return true;
        }catch(JWTVerificationException e){
            throw new SystemException(Code.VERIFY_ERR, "token验证失败");
        }catch(Exception e){
            throw new SystemException(Code.SYSTEM_UNKNOWN_ERR, "JWT拦截器异常");
        }
    }
}
