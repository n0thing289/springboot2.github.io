package jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.Verification;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestJwt {

    @Test
    public void createJwt(){//头部.负载.签名
        Map<String, Object> map = new HashMap<>();
        String token = JWT.create()
//                .withHeader(map);//可以不指定头部, 使用默认
                .withClaim("username", "root")
                .withClaim("password", 111)
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000*60*60*24))//1000*60*60*24 = 24h
                .sign(Algorithm.HMAC256("黄炜开66"));
        System.out.println(token);
        //eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXNzd29yZCI6MTExLCJleHAiOjE3MDM2NTcxNjYsInVzZXJuYW1lIjoicm9vdCJ9.XSlvwN8nSGLsUmwXhv5Gkb3igP49WabaBlnaRXAmktQ
    }

    @Test
    public void resolveJwt(){
        //获取到的token
        String token =
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9." +
                "eyJwYXNzd29yZCI6MTExLCJleHAiOjE3MDM2NTcyOTksInVzZXJuYW1lIjoicm9vdCJ9." +
                "MyE9MTUQdk8j02B07RDxqc52ZsEIj8bnONjqyQNIdI4";//算法HMAC256 签名sign

        String token2 =
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9." +
                "eyJwYXNzd29yZCI6MTExLCJleHAiOjE3MDM2NTc5MDUsInVzZXJuYW1lIjoicm9vdCJ9." +
                "MPol6AGBbe2aCM_y022bX6Cb1iDEF_jv6leJANoFtIw";//算发HMAC256 签名sign111

        //拿到token验证 (根据算法和签名)
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256("sign")).build();
//        verifier.verify(token2);
        /**
         以上两行代码就已经完成验证了，如果没有出异常，就验证成功！
         出现了就是验证失败 ，前提要保证算法一定要一致，不要出现算法不一致异常
         */

        // decode只能拿数据但是不能用来验证
        DecodedJWT decode = JWT.decode(token2);
        Claim username = decode.getClaim("username");
        System.out.println(username);
        Claim password = decode.getClaim("password");
        System.out.println(password);
    }
}
