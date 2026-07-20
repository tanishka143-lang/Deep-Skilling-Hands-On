package com.example.addcountry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.addcountry.model.Country;
import com.example.addcountry.service.CountryService;

@SpringBootApplication
public class AddcountryApplication implements CommandLineRunner {

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(AddcountryApplication.class, args);
	}

	@Override
	public void run(String... args) {
		testAddCountry();
	}

	private void testAddCountry() {
		Country country = new Country();
		country.setCode("US");
		country.setName("United States");

		countryService.addCountry(country);

		Country result = countryService.findCountryByCode("US");
		System.out.println(result);
	}
}