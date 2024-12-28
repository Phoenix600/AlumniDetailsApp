package com.s2pedutech.Alumini.controller;

import com.s2pedutech.Alumini.entity.City;
import com.s2pedutech.Alumini.entity.Country;
import com.s2pedutech.Alumini.entity.State;
import com.s2pedutech.Alumini.repository.CityRepository;
import com.s2pedutech.Alumini.repository.CountriesRepository;
import com.s2pedutech.Alumini.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    @Autowired
    private CountriesRepository countriesRepo;

    @Autowired
    private StateRepository stateRepo;

    @Autowired
    private CityRepository cityRepo;

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return countriesRepo.findAll();
    }

    @GetMapping("/states/{country_id}")
    public List<State> getStates(@PathVariable Long country_id) {
        return stateRepo.findByCountry_id(country_id);
    }

    @GetMapping("/cities/{state_id}")
    public List<City> getCities(@PathVariable Long stateId) {
        return cityRepo.findByState_id(stateId);
    }
}

