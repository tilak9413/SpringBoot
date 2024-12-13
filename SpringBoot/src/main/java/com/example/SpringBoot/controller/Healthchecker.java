package com.example.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthchecker {

    @GetMapping("/ok")
    public String checkHealth() {
        return "ok";
    }
}
