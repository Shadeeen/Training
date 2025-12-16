package com.example.springsecurity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {



    @GetMapping ("/signup")
    public ResponseEntity<Void> signup() {

        String accessToken =
                JwtUtil.generateAccessToken("shaden");

        String refreshToken =
                JwtUtil.generateRefreshToken("shaden");

        return ResponseEntity.ok()
                .header("Authorization", "Bearer " + accessToken)
                .header("Refresh-Token", refreshToken)
                .build();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/basic/hello")
    public String basicHello(){
        return "basic Hello";

    }

    @GetMapping("/public/hello")
    public  String publicHello(){
        return "public Hello";
    }
}
