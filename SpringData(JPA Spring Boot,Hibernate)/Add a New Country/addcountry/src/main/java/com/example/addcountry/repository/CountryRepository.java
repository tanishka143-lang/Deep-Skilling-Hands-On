package com.example.addcountry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.addcountry.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
    Country findByCode(String code);
}