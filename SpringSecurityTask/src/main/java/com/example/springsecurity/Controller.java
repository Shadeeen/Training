package com.example.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

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
