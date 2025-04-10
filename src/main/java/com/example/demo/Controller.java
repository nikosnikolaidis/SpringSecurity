package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String getHello(){
        return "hello";
    }

    @GetMapping("/secured")
    public String getSecuredHello(){
        return "hello secured!";
    }
    
}
