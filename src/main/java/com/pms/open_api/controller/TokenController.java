package com.pms.open_api.controller;

import com.pms.open_api.util.JsonResponse;
import com.pms.open_api.util.JwtUtil;
import com.pms.open_api.util.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;

@RestController
@RequestMapping("/token")
public class TokenController {

    /**
     * 获取token
     * @return
     */
    @GetMapping("/getToken")
    public JsonResponse getToken(){
        JwtUtil jwtUtil = new JwtUtil();
        String token = jwtUtil.createToken();

        HashMap result = new HashMap<>();
        result.put("token",token);
        return Response.success(result);
    }

}
