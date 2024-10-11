package com.example.oauth_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String Greet(){
    return "Welcome to Auth Demo";
}
}
