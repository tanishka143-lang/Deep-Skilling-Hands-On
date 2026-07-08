package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {

        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return "{\"error\":\"Missing or invalid Authorization header\"}";
        }

        String encodedCredentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decodedString = new String(decodedBytes);

        String[] credentials = decodedString.split(":");
        String username = credentials[0];

        String token = jwtUtil.generateToken(username);

        return "{\"token\":\"" + token + "\"}";
    }
}