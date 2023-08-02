package com.pms.open_api.controller;

import com.auth0.jwt.JWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/token")
public class TokenController {
    @GetMapping("/getToken")
    public String getToken(){
        String token = "";

        return token;
    }
}
