package com.pms.open_api.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ConfigurationProperties(prefix = "security")
public class JwtUtil {

    private static String appKey;

    private static String appSecurity;

    private static int appExpire;

    public static String createToken(){
        Date nowDate = new Date();
        //过期时间
        Date expireDate = new Date(nowDate.getTime() + appExpire * 1000);
        String token = JWT.create()
                .withExpiresAt(expireDate)
                .sign(Algorithm.HMAC256(appKey + appSecurity));

        return token;
    }

    public static DecodedJWT checkToken(String token){
        return JWT.require(Algorithm.HMAC256(appKey + appSecurity)).build().verify(token);
    }

    public void setAppKey(String appKey){
        JwtUtil.appKey = appKey;
    }

    public void setAppSecurity(String appSecurity){
        JwtUtil.appSecurity = appSecurity;
    }

    public void  setAppExpire(int appExpire){
        JwtUtil.appExpire = appExpire;
    }

}
