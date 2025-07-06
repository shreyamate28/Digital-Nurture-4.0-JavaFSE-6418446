package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> findAllCountries() {
        return countryRepository.findAll();
    }

   // Hands on 6
   //Find a country based on country code
    @Override
    public Optional<Country> findCountryByCode(String code) {
        return countryRepository.findById(code);
    }

    @Override
    public List<Country> findCountriesByName(String partialName) {
        return countryRepository.findByNameContainingIgnoreCase(partialName);
    }


    // Hands on 7
    //Add a new country
    @Override
    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Override
    public Country updateCountry(Country country) {
        if (countryRepository.existsById(country.getCode())) {
            return countryRepository.save(country);
        } else {
            throw new RuntimeException("Country with code " + country.getCode() + " not found");
        }
    }

    @Override
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }
}
