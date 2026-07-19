package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
	}

	@PostConstruct
	public void test() {
		getCountryTest();
	}

	private void getCountryTest() {

		LOGGER.info("Start");

		try {
			Country country = countryService.findCountryByCode("IN");
			LOGGER.debug("Country: {}", country);
		} catch (CountryNotFoundException e) {
			LOGGER.error("Error: {}", e.getMessage());
		}

		LOGGER.info("End");
	}
}