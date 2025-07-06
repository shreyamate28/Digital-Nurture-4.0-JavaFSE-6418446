package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		testAddCountry();
	}

	public void testAddCountry() {
		// Create a new country
		Country newCountry = new Country();
		newCountry.setCode("ZZZ");
		newCountry.setName("Zanzibar");

		// Add the country
		countryService.addCountry(newCountry);

		// Retrieve it back
		Optional<Country> addedCountryOpt = countryService.findCountryByCode("ZZZ");

		// Check if added successfully
		if (addedCountryOpt.isPresent()) {
			Country addedCountry = addedCountryOpt.get();
			System.out.println("Country added successfully: " + addedCountry.getCode() + " - " + addedCountry.getName());
		} else {
			System.out.println("Failed to add country.");
		}
	}
}
