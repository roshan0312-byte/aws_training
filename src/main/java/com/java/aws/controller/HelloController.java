package com.java.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from EC2 🚀 by Roshan Shaw(Software Developer)";
    }

    @GetMapping("/about")
    public String about() {
        return "Welcome to my Spring Boot application deployed on AWS EC2 using GitHub Actions CI/CD!!!.";
    }
}
