package com.security.securityDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping
    public String publicEndpoint() {
        return "Welcome to the public endpoint!";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Welcome, authenticated user!";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Welcome, admin!";
    }
}
