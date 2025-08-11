package com.dog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Swagger!";
    }
}