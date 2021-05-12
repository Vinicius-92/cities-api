package com.viniciusaugusto.citiesapi.cities.repositories;

import com.viniciusaugusto.citiesapi.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
