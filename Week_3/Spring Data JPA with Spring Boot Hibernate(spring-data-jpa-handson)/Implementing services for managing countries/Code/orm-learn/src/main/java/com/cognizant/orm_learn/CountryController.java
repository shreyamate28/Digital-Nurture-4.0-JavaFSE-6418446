package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{code}")
    public Optional<Country> getCountryByCode(@PathVariable String code) {
        return countryService.findCountryByCode(code);
    }

    @GetMapping("/search")
    public List<Country> searchCountries(@RequestParam String name) {
        return countryService.findCountriesByName(name);
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.findAllCountries();
    }

    @PostMapping
    public ResponseEntity<String> addCountry(@RequestBody Country country) {
        countryService.addCountry(country);
        return new ResponseEntity<>("Country added successfully", HttpStatus.CREATED);
    }
}
