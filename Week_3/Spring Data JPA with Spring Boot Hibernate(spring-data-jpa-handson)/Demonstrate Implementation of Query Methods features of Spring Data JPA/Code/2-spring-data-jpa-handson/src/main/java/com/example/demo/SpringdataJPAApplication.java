package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
 class SpringdatajpaDemoApplication implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringdatajpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Seed some countries
        countryRepository.save(new Country("US", "United States", LocalDate.of(1776, 7, 4)));
        countryRepository.save(new Country("IN", "India", LocalDate.of(1947, 8, 15)));
        countryRepository.save(new Country("GB", "United Kingdom", LocalDate.of(1922, 12, 6)));
        countryRepository.save(new Country("IS", "Iceland", LocalDate.of(1944, 6, 17)));
        countryRepository.save(new Country("FI", "Finland", LocalDate.of(1917, 12, 6)));
        countryRepository.save(new Country("AU", "Australia", LocalDate.of(1901, 1, 1)));
        countryRepository.save(new Country("NZ", "New Zealand", LocalDate.of(1907, 9, 26)));
        countryRepository.save(new Country("PL", "Poland", LocalDate.of(1918, 11, 11)));
        countryRepository.save(new Country("TH", "Thailand", LocalDate.of(1932, 6, 24)));

        System.out.println("=== Countries containing 'land' ===");
        List<Country> containingLand = countryRepository.findByCoNameContaining("land");
        containingLand.forEach(System.out::println);

        System.out.println("\n=== Countries starting with 'Uni' ===");
        List<Country> startingUni = countryRepository.findByCoNameStartingWith("Uni");
        startingUni.forEach(System.out::println);

        System.out.println("\n=== Countries containing 'land' sorted asc ===");
        List<Country> sortedLand = countryRepository.findByCoNameContainingOrderByCoNameAsc("land");
        sortedLand.forEach(System.out::println);

        System.out.println("\n=== Countries independent between 1900 and 1950 ===");
        List<Country> betweenDates = countryRepository.findByIndependenceDateBetween(
                LocalDate.of(1900, 1, 1), LocalDate.of(1950, 12, 31));
        betweenDates.forEach(System.out::println);

        System.out.println("\n=== Countries independent after 1920 ===");
        List<Country> after1920 = countryRepository.findByIndependenceDateGreaterThan(LocalDate.of(1920, 1, 1));
        after1920.forEach(System.out::println);

        System.out.println("\n=== Countries independent before 1900 ===");
        List<Country> before1900 = countryRepository.findByIndependenceDateLessThan(LocalDate.of(1900, 1, 1));
        before1900.forEach(System.out::println);

        System.out.println("\n=== Top 5 countries containing 'a' ===");
        List<Country> top5A = countryRepository.findTop5ByCoNameContaining("a");
        top5A.forEach(System.out::println);

        System.out.println("\n=== First country starting with 'A' ===");
        Optional<Country> firstA = countryRepository.findFirstByCoNameStartingWith("A");
        firstA.ifPresent(System.out::println);
    }
}
