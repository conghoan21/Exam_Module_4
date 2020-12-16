package com.example.demo.repo;

import com.example.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {
    Country findByName(String name);
}
