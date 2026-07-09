package com.cognizant.account.controller;

import com.cognizant.account.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/accounts/{number}")
    public AccountResponse getAccount(@PathVariable String number) {

        Loan loan = restTemplate.getForObject(
                "http://localhost:8081/loans/" + number,
                Loan.class
        );

        return new AccountResponse(number, loan);
    }
}