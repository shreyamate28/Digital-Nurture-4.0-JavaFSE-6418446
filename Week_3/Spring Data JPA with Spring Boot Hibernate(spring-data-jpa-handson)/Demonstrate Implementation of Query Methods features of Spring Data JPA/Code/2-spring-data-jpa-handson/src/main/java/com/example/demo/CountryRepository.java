package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, String> {

    List<Country> findByCoNameContaining(String text);

    List<Country> findByCoNameStartingWith(String prefix);

    List<Country> findByCoNameContainingOrderByCoNameAsc(String text);

    List<Country> findByIndependenceDateBetween(LocalDate startDate, LocalDate endDate);

    List<Country> findByIndependenceDateGreaterThan(LocalDate date);

    List<Country> findByIndependenceDateLessThan(LocalDate date);

    List<Country> findTop5ByCoNameContaining(String text);

    Optional<Country> findFirstByCoNameStartingWith(String prefix);
}
