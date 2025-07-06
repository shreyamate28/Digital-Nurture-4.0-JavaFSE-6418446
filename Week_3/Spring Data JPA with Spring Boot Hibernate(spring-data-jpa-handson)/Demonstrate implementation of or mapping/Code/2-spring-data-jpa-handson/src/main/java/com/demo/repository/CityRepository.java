package com.demo.repository;

import com.demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
    // default CRUD + paging and sorting available
}
