package com.viniciusaugusto.citiesapi.states.repository;

import com.viniciusaugusto.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
