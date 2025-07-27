package com.cognizant.orm_learn;

import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

public interface CountryService {
    // Hands on 6
    //Find a country based on country code

    Optional<Country> findCountryByCode(String code);

    List<Country> findCountriesByName(String partialName);

    List<Country> findAllCountries(); //

    @Transactional
    // Hands on 7
    //Add a new country
    void addCountry(Country country);

    Country updateCountry(Country country);

    void deleteCountry(String code);
}
