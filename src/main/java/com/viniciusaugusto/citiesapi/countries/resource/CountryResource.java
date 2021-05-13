package com.viniciusaugusto.citiesapi.countries.resource;

import com.viniciusaugusto.citiesapi.countries.entities.Country;
import com.viniciusaugusto.citiesapi.countries.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Country> coutries() {
        return repository.findAll();
    }
}
