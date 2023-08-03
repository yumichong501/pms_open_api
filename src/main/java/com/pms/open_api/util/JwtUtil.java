package com.pms.open_api.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class JwtUtil {

    @Value("${security.jwt.appKey}")
    private String appKey;

    @Value("${security.jwt.appSecurity}")
    private String appSecurity;

    @Value("${security.jwt.appExpire}")
    private int appExpire;

    @Value("${security.jwt.appHeader}")
    private String appHeader;

    public String createToken(){
        Date nowDate = new Date();
        //过期时间
        Date expireDate = new Date(nowDate.getTime() + appExpire * 1000);
        String token = JWT.create()
                .withExpiresAt(expireDate)
                .sign(Algorithm.HMAC256(appKey + appSecurity));

        return token;
    }

    public Boolean checkToken(){
        return true;
    }

}
