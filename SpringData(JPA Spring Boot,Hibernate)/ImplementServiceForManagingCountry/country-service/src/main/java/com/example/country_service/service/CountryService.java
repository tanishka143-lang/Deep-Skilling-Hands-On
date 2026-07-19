package com.example.country_service.service;

import com.example.country_service.model.Country;
import java.util.List;

public interface CountryService {

    List<Country> getAllCountries();

    Country getCountry(String code);

    Country addCountry(Country country);

    Country updateCountry(Country country);

    void deleteCountry(String code);
}