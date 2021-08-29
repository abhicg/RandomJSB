package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private GreetingService greetingService;

    public HomeController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, World";
    }
}
