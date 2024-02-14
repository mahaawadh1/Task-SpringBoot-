package com.example.SpringBootProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, guest!";
    }

}
