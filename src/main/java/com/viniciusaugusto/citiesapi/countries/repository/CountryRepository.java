package com.viniciusaugusto.citiesapi.countries.repository;

import com.viniciusaugusto.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
