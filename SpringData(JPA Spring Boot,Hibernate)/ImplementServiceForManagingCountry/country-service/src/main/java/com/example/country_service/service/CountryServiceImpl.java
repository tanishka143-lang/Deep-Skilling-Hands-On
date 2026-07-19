package com.example.country_service.service;

import com.example.country_service.model.Country;
import com.example.country_service.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    @Override
    public Country getCountry(String code) {
        Optional<Country> country = repository.findById(code);
        return country.orElse(null);
    }

    @Override
    public Country addCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public void deleteCountry(String code) {
        repository.deleteById(code);
    }
}