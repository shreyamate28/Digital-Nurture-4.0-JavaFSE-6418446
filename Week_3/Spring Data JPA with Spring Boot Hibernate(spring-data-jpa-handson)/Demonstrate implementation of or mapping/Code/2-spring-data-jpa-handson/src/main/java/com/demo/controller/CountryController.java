package com.demo.controller;

import com.demo.entity.City;
import com.demo.entity.Country;
import com.demo.repository.CityRepository;
import com.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CityRepository cityRepository;

    // Create sample country with cities
    @PostMapping("/country-with-cities")
    public Country createCountryWithCities() {
        Country country = new Country("IN", "India");

        City city1 = new City("Mumbai", country);
        City city2 = new City("Delhi", country);

        country.setCities(Arrays.asList(city1, city2));

        // Save country cascades and saves cities
        return countryRepository.save(country);
    }

    // Fetch all countries with their cities
    @GetMapping("/countries")
    public java.util.List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
