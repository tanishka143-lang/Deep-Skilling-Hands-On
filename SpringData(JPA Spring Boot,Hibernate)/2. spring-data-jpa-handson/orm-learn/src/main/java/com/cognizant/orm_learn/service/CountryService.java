package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Exercise 1
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // Exercise 2
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    // Exercise 3
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // Exercise 4
    public void updateCountry(Country country) {
        countryRepository.save(country);
    }

    // Exercise 5
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }
}