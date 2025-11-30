package com.example.tutorial;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String getGreeting() {
        return "Hi it's me Don and I like gambling";
    }
}
