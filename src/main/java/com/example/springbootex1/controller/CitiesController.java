package com.example.springbootex1.controller;

import com.example.springbootex1.repository.CitiesRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitiesController {
    CitiesRepository citiesRepository = new CitiesRepository();

    @PostMapping("")
    public String create(@RequestParam String citiesName){
        return citiesRepository.create(citiesName);
    }
}
