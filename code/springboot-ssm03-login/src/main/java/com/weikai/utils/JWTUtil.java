package com.weikai.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.weikai.exception.SystemException;
import com.weikai.pojo.User;

import java.util.Date;

public class JWTUtil {
    private static final String sign = "sign";//签名
    private static final long time = 1000 * 60 * 60 * 24L;//持续时间

    public static String generateByUser(User formUser) {
        //生成token
        String token = JWT.create()
                .withClaim("username", formUser.getUsername())
                .withClaim("password", formUser.getPassword())
                .withExpiresAt(new Date(System.currentTimeMillis() + time))
                .sign(Algorithm.HMAC256(sign));
        return token;
    }

    public static boolean verify(String token) {
        int flag = 0;
        try {
            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(sign)).build();
            jwtVerifier.verify(token);
            flag++;
        } catch (JWTVerificationException e) {
            flag--;
            throw new SystemException(Code.LOGIN_VERIFY_ERR, "验证失败");
        }
        return flag == 1;
    }
}
