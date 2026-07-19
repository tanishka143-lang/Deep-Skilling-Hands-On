package com.example.country_service;

import com.example.country_service.model.Country;
import com.example.country_service.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryServiceApplication implements CommandLineRunner {

	@Autowired
	private CountryService service;

	public static void main(String[] args) {
		SpringApplication.run(CountryServiceApplication.class, args);
	}

	@Override
	public void run(String... args) {

		System.out.println("---- Adding Country ----");
		service.addCountry(new Country("IN", "India"));
		service.addCountry(new Country("US", "USA"));

		System.out.println("---- Fetch All ----");
		service.getAllCountries().forEach(c -> System.out.println(c.getName()));

		System.out.println("---- Fetch One ----");
		System.out.println(service.getCountry("IN").getName());

		System.out.println("---- Update ----");
		service.updateCountry(new Country("IN", "Bharat"));

		System.out.println("---- Delete ----");
		service.deleteCountry("US");
	}
}