package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProController {
    @GetMapping("/hello")
    public String greet(){
        return "Hello World!!" ;
    }
}
