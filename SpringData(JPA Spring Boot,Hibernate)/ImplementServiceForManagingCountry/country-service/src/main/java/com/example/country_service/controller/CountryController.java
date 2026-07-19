package com.example.country_service.controller;

import com.example.country_service.model.Country;
import com.example.country_service.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping
    public List<Country> getAllCountries() {
        return service.getAllCountries();
    }

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return service.getCountry(code);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return service.addCountry(country);
    }

    @PutMapping
    public Country updateCountry(@RequestBody Country country) {
        return service.updateCountry(country);
    }

    @DeleteMapping("/{code}")
    public String deleteCountry(@PathVariable String code) {
        service.deleteCountry(code);
        return "Deleted Successfully";
    }
}