package com.cognizant.springlearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {

        // Start Log
        System.out.println("START - sayHello()");

        String message = "Hello World RESTful Web Service";

        // End Log
        System.out.println("END - sayHello()");

        return message;
    }
}
