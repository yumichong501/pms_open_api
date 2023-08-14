package com.pms.open_api.interceptor;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pms.open_api.util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.HashMap;

@Slf4j
@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        try {
            DecodedJWT decodedJWT = JwtUtil.checkToken(token);
            return true;
        }catch (Exception exception){
            HashMap result = new HashMap();
            result.put("code",1);
            result.put("msg", "Token error!"+exception.getMessage());
            result.put("data",null);

            String json = new ObjectMapper().writeValueAsString(result);
            response.setContentType("application/json:charset=UTF=8");
            response.getWriter().println(json);

            return false;
        }
    }
}
